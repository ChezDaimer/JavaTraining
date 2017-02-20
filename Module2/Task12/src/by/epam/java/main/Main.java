package by.epam.java.main;

import by.epam.java.utils.Console;

public class Main {
	
	public static void main (String[] args) {
		
	  
	  Console console = new Console("Sum");
	  
	  int[] intArray;
	  int   sum      = 0;
	  
	  console.printMessage("Please enter integer value for multiplication...");
	  console.printMessage("Or enter \"Sum\" for calculating ...");	
	  
	  console.putInputToBuffer();
	  intArray = console.bufferIntArray();
	  
	  console.clearConsoleBuffer();
	  
	  
	  for (int i = 0; i < intArray.length; i++) {
		  
		  sum += intArray[i];  
	  }
	  
	  console.printMessage("Sum values is " + sum);
	  console.printMessage("End....");
	  console.close();
		
		
		
	}

}
