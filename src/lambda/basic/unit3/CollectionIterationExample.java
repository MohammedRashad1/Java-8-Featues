package lambda.basic.unit3;

import java.util.Arrays;
import java.util.List;

import ibs.lambda.basics.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Mohammed", "Rashad", 23),
				new Person("Jasim", "Anikkadan", 24),
				new Person("Mohammed", "Shabeer", 25),
				new Person("Adam", "Joan", 29)
				);
		
		System.out.println("--------------Using for loop:----------------");
		for(int i=0;i<people.size();i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("----------Using Enhanced for Loop:------------");
		
		for(Person p:people){
			System.out.println(p);
		}
		System.out.println("---------------Using ForEach Loop:------------");
		people.forEach(p->System.out.println(p));
//		people.forEach(System.out::println);

	}

}
