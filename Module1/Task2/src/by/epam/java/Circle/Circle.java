package by.epam.java.circle;

import static java.lang.Math.sqrt;
import static java.lang.Math.round;
import static java.lang.Math.PI;

public class Circle {

	private double radius;
	
	//-------------------------------------------------------
	public Circle ( double rd ) {
		
	  this.radius = rd;	
		
	}
	
	public Circle () {
		
		this.radius = 1.0;
	}
	//-------------------------------------------------------
	
	public void setRadius ( double rd ){
		
		this.radius = rd;
		
	}
	
	public double getRadius ( ) {
		
		
		return this.radius;
		
	}
	
	public double length () {
		
		return round(2 * PI * this.radius);
		
	}
	
	public double area () {
		
		return round(PI * sqrt(this.radius));
		
	}
	
	
	
}
