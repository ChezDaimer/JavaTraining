package by.epam.java.main;

import by.epam.java.utils.Calculating;


public class Main {
	
	public static void main (String[] args) {
		
		
        for (int i = 0; i < args.length; i++) {				    
			   
	    	Calculating.CalculateByValue(Integer.parseInt(args[i]));
	 
       }    	
		
       Calculating.CalculateFromConsole();
		    

		
		
		
	}

}
