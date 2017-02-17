package by.epam.java.console;

import java.util.Scanner;

public final class Console {

	
	
////////////////////////////////////////////////////main initialization//////////////////////////////////////////////		
	
	@SuppressWarnings("resource")	
	private static Scanner  scanner   = new Scanner(System.in);
	
	public  static int      arrLength = 1;
	private static int[]    intArr    = new int[arrLength];
	private static double[]	doubleArr = new double [arrLength];
	private static String[] strArr    = new String[arrLength];		

	private static String   BreakCondition = "N";
	
	public Console (int length, String cond) {
		
		arrLength     = length;		
		BreakCondition = cond;
		
	}

	
	
////////////////////////////////////////////////////validate//////////////////////////////////////////////	
	public static void validateInput() {
		
		
		if (scanner.hasNextInt()) {
			
			intArr[0] = scanner.nextInt();	
		
		} else if (scanner.hasNextDouble()) {
			
			doubleArr[0] = scanner.nextDouble();
		  
			
		} else {
			
			strArr[0] = scanner.next();
		 	
		}
	
	}

	
	  
////////////////////////////////////////////////////break//////////////////////////////////////////////	
  public static boolean isBreakCondition() {
	  
	  if  (BreakCondition.equals(strArr[0])) { return true; }
	  
	  return false;
  } 	

  
////////////////////////////////////////////////////message//////////////////////////////////////////////
  public static void outputMessage (String message) {
	  
	  System.out.println(message);
	  
  }
  
  
  //////////////////////////////////////////////////////get//////////////////////////////////////////////
  
  public static int getInt () {
	  
	  
	  return intArr[0];	  
  }
  
  public static double getDouble () {
	  
	  
	  return doubleArr[0];	  
  }
  
  public static String getStr () {
	  
	  
	  return strArr[0];	  
  }	
/////////////////////////////////////////////////////////////////////////////////////////////////////


}
