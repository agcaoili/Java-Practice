package javaPractice;

import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated.");
		String str = input.nextLine();
		String newString;
		
		//initialize running boolean
		boolean running = true;
		
		//create while loop that runs until the user inputs the "quit" command
		while(running) {
			System.out.println("Enter your command (quit, print reverse, replace all, replace single, remove)");
			String cmd = input.nextLine();
			
			//print reverse command; uses a for loop to create a new string with the letters reversed
			if(cmd.equalsIgnoreCase("print reverse")) {
				newString = "";
				for(int i=str.length()-1; i>=0; i--) {
					newString = newString + str.charAt(i);
				}
				System.out.println(newString);
			}
			
			//replace all command used to replace all instances of a character in a 
			//string with a specified new character
			else if(cmd.equalsIgnoreCase("replace all")){
				System.out.println("Enter the character to replace.");
				String character = input.nextLine();
				
				//if the original string contains the character and if the character input is only 1 long
				if(str.contains(character) && character.length()==1) {
					newString = "";
					System.out.println("Enter the new character.");
					String newChar = input.nextLine();
					for(int i=0; i < str.length(); i++) {
						if(!Character.toString(str.charAt(i)).equals(character)) {
							newString = newString + Character.toString(str.charAt(i)); 
						}
						else {
							newString = newString + newChar;
						}
					}
					str = newString;
					System.out.println("Your new sentence is: " + str);
				}
				else {
					if(character.length() != 1) {
						System.out.println("Input was not a single character.");
					}
					else {
						System.out.println("Original string does not contain " + character);
					}
				}
			}
			
			//replace single command used to replace a specified instance of a character in the string with a new character
			else if(cmd.equalsIgnoreCase("replace single")){
				System.out.println("Enter the character to replace.");
				String character = input.nextLine();
				
				//if the original string contains the character and if the character input is only 1 long
				if(str.contains(character) && character.length()==1) {
					newString = "";
					int counter = 1;
					System.out.println("Enter the new character.");
					String newChar = input.nextLine();
					System.out.println("Which " + character + " would you like to replace?");
					int instance = input.nextInt();
					
					for(int i=0; i < str.length(); i++) {
						if(!Character.toString(str.charAt(i)).equals(character)) {
							newString = newString + Character.toString(str.charAt(i)); 
						}
						else {
							if(counter==instance) {
								newString = newString + newChar;
							}
							else {
								newString = newString + Character.toString(str.charAt(i)); 
							}
								counter += 1;
						}
					}
					str = newString;
					System.out.println("Your new sentence is: " + str);
				}
				else {
					if(character.length() != 1) {
						System.out.println("Input was not a single character.");
					}
					else {
						System.out.println("Error. The character you are trying to replace does not exist.");
					}
				}
			}
			
			//remove command removes all instances of a character
			else if(cmd.equalsIgnoreCase("remove")){
				System.out.println("Enter the character to remove.");
				String character = input.nextLine();
				
				//if the original string contains the character and if the character input is only 1 long
				if(str.contains(character) && character.length()==1) {
					newString = "";
					for(int i=0; i < str.length(); i++) {
						if(!Character.toString(str.charAt(i)).equals(character)) {
							newString = newString + Character.toString(str.charAt(i)); 
						}
					}
					str = newString;
					System.out.println("Your new sentence is: " + str);
				}
				else {
					if(character.length() != 1) {
						System.out.println("Input was not a single character.");
					}
					else {
						System.out.println("Error. The letter you are trying to remove does not exist.");
					}
				}
			}
			
			//quit command sets running boolean to false, ending the while loop
			else if(cmd.equalsIgnoreCase("quit")){
				running = false;
				input.close();
			}
			
			//case if user does not input any of the valid commands
			else {
				System.out.println("Invalid command. Try again.");
			}
		}


	}

}
