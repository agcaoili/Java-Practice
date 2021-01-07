package javaPractice;

import java.util.Scanner;

/*The NetPay class will compute a person's gross and net pay based on 
 * hourly wage, hours worked, and various with holdings*/

public class NetPay {

	public static void main(String[] args) {
		//declare constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Create scanner and ask for user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many hours did you work this week?");
		int weeklyHours = scanner.nextInt();
		
		//Calculate gross pay
		double grossPay = weeklyHours * PAY_PER_HOUR;
		
		//Calculate deductions
		double federal = 0.01 * FEDERAL_TAX_PERCENT * grossPay;
		double state = 0.01 * STATE_TAX_PERCENT * grossPay;
		double ss = 0.01 * SS_PERCENT * grossPay;
		double medicare = 0.01 * MEDICARE_PERCENT * grossPay;
		
		//Total deductions and calculate net pay
		double totalDeductions = federal + state + ss + medicare;
		double netPay = grossPay - totalDeductions;
		
		//Output gross pay, net pay, and deductions neatly
		System.out.println("Hours per Week:\t\t" + weeklyHours + 
				"\nGross Pay:\t\t" + grossPay + "\nNetPay:\t\t\t" + netPay 
				+ "\n\nDeductions\nFederal:\t\t" + federal + "\nState:\t\t\t" 
				+ state + "\nSocial Security:\t" + ss + "\nMedicare:\t\t" 
				+ medicare);
		
	}

}
