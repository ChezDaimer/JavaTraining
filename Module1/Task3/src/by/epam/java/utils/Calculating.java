package by.epam.java.utils;

import java.util.Scanner;

public class Calculating {
		
	private static String  INPUT = "";
	
	public static void CalculateFromConsole () {
		 @SuppressWarnings("resource")		 
		 Scanner scanner = new Scanner(System.in);
		 do {		  
			    
				System.out.println("Please, paste int value or N for exit: ");			
			 	if (scanner.hasNextInt()) {					
					
					System.out.println(" InputvValue is correct ");	
					System.out.println("Calculating result is " + calculate( scanner.nextInt() ) );
				    
				   
					
				} else if (scanner.hasNextDouble()) {
					
					System.out.println("Input data type is Double - value converted to Integer ");									
					System.out.println("Calculating result is " + calculate( (int) scanner.nextDouble() ) );
					
				} else {
					
					 INPUT = scanner.next();
					 if (INPUT.equals("N")) {
						 
						 System.out.println("Exit...");
						 break;
						 
					 } else {
						 
						 System.out.println("Value is incorrect..Please try again ");
					 }
										
					
				}
				
				
				
			} while (!INPUT.equals("N")) ;
		 
	 System.out.println("Finished!")	;
}
		 
	
	public static void CalculateByValue (int intVal) {
		
		
		System.out.println("Calculation result is " + calculate(intVal));
		
		
		
	}
	
	
	
		 
		
	private static int calculate (int intVal)	{		
	
		int multiplication = 1;
		
		while (intVal != 0 ) {
			
			multiplication *= intVal % 10;
			intVal /= 10;
			
		}

		
		return multiplication;		
	
	}
	
  	
//	private static int getCountOfDigits (int intVal) {
  		
//  		return(intVal == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(intVal) + 0.5));
  		
  		
//  	}
	
	


}
