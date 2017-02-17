package by.epam.java.Main;

import by.epam.java.utils.Console;
import static by.epam.java.utils.CalculatingMethods.calcMultiplicatonInt;


public class Main {
	
	public static void main (String[] args) {
		
	  
	  Console console = new Console("Exit");	  
	  while (!console.isBreakCondition()) {
		  
		  
		  console.printMessage("Please enter integer value for multiplication...");
		  console.printMessage("Or enter \"Exit\" for end ...");		  	
		  console.determineInputData();
		  
		  if (!console.isBreakCondition()) {			  
		        
			   console.printMessage("Multiplication is " + calcMultiplicatonInt(console.bufferInt()));
		       console.printMessage("Storage value is " + console.bufferInt());
		  
		  } else { break; }
		  
		  console.clearConsoleBuffer();
		  
	  } ;
	  
	  console.printMessage("End....");
	  console.clearConsoleBuffer();
	  console.close();
	  
	  
	 
		    

		
		
		
	}

}
