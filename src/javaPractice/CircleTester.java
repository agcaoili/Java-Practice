//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
package javaPractice;


public class CircleTester{
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		System.out.println(circle1.isUnitCircle());
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("radius: " + circle1.getRadius() + ", X coordinate: " + circle1.getX() +
				", Y coordinate: " + circle1.getY());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("radius: " + circle2.getRadius() + ", X coordinate: " + circle2.getX() +
				", Y coordinate: " + circle2.getY());
		
		// print circle1 diameter, area and perimeter
		System.out.println("Circle1 diameter: " + circle1.diameter() + ", Area: " + circle1.area() +
				", Perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Circle2 diameter: " + circle2.diameter() + ", Area: " + circle2.area() +
				", Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()) {
			System.out.println("Circle1 is a unit circle");
		} else {
			System.out.println("Circle1 is not a unit circle");
		}
		
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle()) {
			System.out.println("Circle2 is a unit circle");
		} else {
			System.out.println("Circle2 is not a unit circle");
		}
		
		//test if circle1 and circle2 are identical
		if(circle1.equals(circle2)) {
			System.out.println("Circle1 and circle2 are the same circle.");
		} else {
			System.out.println("Circle1 and circle2 are not the same circle.");
		}
		
		//test to see if circle1 and circle2 are concentric
		if(circle1.isConcentric(circle2)) {
			System.out.println("Circle1 and circle2 are concentric.");
		} else {
			System.out.println("Circle1 and circle2 are not concentric.");
		}
		
		//display the distance between circle1 and circle2 centers using the distance() method
		System.out.println("The distance between the center of cirlce1 and circle 2 is " + circle1.distance(circle2));
		
		//test to see if circle1 and circle2 intersect
		if(circle1.intersects(circle2)) {
			System.out.println("Circle1 and circle2 intersect.");
		} else {
			System.out.println("Circle1 and circle2 do not intersect.");
		}

	}
	
}
