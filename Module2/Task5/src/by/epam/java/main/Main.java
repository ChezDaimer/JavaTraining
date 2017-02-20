package by.epam.java.main;

import by.epam.java.utils.Console;
import static by.epam.java.utils.CalculatingMethods.*;




public class Main {
	
	public static void main (String[] args) {
		
	  int[]    intArr;
	  double[] doubleArr;
	  double   sumDouble = 0;
	  int      sumInt = 0;
	  
	  
	  Console console = new Console("Calculate");	  
	  console.printMessage("Please type several numbers and then \"Calculate\"");	
	  
	  console.putInputToBuffer();
	  
	  doubleArr = console.bufferDoubleArray();
	  intArr    = console.bufferIntArray();
	  
	  if (doubleArr.length > 0 ) {
		  
		  sumDouble = Summing(doubleArr);
		  
	  } else if (intArr.length > 0 ) {
		  
		  sumInt = Summing(intArr);
		  
	  } else {
		  
		  console.printMessage("Incorrect values");
		  
	  }
	  console.clearConsoleBuffer();
	  
	  sumDouble += sumInt;
	  
	  console.printMessage("Result is " +  Math.round(sumDouble));
	  
	  
	  
	  
	  console.printMessage("End....");	  
	  console.close();
	  
	  
	 
		    

		
		
		
	}

}
