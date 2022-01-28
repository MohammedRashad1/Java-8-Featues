package java8.features.basics;

import java.util.Optional;

public class OptionalMain {

	public static void main(String[] args) {
		
		Person person = new Person("Rashad", null);
		String email = person
				.getEmail()
				.map(String::toLowerCase)
				.orElse("Email not available");
		System.out.println(email);

	}
	
	

}
	class Person{
	
	private String name;
	private String email;
	
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}