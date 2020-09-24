package com.capgemini;

public class SnakeAndLadder {
	public static int noPlay =0,ladder = 1,snake =2;
	public static void main(String[] args) {
		System.out.println("Welcome to snake and Ladder");
		int position = 0, number_of_turns =0;
		while(position < 100) {
		int number_on_dice = (int) Math.floor(Math.random()*10)%6 +1;
		number_of_turns ++;
		System.out.println("The number on the dice is: "+number_on_dice);
		int option = (int) Math.floor(Math.random()*10)%3;
		if(option == noPlay) {
			System.out.println("The Player remains on same position");
		}
		else if(option == ladder) {
			if(position+number_on_dice <=100)
				position += number_on_dice;
		}
		else if(option == snake) {
			if(position-number_on_dice > 0)
			 position -= number_on_dice;
			else
				position = 0;
		}
		System.out.println("The position of player is: "+position);
		}
		System.out.println("The final postion reached by the player is: "+position);
		System.out.println("The number of times the dice rolled is: "+number_of_turns);
	}	
}
