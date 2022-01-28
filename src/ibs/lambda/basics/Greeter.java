package ibs.lambda.basics;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
//		Greeting helloWorld = new HelloWorldGreeting();
		Greeting lambdaFunction = ()-> System.out.println("Hello World");
		
		Greeting innerClassGreeting = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Inner class HelloWorld");
				
			}
		}; 
		
		greeter.greet(lambdaFunction);
		greeter.greet(innerClassGreeting);
		
//		greeter.greet(()-> System.out.println("Hello World!!"));
//		greeter.greet(helloWorld);
//		lambdaFunction.perform();
//		innerClassGreeting.perform();

	}

}
