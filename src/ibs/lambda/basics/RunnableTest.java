package ibs.lambda.basics;

public class RunnableTest {

	public static void main(String[] args) {
		
//		Thread myThread = new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				System.out.println("Printed inside runnable");
//				
//			}
//			
//		});
		
//		myThread.run();
		
		Thread myThreadLambda = new Thread(()->System.out.println("Printed inside lambda runnable"));
		myThreadLambda.run();

	}

}
