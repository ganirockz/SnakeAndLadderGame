package com.capgemini;

public class SnakeAndLadder {
	public static int noPlay =0,ladder = 1,snake =2;
	public static void main(String[] args) {
		System.out.println("Welcome to snake and Ladder");
		int position = 0;
		int number_on_dice = (int) Math.floor(Math.random()*10)%6 +1;
		System.out.println("The number on the dice is: "+number_on_dice);
		int option = (int) Math.floor(Math.random()*10)%3;
		if(option == noPlay) {
			System.out.println("The Player remains on same position");
		}
		else if(option == ladder) {
			position += number_on_dice;
		}
		else if(option == snake) {
			position -= number_on_dice;
		}
	}
}
