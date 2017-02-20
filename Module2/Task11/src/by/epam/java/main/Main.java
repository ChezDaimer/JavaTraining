package by.epam.java.main;

import static by.epam.java.utils.CalcMethods.*;
import by.epam.java.utils.Console;

public class Main {
	
	public static void main (String[] args) {
		
	  
	  Console console = new Console();
	  int[]   intArray;
	  int     countOfValues = 0;
	  
	  
	  System.out.println("Please, type count of Integer values : ");	    
	  console.determineInputData();
	  countOfValues = console.bufferInt();
	  intArray = new int[countOfValues];
	  
	  generateIntegers(intArray,100);
	  processIntArray(intArray); 
	  
	  console.clearConsoleBuffer();
	  console.printMessage("End....");
	  console.close();
		
		
		
	}

}
