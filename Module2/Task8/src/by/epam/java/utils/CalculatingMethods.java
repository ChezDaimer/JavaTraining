package by.epam.java.utils;



public class CalculatingMethods {
	
		
	public static void calculateValues ()	{		
		
		double firstValuel, secondValue, thirdValue, temp = 0;
		
		firstValuel = Math.random();
		secondValue = Math.random();
		
		if (firstValuel !=  secondValue) {
			
			thirdValue = (long) Math.random();
			temp = firstValuel + secondValue + thirdValue;
			System.out.println("a + b + c = " + temp);
			temp =  Math.sqrt(firstValuel) + Math.sqrt(secondValue);
			System.out.println("a2 + b2 = " + temp);
			System.out.println("Have no favorite football team");
		
		} else {
			
			System.out.println("New Year is soon!");
		}
		
		
	}


}
