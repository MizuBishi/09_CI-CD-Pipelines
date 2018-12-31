import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PersonTest {
	
	Person person;

	@BeforeEach
	public void createPerson() {
		person = new Person("John", "Doe");
	}
	
	/**
	 * verify that the constructor does not return a null value.
	 */
	@Test
	void testPerson() {
		assertNotNull(person);
	}

	/**
	 * verify that 
	 * 1. the firstname and 
	 * 2. the lastname are not null
	 * 3. the firstname is "John"
	 * 4. the lastname is "Doe"
	 * Guard 3 and 4 with 1 and 2 respectively.
	 */
	@Test
	void testName() {
		String firstname = person.getFirstName();
		String lastname = person.getLastName();
		
		assertEquals("John", firstname);
		assertEquals("Doe", lastname);
		
	}
	
    @Test
    void testNoOriginIsNull() {
        assertThat(person.getPlacesOfOrigin(), not(contains((String) null)));
    }
    
    @SuppressWarnings("unchecked")
	@Test
    void testPlacesOfOriginStartsNotNullAndLongerThan() {
    	
    	assertThat(person.getPlacesOfOrigin(), everyItem(allOf(notNullValue(), IsLongerThan.isLongerThan(3))));
    }
    
	
}
