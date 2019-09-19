package martinez_p1;

import java.util.Scanner;

public class decrypt_p1 
{
	public static void main(String args[]) 
	{
		int numToBeDecrypt;
		int firstNum;
		int secondNum;
		int thirdNum;
		int fourthNum;
		
		Scanner scr = new Scanner(System.in);
		
		//ask user for 4 digit number
		System.out.println("Please enter the number you'd like to decrypt: ");
		numToBeDecrypt = scr.nextInt();
		
		//use %, to find each number
		fourthNum = numToBeDecrypt % 10;
		thirdNum = ((numToBeDecrypt % 100) - fourthNum) / 10;
		secondNum = (((numToBeDecrypt % 1000) - (numToBeDecrypt % 100))) / 100;
		firstNum = (numToBeDecrypt - (numToBeDecrypt % 1000)) / 1000;
		
		firstNum =  (firstNum + 3);
		secondNum = (secondNum + 3);
		thirdNum =  (thirdNum + 3);
		fourthNum = (fourthNum + 3);
		
		if(firstNum >= 10)
		{
			firstNum = firstNum - 10;
		}
		if(secondNum >= 10)
		{
			secondNum = secondNum - 10;
		}
		if(thirdNum >= 10)
		{
			thirdNum = thirdNum - 10;
		}
		if(fourthNum >= 10)
		{
			fourthNum = fourthNum - 10;
		}
		
		System.out.println("Your encrypted number is: " + firstNum + secondNum + thirdNum + fourthNum);
		scr.close();
	}
}
