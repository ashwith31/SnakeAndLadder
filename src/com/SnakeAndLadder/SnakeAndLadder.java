package com.SnakeAndLadder;

public class SnakeAndLadder {

	final static int NO_PLAY=0;
	final static int LADDER=1;
	final static int SNAKE=2;
	static int start=0;      											//start position is zero
	final static int WINNING_POSITION=100;								//The Winning position is 100
	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Problem");
		System.out.println("The Game is played by a single player");

		while(start<=WINNING_POSITION)
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
		}
		System.out.println("The Game is finished....");
	}
}
