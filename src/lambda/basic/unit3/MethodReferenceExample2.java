package lambda.basic.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import ibs.lambda.basics.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
			List<Person> people = Arrays.asList(
					new Person("Mohammed", "Rashad", 23),
					new Person("Jasim", "Anikkadan", 24),
					new Person("Mohammed", "Shabeer", 25),
					new Person("Adam", "Joan", 29)
					);
			
			System.out.println("Printing all Peoples in the List");
//			printConditionally(people,p->true,p->System.out.println(p));
			printConditionally(people,p->true,System.out::println);
			
	}	
		
		
		private static void printConditionally(List<Person> people,Predicate<Person>predicate, Consumer<Person>consumer) {
			for(Person p:people){
				if(predicate.test(p)){
					consumer.accept(p);
				}
					 
				
			}
			
		}

	}