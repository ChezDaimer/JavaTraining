package by.epam.java.utils;



public class CalcMethods {
	
		
		
	public static int getCountOfDoubles (int Count)	{		
	
	  return (int) (Math.random() * Count );
     
	
	}
	
	public static boolean isDevided ( double value, int devider) {
		
		
		
		if  ((int) Math.round(value) % devider == 0 ) {
			
			return true;
			
			
		}
		
		return false;
		
		
		
	}
	
	public static boolean isLessThan ( double value, int valueForCompare) {
		
		
		
		if  ((int) Math.round(value)  > valueForCompare ) {
			
			return true;
			
			
		}
		
		return false;
		
		
		
	}
	
	
	public static void proccessDoubles (int CountOfDoubles, int DoubleSize, int Devider , int valueForCompare) {
		
		double temp;
		int Count                       = getCountOfDoubles(CountOfDoubles);
		int isDevidedCounter            = 0;
		int isLessThanInputValueCounter = 0;
		
		
		for (int i = 0; i < Count ; i++) {
			
			temp = Math.random() * DoubleSize;
			
			System.out.println("Generated value is " + temp);
			
			isDevidedCounter += isDevided(temp,Devider) ? 1 : 0;
			isLessThanInputValueCounter += isLessThan(temp,valueForCompare) ? 1 : 0;
		}
		
		System.out.println("Values is devided by \"" + Devider + "\" " + isDevidedCounter);
		System.out.println("Values less than  \"" + valueForCompare + "\" " + isLessThanInputValueCounter);
		
		
	}


}
