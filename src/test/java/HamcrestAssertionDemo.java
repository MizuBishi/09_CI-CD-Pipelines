import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.nullValue;

import org.junit.jupiter.api.Test;


class HamcrestAssertionDemo {

    @Test
    void assertWithHamcrestMatcher() {
        assertThat(2 + 1, is(equalTo(3)));
    }
    
    @Test
    public void anyOfExampleReturnsTrueIfOneMatches() throws Exception {
		assertThat(
				"Helssslo",
				is(anyOf(nullValue(), instanceOf(String.class),
						equalTo("Goodbye"))));
		
		assertThat("test", anyOf(is("test2"), containsString("te")));
		assertThat("test", allOf(is("test"), containsString("te")));
    }

}