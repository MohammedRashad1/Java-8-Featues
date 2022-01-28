package ibs.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExcerciseSolutionJava8 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Mohammed", "Rashad", 23),
				new Person("Jasim", "Anikkadan", 24),
				new Person("Mohammed", "Shabeer", 25),
				new Person("Adam", "Joan", 29)
				);
		
		//step 1: sort list by last name;
		
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getFirstName()));
		
		//Step2: create a method print all elements in the list
		
		printConditionally(people,p->true);
		
		
		//Step 3: method for printing the person who as last name begin with A;
		

		System.out.println("-------------------Last Name Begins with A--------------");
		printConditionally(people, p->p.getLastName().startsWith("A") );
		
		System.out.println("-------------------First Name Begins with M--------------");
		printConditionally(people, p->p.getFirstName().startsWith("M"));
	}
	
	
	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p:people){
			if(condition.Test(p))
				System.out.println(p); 
			
		}
		
	}

}