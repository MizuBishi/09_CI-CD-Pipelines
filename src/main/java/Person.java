import java.util.ArrayList;

import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	
	/**
	 * a Person
	 * @param firstName non null, max 20 chars
	 * @param lastName non null, max 20 chars
	 */
	public Person(String firstName, String lastName) {
		if (firstName.length() > 20 || lastName.length() > 20) {
			throw new IllegalArgumentException();
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	
	public List<String> getPlacesOfOrigin() {
		List<String> result = new ArrayList<>();
		result.add("Bern");
		result.add("Basel");
		result.add("Zurich");
		return result;
	}
	
}
