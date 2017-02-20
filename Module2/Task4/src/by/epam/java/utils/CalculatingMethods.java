package by.epam.java.utils;

import java.lang.Math;


public class CalculatingMethods {
	
		
		
	public static int calcMultiplicatonInt (int intVal)	{		
	
		int multiplication = 1;
		
		if (intVal == 0) {
			
			return 0;
		}
		else {
		    while (intVal != 0 ) {
			
			multiplication *= intVal % 10;
			intVal /= 10;
		    }	

		    return multiplication;			
		}
			
	
	}
	
	//------------------------------------------------------------------------------------------------------
	
	public static int calcTriangleArea (int a , int b) {
		
		
		return  ( a * b ) / 2;
		
	}
	
	public static double calcTriangleArea (double a , double b) {
		
		
		return  ( a * b ) / 2;
		
	}	

	public static int calcTriangleHypotenuse (int a , int b) {
		
		
		return  (int) Math.sqrt(Math.sqrt(a) + Math.sqrt(b)) ;
		
	}	
	public static double calcTriangleHypotenuse (double a , double b) {
		
		
		return   Math.sqrt(Math.sqrt(a) + Math.sqrt(b)) ;
		
	}	
	//------------------------------------------------------------------------------------------------------

}
