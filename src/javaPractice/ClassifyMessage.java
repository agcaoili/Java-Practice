package javaPractice;

import java.util.Scanner;

public class ClassifyMessage {
	//declare enumeration
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN};
	public static void main(String[] args) {
		//initialize variables
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		//declare geographic boundaries
		final double SOUTH = 39.882343;
		final double NORTH = 40.231315;
		final double WEST = -105.743511;
		final double EAST = -104.907864;
		
		//scanner takes in formatted message and assigns portions to variables
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a formatted message: ");
		catString = input.next();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine().trim();
		input.close();
		
		//if statements determine message category based on catString
		if(catString.equalsIgnoreCase("fire")||(catString.equals("smoke"))){
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if(catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
		}
		else if(catString.equalsIgnoreCase("structure")||
				catString.equalsIgnoreCase("structure")||
				catString.equalsIgnoreCase("structure")){
			category = MessageCategory.INFO;
		}
		else{
			category = MessageCategory.UNKNOWN;
		}
		
		//determine if latitude and longitude are in range
		if((latitude >= SOUTH && latitude <= NORTH) && (longitude >= WEST && longitude <= EAST)) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		
		//print out info
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	}

}
