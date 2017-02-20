package by.epam.java.utils;

import by.epam.java.utils.Console;

public class CalculatingMethods {
	
		
		
	public static int[] getArraySizeFromConsole () {
		
		  String bufferredDataType;
		  int[]  intArray;
		  int    arraySize = 1;
		  
		  Console console = new Console();
		  
		  console.printMessage("Please, type count of values : ");
		  
		  bufferredDataType = console.putDataAndReturnDataType();
		  
		  if (bufferredDataType.equals("int")) {
			  arraySize = console.bufferInt();
			  intArray = new int[arraySize];
		  } else if (bufferredDataType.equals("double")) {
			  arraySize = (int) console.bufferDouble();
			  intArray = new int[arraySize];
			  
		  } else {
			  
			  intArray = new int[arraySize];
			  console.printMessage("Incorect Value!");
			  
		  }
		  
		  console.clearConsoleBuffer();			    
		  console.close();
			    
		  return intArray;
			
		}
	
	public static void RunCalculate () {
		
		int[] intArray = getArraySizeFromConsole();
		int isMod2 = 0, isMod3 = 0, isLess3 = 0;
		
		
		
		for ( int i = 0; i < intArray.length ; i++) {
			
			intArray[i] = (int) (Math.random() * intArray.length) ;
			
			if (intArray[i] > 0 && (intArray[i]  % 2) == 0) {
				
				isMod2++;				
				
			} else if (intArray[i] > 0 && (intArray[i] % 3) == 0) {
				
				isMod3 += intArray[i];
				
			} 
				
				
		    if (Math.abs(intArray[i]) < 3)  { isLess3++; }
				

			System.out.println("Generated value is " + intArray[i]);	
			
		}
		
		System.out.println("Values multiples of two : " + isMod2);
		System.out.println("Sum of values multiples of three : " + isMod3);
		System.out.println("Values with mod < 3  : " + isLess3);
		
		
	}
	


}
