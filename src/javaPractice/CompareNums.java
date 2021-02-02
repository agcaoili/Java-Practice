package javaPractice;

public class CompareNums {
	
	//In this class, method overloading is utilized to create 3 methods named "max"
	//The max() methods pass in the range of 2 to 4 integers as arguments and will
	//output the largest integer
	
	//Define the first max() method with 2 arguments. The other methods will be created based on
	//this original method
	public static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//Define two more max() methods that can pass in additional arguments
	public static int max(int num1, int num2, int num3) {
		return max(max(num1,num2),num3);
	}
	
	public static int max(int num1, int num2, int num3, int num4) {
		return(max(max(num1,num2,num3),num4));
	}
	
	//Test the max() methods within the main method
	public static void main(String[] args) {
		int a = 1, b = -9, c = 7, d = 10;
		int larger2 = max(a,b);
		System.out.println("The larger of a and b is " + larger2);
		int largest3 = max(a,b,c);
		System.out.println("The largest of a, b, and c is " + largest3);
		int largest4 = max(a,b,c,d);
		System.out.println("The largest of a, b, c, and d is " + largest4);
	}

}
