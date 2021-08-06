package com.SnakeAndLadder;

public class SnakeAndLadder {

	int start=0;      //start position is zero
	
	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Problem");
		System.out.println("The Game is played by a single player");
		
		int dice=(int)Math.floor((Math.random()*10 %6 ))+1;         //dice is rolled
		System.out.println("The value of dice is "+dice);
		
	}

}
