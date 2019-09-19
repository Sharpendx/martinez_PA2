package martinez_p2;
import java.util.Scanner;
public class problem2 
{
	
	public static void main(String args[]) 
	{
		Scanner scn = new Scanner(System.in);
		int choice;
		
		//Ask the user which formula they want to use
		System.out.println("Welcome to your BMI calculator!\n" 
							+ "Enter 1 for Metric or 2 for Customary:");
		choice = scn.nextInt();
		
		//call the appropriate function
		if(choice == 1)
		{
			metricBMI();
		}
		else if(choice == 2)
		{
			usaBMI();
		}
		else
		{
			System.out.println("Sorry we could not help you. Goodbye!");
		}
		
		scn.close();
	}
	
	public static void metricBMI()
	{
		Scanner scr = new Scanner(System.in);
		double bodyMI = 0.0;
		double weightKg = 0.0;
		double heightM = 0.0;
		
		//ask user for weight in kg
		System.out.println("Enter your weight in kilograms:");
		weightKg = scr.nextDouble();
		
		//ask for height in meters
		System.out.println("Enter your height in meters:");
		heightM = scr.nextDouble();
		
		//calculate using kg/m^2
		bodyMI = weightKg / (heightM * heightM);
		
		//display bmi
		System.out.println("Your BMI is: " + bodyMI + "\n");
		
		//show the bmi chart and prompt user how they stack up
		System.out.println("Underweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + 
				           "Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater");
		scr.close();
	}
	
	public static void usaBMI()
	{
		Scanner scr = new Scanner(System.in);
		double bodyMI = 0.0;
		double weightLbs = 0.0;
		double heightIn = 0.0;
		
		//ask user for weight in lbs
		System.out.println("Enter your weight in pounds:");
		weightLbs = scr.nextDouble();
		
		//ask for height in inchs
		System.out.println("Enter your height in inches:");
		heightIn = scr.nextDouble();
		
		//calculate using ((703 * lbs) / in^2) 
		bodyMI = (703 * weightLbs)/(heightIn * heightIn);
		
		//display bmi
		System.out.println("Your BMI is: " + bodyMI + "\n");		
		
		//show the bmi chart and prompt user how they stack up
		System.out.println("Underweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + 
		           "Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater");
		scr.close();
	}
}
