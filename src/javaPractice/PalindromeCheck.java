package javaPractice;

import java.util.Scanner;

//This class will check to see if a word from user input is a palindrome

public class PalindromeCheck {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = input.nextLine();
		char[] letterArray = word.toCharArray();
		boolean possiblePal = true;
		
		//for loop compares the 
		for(int i = 0; i < word.length()/2; i++) {
			if(letterArray[i] != letterArray[word.length() - (i+1)] ) {
				System.out.println(word + " is not a palindrome.");
				possiblePal = false;
				break;
			}
		}
		if(possiblePal) {
			System.out.println(word + " is a palindrome.");
		}
	
	}

}
