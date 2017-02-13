package by.epam.java.utils;

import java.util.Scanner;
import by.epam.java.circle.*;

public class Util {

	public static void calculateCircles () {
			 @SuppressWarnings("resource")
			 Scanner scanner = new Scanner(System.in);
			 String  input     = "";
			 System.out.println("Started!")	;	  
	
			 Circle temp  = new Circle();				
				 
				 do {		  
					    
						System.out.println("Please, paste value for Circle Radius or N for exit: ");			
					 	if (scanner.hasNextDouble()) {
							
							System.out.println("Value is correct ");
							temp.setRadius(scanner.nextDouble());
						
							System.out.println("Circle area is : " + temp.area());
						
							System.out.println("Circle length is : " + temp.length());
							
						} else if (scanner.hasNextInt()) {
							
							System.out.println("Value is correct ");
							temp.setRadius((double) scanner.nextInt());
							System.out.println("Circle area is : " + temp.area());
							
							System.out.println("Circle length is : " + temp.length());
							
						} else {
							
							 input = scanner.next();
							 if (input.equals("N")) {
								 
								 System.out.println("Exit...");
								 break;
								 
							 } else {
								 
								 System.out.println("Value is incorrect..Please press enter and try again ");
							 }
												
							
						}
						
						
						
					} while (!input.equals("N")) ;
				 
			 System.out.println("Finished!")	;
		 }
		
		
}

	

