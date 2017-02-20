package by.epam.java.utils;



public class CalcMethods {
	
		
		
	public static void generateIntegers (int[] intArray, int intSize) {
		
		for (int i = 0; i < intArray.length; i++) {
			
			
			intArray[i] = (int) (Math.random() * intSize );
			
		}
		
		
	}
	
	public static void processIntArray (int[] intArray) {
		
		int Counter = 0;
		int Sum     = 0;
		
		
		for (int i = 0; i < intArray.length; i++) {
			
			if (intArray[i] > 15 || intArray[i]  < 2) { Counter++; }
			
			if (intArray[i] % 5 == 4) { Sum+= intArray[i]; }
			
			
			
		}
		
		System.out.println( "Count of Values less than 2 and larger than 15 : " + Counter);
		
		System.out.println( "Sum of values with % 5 == 4  : " + Sum);
		
	}


}
