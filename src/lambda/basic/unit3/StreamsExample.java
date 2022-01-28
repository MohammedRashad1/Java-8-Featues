package lambda.basic.unit3;

import java.util.Arrays;
import java.util.List;



import ibs.lambda.basics.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Mohammed", "Rashad", 23),
				new Person("Jasim", "Anikkadan", 24),
				new Person("Mohammed", "Shabeer", 25),
				new Person("Adam", "Joan", 29)
				);
		
/*		people.stream()
		.filter(p->p.getFirstName().startsWith("M"))
		.forEach(p->System.out.println(p.getFirstName()));
*/		
		long Count = people.stream()
		.filter(p->p.getFirstName().startsWith("M"))
		.count();
		
		System.out.println(Count);

	}

}
