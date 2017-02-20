package by.epam.java.main;

import by.epam.java.utils.Console;
import static by.epam.java.utils.CalculatingMethods.*;


public class Main {
	
	public static void main (String[] args) {
		
	  
	  Console console = new Console("Exit");
	  
	  double a, b;
	  
	  console.printMessage("Please, type two cathetuses for triangle calculation...");  
	
		  
		  console.printMessage("1st cathetus : ");
		  console.determineInputData();  
		  a = console.bufferDouble();
		  
		  console.printMessage("2nd cathetus : ");		  
		  console.determineInputData();  
		  b = console.bufferDouble();
		  
		  console.printMessage("Area is " + calcTriangleArea(a,b));
		  console.printMessage("Hypotenuse is " + calcTriangleHypotenuse(a,b));	  
		  
	  
	  console.close();
	  
	  
	 
		    

		
		
		
	}

}
