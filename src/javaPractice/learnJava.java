package javaPractice;

import java.util.Scanner;

public class learnJava {

	public static void main(String[] args) {
		switchPractice();
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
}

