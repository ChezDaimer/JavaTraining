package by.epam.java.utils;



public class CalculatingMethods {
	
		
		
	public static void calculateValues ()	{		
	
		long firstValuel, secondValue, thirdValue, temp = 0;
		
		firstValuel = (long) Math.random();
		secondValue = (long) Math.random();
		
		if (firstValuel > secondValue) {
			
			thirdValue = (long) Math.random();
			temp = secondValue + thirdValue;
			
		} else if (firstValuel < secondValue) {
			
			thirdValue = (long) Math.random();
			temp = firstValuel + secondValue + thirdValue;
			System.out.println("New Year!");
			
		} else {
			
			System.out.println("End");
		}
		
		
	}
}
