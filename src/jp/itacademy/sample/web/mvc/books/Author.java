package jp.itacademy.sample.web.mvc.books;

public class Author {
	
	private String firstName;
	private String lastName;
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}