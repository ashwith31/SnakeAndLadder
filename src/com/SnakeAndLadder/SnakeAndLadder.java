package com.SnakeAndLadder;

import java.util.Scanner;

public class SnakeAndLadder {

	final static int NO_PLAY=0;
	final static int LADDER=1;
	final static int SNAKE=2;
	final static int WINNING_POSITION=100;								//The Winning position is 100
	public static void main(String[] args) {
													
		System.out.println("Welcome to Snake and Ladder Problem");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of first player");
		String playerOneName=sc.next();
		int playerOneCount=func();
		System.out.println("Number of times "+playerOneName+" rolled the dice= "+playerOneCount);
		System.out.println("Enter the name of second player");
		String playerTwoName=sc.next();
		int playerTwoCount=func();
		System.out.println("Number of times "+playerTwoName+" rolled the dice= "+playerTwoCount);

		if(playerOneCount<playerTwoCount)
		{
			System.out.println(playerOneName+ " wins the game");
		}
		else
		{
			System.out.println(playerTwoName+ " wins the game");
		}
		
		
		System.out.println("The Game is finished....");
	}
	static int func()
	{
		int start=0;
		int count=0;
		while(start<WINNING_POSITION)
		{		
			
			int dice=(int)Math.floor((Math.random()*10 %6 ))+1;         //dice is rolled using random method
			System.out.println("The value of dice is "+dice);
			int option =(int)Math.floor((Math.random()*10 %3 ));        //option is selected using random method

		switch(option)
		{
				case NO_PLAY:
					System.out.println("You can't play this time");
					break;
				case LADDER:
					System.out.println("You got a LADDER");
					start +=dice;
					if(start>WINNING_POSITION)
					{
						start -=dice;
					}
					if(start !=WINNING_POSITION)
					{
						System.out.println("Playing again...");
					int dice2=(int)Math.floor((Math.random()*10 %6 ))+1;         
					if(start>WINNING_POSITION)
					{
						start -=dice2;
					}
					}
					System.out.println("Your position is "+start);
					break;
				case SNAKE:
					System.out.println("You got a SNAKE");
					start -=dice;
					if(start<0)
					{
						start=0;
					}
					System.out.println("Your position is "+start);
					
					break;
				default:
					break;	
	}
		count++;
		}
		return count;
	}
}
