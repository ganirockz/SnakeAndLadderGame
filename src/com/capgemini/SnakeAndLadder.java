package com.capgemini;

public class SnakeAndLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to snake and Ladder");
		int position = 0;
		int number_on_dice = (int) Math.floor(Math.random()*10)%6 +1;
		System.out.println("The number on the dice is: "+number_on_dice);
	}
}
