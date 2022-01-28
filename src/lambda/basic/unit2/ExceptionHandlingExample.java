package lambda.basic.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		
		int someNumbers[] = {1,2,3,4,5};
		int key = 0;
		
		process(someNumbers,key, wrapperLambda((value, k) ->System.out.println(value/k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer>consumer) {
		for(int i : someNumbers){
			consumer.accept(i, key);
			//key++;
		}
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer>consumer){
		return(value,k)->{
			try{
				consumer.accept(value, k);
			}catch(ArithmeticException e){
				System.out.println("Exception Occured");
			}
		};
	}

}
