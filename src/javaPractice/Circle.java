//*******************************************************
// Circle.java
//
// 
//*******************************************************
package javaPractice;


public class Circle {
	

	private double radius;      // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return x;	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newValue) {
		x = newValue;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newValue) {
		y = newValue;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newValue) {
		radius = Math.abs(newValue);
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return 2*radius;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI*radius*radius;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return Math.PI*2*radius;	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		return x==0 && y==0 && radius==1;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return "Center: (" + x + "," + y + ")\nRadius: " + radius;
	}
	
	//--------------------------------------------------------
	// equals - return true if radius of this circle is equal 
	//			to the radius of another circle and if the
	//			centers of the two circles are the same
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return radius == anotherCircle.getRadius() && x == anotherCircle.getX()
				&& y == anotherCircle.getY();
	}
	
	//--------------------------------------------------------
	// isConcentric - return true if radius of this circle is 
	//			*not* equal to the radius of another circle 
	//			and if the centers of the two circles are the same
	//--------------------------------------------------------
	public boolean isConcentric(Circle anotherCircle) {
		return radius != anotherCircle.getRadius() && x == anotherCircle.getX()
				&& y == anotherCircle.getY();
	}
	
	//--------------------------------------------------------
	// distance - use the distance formula to find the distance
	//			  between the centers of this cirlce and another
	//			  circle
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x-anotherCircle.getX(), 2) + Math.pow(y-anotherCircle.getY(), 2));
	}
	
	//--------------------------------------------------------
	// intersects - return true if the distance between this circle's
	// 				and another circle's centers is less than
	//				the sum of their radii
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return distance(anotherCircle) < radius + anotherCircle.getRadius();
	}

}