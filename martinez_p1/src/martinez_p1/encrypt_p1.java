package martinez_p1;

import java.util.Scanner;

public class encrypt_p1 
{
	public static void main(String args[]) 
	{
		int numToBeEncrypt;
		//int encryptedNum;
		int firstNum;
		int secondNum;
		int thirdNum;
		int fourthNum;
		
		Scanner scr = new Scanner(System.in);
		//ask user for 4 digit number
		System.out.println("Please enter the number you'd like to encrypt: ");
		numToBeEncrypt = scr.nextInt();
		//use %, to find each number
		fourthNum = numToBeEncrypt % 10;
		thirdNum = ((numToBeEncrypt % 100) - fourthNum) / 10;
		secondNum = (((numToBeEncrypt % 1000) - (numToBeEncrypt % 100))) / 100;
		firstNum = (numToBeEncrypt - (numToBeEncrypt % 1000)) / 1000;
		
		firstNum = (firstNum + 7) % 10;
		secondNum = (secondNum + 7) % 10;
		thirdNum = (thirdNum + 7) % 10;
		fourthNum = (fourthNum + 7) % 10;
		
		System.out.println("Your encrypted number is: " + firstNum + secondNum + thirdNum + fourthNum);
		scr.close();
		
	}
}
