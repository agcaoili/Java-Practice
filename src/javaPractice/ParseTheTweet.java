package javaPractice;

import java.util.Scanner;

public class ParseTheTweet {
	//This class will parse the contents of a formatted tweet to extract and present useful information
	//The tweet is formatted as follows:
	//#typ typeValue; #det detailValue; #loc locationValue; #lat latitude; #lng longitude;

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Input a tweet: ");
		String tweet = input.nextLine();
		
		//initialize tweet sections
		String type;
		String loc;
		String detail;
		double latitude;
		double longitude;
		
		//start and finish variables contain indices of where each substring starts and ends
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		
		//value is extracted using start and finish indices
		type = tweet.substring(start + 5, finish).toUpperCase().trim();
		//start and finish are redefined 
		start = finish + 2;
		finish = tweet.indexOf(";", start);
		
		loc  = tweet.substring(start + 5, finish).trim();
		start = finish + 2;
		finish = tweet.indexOf(";", start);
		
		detail = tweet.substring(start + 5, finish).trim();
		start = finish + 2;
		finish = tweet.indexOf(";", start);

		latitude  = Double.parseDouble(tweet.substring(start + 5, finish).trim());
		start = finish + 2;
		finish = tweet.indexOf(";", start);

		longitude  = Double.parseDouble(tweet.substring(start + 5, finish).trim());

		//print formatted information
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + loc);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
	}

}
