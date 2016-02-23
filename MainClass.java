package quiz1Question1Quarterback;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		//create a scanner able to accept user input
		
		//The following are variables used in the following equation
		System.out.print("Enter pass attempts: ");
		double passAttempts = userInput.nextDouble();
		
		System.out.print("Enter number of completion: ");
		double completionNumbers = userInput.nextInt();
		
		System.out.print("Enter passing yards: ");
		double passingYards= userInput.nextInt();
		
		System.out.print("Enter touchdown passes: ");
		double touchDownPasses = userInput.nextInt();
		
		System.out.print("Enter interception: ");
		double interceptions = userInput.nextInt();
		
		System.out.println(calculateRating(passAttempts, completionNumbers, passingYards, touchDownPasses, interceptions));
		//display the return value of the calulateRating
	}
	
	public static double calculateRating(double ATT, double COMP, double YDS, double TD, double INT)
	{
		double a = ((COMP/ATT) - 0.3)*5;
		double b = ((YDS/ATT)-3)*0.25;
		double c = (TD/ATT)*20;
		double d = 2.375 - ((INT/ATT)*25);
		//use these subequations to calculate rating
		
		return(((a+b+c+d)/6)*100);
	}

}
