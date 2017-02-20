package by.epam.java.utils;

import java.util.Scanner;
import java.util.ArrayList;

public class Console {	
	//@SuppressWarnings("resource")
////////////////////////////////////////////////////main initialization//////////////////////////////////////////////		
	
		
	private  static Scanner     scanner    = new Scanner(System.in);
	private  ArrayList<Integer> intList    = new ArrayList<Integer>();
	private  ArrayList<Double>  doubleList = new ArrayList<Double>();
	private  ArrayList<String>  strList    = new ArrayList<String>();
	private  static final String EMPTY = "";
	
	
	/*private  Integer[]          objIntegerArr;
	  private  Double[]           objDoubleArr;	
	  private  String[]           objStringArr; */
	
	private  String             BreakCondition;
	
	
	
	public Console (String BreakCondition_) {	
		
		this.BreakCondition = BreakCondition_;
	}
	
	public Console () {	
			
		this.BreakCondition = "No";
	}
	
////////////////////////////////////////////////////setters//////////////////////////////////////////////	
	
   public void SetBreakCondition (String BreakCondition_) {
	 
	  this.BreakCondition = BreakCondition_;
	 
   }	
//////////////////////////////////////////////////clear buffer ////////////////////////////////////////////
   
   public void clearConsoleBuffer() {
	   
	   intList.clear();
	   doubleList.clear();
	   strList.clear();
   }
   
   public void close() {
	   
	  scanner.close();
   }
   
////////////////////////////////////////////////////validate//////////////////////////////////////////////	
   public boolean isBreakCondition() {

	    if (strList.contains(BreakCondition)) {return true;}	   

	   return false;
   } 
////////////////////////////////////////////////////validate//////////////////////////////////////////////	
   public String putDataAndReturnDataType() {
		
		
		if (scanner.hasNextInt()) {
			
			intList.add(scanner.nextInt()) ;			
			return "int";
		
		} else if (scanner.hasNextDouble()) {
			
			doubleList.add(scanner.nextDouble());			
			return "double";
			
		} else {
			
			strList.add(scanner.next());
			
			return "alphanumeric";
		 	
		}	
		
} 
   
   public void determineInputData() {
		
		
		if (scanner.hasNextInt()) {
			
			intList.add(scanner.nextInt()) ;	
		
		} else if (scanner.hasNextDouble()) {
			
			doubleList.add(scanner.nextDouble());	  
			
		} else {
			
			strList.add(scanner.next());
		 	
		}	
		
}
  
   
////////////////////////////////////////////////////store input data//////////////////////////////////////////////		
	
 public void putInputToBuffer() {
		
	 	do {
	 		
	 		determineInputData();			
	 	}	
		while (!isBreakCondition()) ;
		
			
}

  
////////////////////////////////////////////////////message//////////////////////////////////////////////
  public void printMessage (String message) {
	  
	  System.out.println(message);
	  
  }
///////////////////////////////////////////////////transform types//////////////////////////////////////////////////
 public void toObjArray (Double[] objDouble) {

	doubleList.toArray(objDouble);	  

 }  
 
 public void toObjArray (String[] objString) {	  

	strList.toArray(objString);	  
 }

 public void toObjArray (Integer[] objInt) {
	intList.toArray(objInt);
 }
///////////////////////////////////////////////////transform types//////////////////////////////////////////////////  
  
 ////////////////////////////////////////////////////get////////////////////////////////////////////////////
///////////////////////////////////////////////////integer//////////////////////////////////////////////////
 public int[] bufferIntArray () {
	  
	  Integer[] objIntegerArr =  new Integer[intList.size()];	  
	  int[] intArr            =  new int[objIntegerArr.length];	  
	  
	  intList.toArray(objIntegerArr);	  
	  
	  for (int i = 0 ; i < objIntegerArr.length; i++) {	  
		  
		  intArr[i] = (int) objIntegerArr[i];
	      
	  }	  
   return intArr;
  } 

  public int bufferInt (int idx) {
	  
	  
	  return intList.get(idx);	  
  }
  
  public int bufferInt () {
	  
	  return intList.isEmpty() ? 0 : intList.get(intList.size() - 1) ;
	  
  }
//////////////////////////////////////////////////double/////////////////////////////////////////////////////////
  public double[] bufferDoubleArray()  {
      
	     Double[] objDoubleArr  = new Double[doubleList.size()];	     
	     double[] doubleArr     = new double[objDoubleArr.length];
	     
	     doubleList.toArray(objDoubleArr);
		 
		 for (int i = 0 ; i < objDoubleArr.length; i++) {		  
			  
			 doubleArr[i] = objDoubleArr[i];
		 }
		  
		  return doubleArr;
	  }  
	 
  public double bufferDouble (int idx) {	  
		  
		  return doubleList.get(idx);		  
	  } 
	  
  public double bufferDouble() {	  
		  
		  return doubleList.isEmpty() ? 0.0 : doubleList.get(doubleList.size() - 1); 
				  		  
 }  
///////////////////////////////////////////////////String//////////////////////////////////////////////////
 public String[] bufferStringArray () {

	 String[] objStringArr = new String[strList.size()];
	 String[] strArr =  new String[objStringArr.length];
     
	 strList.toArray(objStringArr);
	 
	 for (int i = 0 ; i < objStringArr.length; i++) {		  
	 strArr[i] = objStringArr[i];
	 }
	 return strArr;
	 
 }  
 public String bufferString () {  

	 return strList.isEmpty() ? EMPTY : strList.get(strList.size() - 1);	    
	 
 } 
 
 public String bufferString (int idx) {	  

	 return strList.get(idx);	    
 }

///////////////////////////////////////////////////END//////////////////////////////////////////////////
  
 

}
