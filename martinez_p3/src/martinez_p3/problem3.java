package martinez_p3;

import java.util.Scanner;

public class problem3 
{
	public static boolean proceed = true;
	
	public static void main(String args[]) 
	{
		Scanner scr = new Scanner(System.in);
		String[] topicsArr = {"YouTube","Tabletop Games","TV","Movies","Video Games"};
		int[][] ranks = new int[5][10];
		int[] totalRank = new int[5];
		float[] avgRank = new float[5];
		int currUser = 1;
		//let the user know the categories and what the survey is about
		println("This survey is about likelyhood of watching/using certain types of entertainment");
		println("Please enter a number 1-10, 1 least likely and 10 most likely");
		//execute the code for enter user
			do 
			{
				enterUserAnswer(currUser,ranks,topicsArr,scr);
				currUser++;
			}
			while(proceed);
		
			totalRank = totalArray(ranks,totalRank,currUser);
			avgRank = avgPerRank(totalRank,currUser);
			
			displayData(topicsArr,avgRank,ranks,totalRank);
			//checkWhatIsIn2DArray(ranks);
			//checkWhatIsInArray(totalRank);
			scr.close();
	}
	
	public static void enterUserAnswer(int currUser, int[][] ranks,String[] topicsArr, Scanner scr)
	{
		
		int topicOneRank;
		int topicTwoRank;
		int topicThreeRank;
		int topicFourRank;
		int topicFiveRank;
		int progress;
		//ask them about each topic
		for(int i = 0; i < 5; i++)
		{
			println("How does User " + currUser + " rank " + topicsArr[i] + "?");
			
			switch(i) 
			{
				case 0:
					topicOneRank = scr.nextInt() - 1;
					ranks[0][topicOneRank]++;
					break;
					
				case 1:
					topicTwoRank = scr.nextInt() - 1;
					ranks[1][topicTwoRank]++;
					break;
					
				case 2:
					topicThreeRank = scr.nextInt() - 1;
					ranks[2][topicThreeRank]++;
					break;
					
				case 3:
					topicFourRank = scr.nextInt() - 1;
					ranks[3][topicFourRank]++;
					break;
					
				case 4:
					topicFiveRank = scr.nextInt() - 1;
					ranks[4][topicFiveRank]++;
					break;
			}
		}
		
		//ask if they want to add another user's input
		println("Would you like to enter another user's input?");
		println("Enter 1 for Yes and 2 for No:");
		progress = scr.nextInt();
		
		if(progress == 1)
		{
			
		}
		else
		{
			proceed = false;
		}
		
	}
	
	public static int[] totalArray(int[][] ranks,int[] totalRank,int currUser)
	{	
		for(int i = 0; i < 5; i++)
		{
			for(int k = 0; k < 10; k++)
			{
				 totalRank[i] += ranks[i][k] * (k + 1);
			}
			
		}
		return totalRank;
	}
	
	public static void displayData(String[] topicsArr,float[] avgRank,int[][] ranks,int[] totalRank)
	{
		println("Here are the results!");
		println("               1 2 3 4 5 6 7 8 9 10  Avg Rank");
		
		for(int i = 0; i < 5; i++)
		{
			print(topicsArr[i]);
			switch (i)
			{
				case 0:
					print("       ");
					break;
				case 1:
					print("");
					break;
				case 2:
					print("            ");
					break;
				case 3:
					print("        ");
					break;
				case 4:
					print("   ");
					break;
			}
			for(int k = 0; k < 10; k++)
			{
				print(" " + ranks[i][k]);
			}
			print("        "+ avgRank[i]);
			println("");
		}
		
		findHighInArray(totalRank,topicsArr);
		findLowInArray(totalRank,topicsArr);
	}
		
	public static void println(String s)
	{
		System.out.println(s);
	}
	
	public static void print(String s)
	{
		System.out.print(s);
	}
	
	public static void findHighInArray(int[] totalRank,String [] topicsArr)
	{
		int tempHigh = 0;
		int numHigh = 0;
		
		for(int i = 0; i < 5; i++)
		{
			if(totalRank[i] > tempHigh)
			{
				tempHigh = totalRank[i];
				numHigh = i;
			}
		}
		println("The topic that recieved the highest score was " + topicsArr[numHigh] + " with a score of " + tempHigh);
		//return tempHigh;
	}
	
	public static void findLowInArray(int[] totalRank,String [] topicsArr)
	{
		int tempLow = 10000;
		int numLow = 0;
		
		for(int i = 0; i < 5; i++)
		{
			if(totalRank[i] < tempLow)
			{
				tempLow = totalRank[i];
				numLow = i;
				
			}
		}
		
		println("The topic that recieved the lowest score was " + topicsArr[numLow] + " with a score of " + tempLow);
		//return tempLow;
	}
	
	public static float[] avgPerRank(int[] totalRank,int currUser)
	{
		currUser--;
		float[] tempAvg = new float[5];
		for(int i = 0; i < 5; i++)
		{
			tempAvg[i] = totalRank[i] / currUser;
		}
		return tempAvg;
	}
}
