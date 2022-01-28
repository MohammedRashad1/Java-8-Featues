package ibs.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcerciseSolutionJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Mohammed", "Rashad", 23),
				new Person("Jasim", "Anikkadan", 24),
				new Person("Mohammed", "Shabeer", 25),
				new Person("Adam", "Joan", 29)
				);
		
		//step 1: sort list by last name;
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getFirstName());
			}
		});
		
		//Step2: create a method print all elements in the list
		
		printAll(people);
		
		System.out.println("---------------------------------------------------");
		
		//Step 3: method for printing the person who as last name begin with A;
		
//		lastName(people);
		System.out.println("-------------------Last Name Begins with A--------------");
		printConditionally(people, new Condition(){

			@Override
			public boolean Test(Person p) {
				
				return p.getLastName().startsWith("A");
			}
			
		});
		
		System.out.println("-------------------First Name Begins with M--------------");
		printConditionally(people, new Condition(){

			@Override
			public boolean Test(Person p) {
				
				return p.getFirstName().startsWith("M");
			}
			
		});
	}

//	private static void lastName(List<Person> people) {
//		for(Person p:people){
//			if(p.getLastName().startsWith("A"))
//				System.out.println(p); 
//			
//		}
//		
//	}
	
	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p:people){
			if(condition.Test(p))
				System.out.println(p); 
			
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p: people){
			System.out.println(p);
		}
		
	}
}

interface Condition{
	boolean Test(Person p);
}