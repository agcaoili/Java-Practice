package javaPractice;

import java.util.Scanner;

public class learnJava {

	public static void main(String[] args) {
		whileLoop();
	}
	public static void switchPractice() {

		System.out.println("Who are you?");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		boolean welcome = name.equals("Anthony") ? true : false;

		switch(name) {
		case "Anthony":
			System.out.println("Welcome my man");
			break;
		case "Angela":
			System.out.println("Get outta here");
			break;
		default:
			System.out.println("Try again later");
			break;
		}
	}
	
	public static void whileLoop() {
		//initialize the guess boolean and password string
		boolean correct = false;
		String password = "ambidextrous";

		//set loop to repeat while the 'correct' boolean is false
		while(correct == false) {
			System.out.println("What is the password?");
			Scanner scanner = new Scanner(System.in);
			String guess = scanner.nextLine();
			//password correct case
			if(password.equals(guess)) {
				System.out.println("Password correct. Welcome.");
				correct = !correct;
			}
			//password incorrect case
			else {
				System.out.println("Password incrorect. Try again.");
			}
		}
	}
}

