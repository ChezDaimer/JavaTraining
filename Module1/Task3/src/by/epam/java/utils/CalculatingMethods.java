package by.epam.java.utils;



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


}
