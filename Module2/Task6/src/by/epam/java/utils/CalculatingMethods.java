package by.epam.java.utils;

import by.epam.java.utils.Console;

public class CalculatingMethods {
	
		
		
   public static double CalcFormula (double a, double b, double c) {
	   
	   return  Math.sqrt(a) - Math.sqrt(b * c) + Math.log(Math.sqrt(b)+1);
   }
   
   
   public static double CalcFormula (int a, double b, double c) {
	   
	   return  Math.sqrt(a) - Math.sqrt(b * c) + Math.log(Math.sqrt(b)+1);
   }
   
   public static double CalcFormula (int a, int b, double c) {
	   
	   return  Math.sqrt(a) - Math.sqrt(b * c) + Math.log(Math.sqrt(b)+1);
   }
   
   
   public static double CalcFormula (double a, int b, double c) {
	   
	   return  Math.sqrt(a) - Math.sqrt(b * c) + Math.log(Math.sqrt(b)+1);
   }
   
   
   public static double CalcFormula (double a, int b, int c) {
	   
	   return  Math.sqrt(a) - Math.sqrt(b * c) + Math.log(Math.sqrt(b)+1);
   }
   
   public static double CalcFormula (int a, int b, int c) {
	   
	   return  Math.sqrt(a) - Math.sqrt(b * c) + Math.log(Math.sqrt(b)+1);
   }


   public static void Calculate () {
	   
	   
		  Console console = new Console();
	      
		  double a = 0;     double b = 0;     double c = 0;
		  String bufferDataType ;
		  
		  
		  console.printMessage("Please, type values for formula  a2-(bc)2+ln(b2+1) : ");
		  console.printMessage("a : ");
		  bufferDataType = console.putDataAndReturnDataType();
		  
		  if (bufferDataType.equals("int")) { 
			  a = (double) console.bufferInt(); 
			  
		  } else {
			  a = console.bufferDouble(); 
		  }
		  
		  console.printMessage("b : ");
		  bufferDataType = console.putDataAndReturnDataType();
		  
		  if (bufferDataType.equals("int")) { 
			  a = (double) console.bufferInt(); 
			  
		  } else {
			  a = console.bufferDouble(); 
		  }
		 
		  console.printMessage("c : ");
		  bufferDataType = console.putDataAndReturnDataType();
		  
		  if (bufferDataType.equals("int")) { 
			  a = (double) console.bufferInt(); 
			  
		  } else {
			  a = console.bufferDouble(); 
		  }
		  
		  ;
		  
		  console.printMessage("Result is " + Math.round(CalcFormula(a,b,c)));
		  
		  console.printMessage("End....");
		  console.clearConsoleBuffer();
		  console.close();
		  
		  	   
	   
	   
	   
   }
   
   
   
}
