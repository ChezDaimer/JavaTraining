package by.rdcentr.javatr.util;

public class Formula {
	
	public static void calculate () {
	 double a , b , c = 0 , p , s ;
	 
      a = 10;
      b = 5;

      c = Math.sqrt(a * a + b * b);
	  
	  p = a + b + c;
	  s = 0.5 * a * b;
	  
	  System.out.println("Perimeter = " + p + ", area = " + s);
		
		
	}

}

