package com.capgemini;

public class SnakeAndLadder {
	public static int noPlay =0,ladder = 1,snake =2;
	public static void main(String[] args) {
		System.out.println("Welcome to snake and Ladder");
		int position1 = 0,position2 =0, number_of_turns_of_player1 =0,number_of_turns_of_player2 = 0;
		boolean is_player1_turn = true,is_player2_turn =false;
		while((position1 < 100)&&(position2 <100)) {
			int number_on_dice = (int) Math.floor(Math.random()*10)%6 +1;
			int option = (int) Math.floor(Math.random()*10)%3;
			if(is_player1_turn) {
				number_of_turns_of_player1++;
				if(option == noPlay) {
					System.out.println("The Player1 remains on same position");
					is_player1_turn = false;
					is_player2_turn = true;
				}
				else if(option == ladder) {
					if(position1+number_on_dice <=100)
						position1 += number_on_dice;
				}
				else if(option == snake) {
					if(position1-number_on_dice > 0)
					 position1 -= number_on_dice;
					else
						position1 = 0;
					is_player1_turn = false;
					is_player2_turn = true;
				}
				System.out.println("The position of player1 is: "+position1);
			}
			else if(is_player2_turn){
				number_of_turns_of_player2++;
				if(option == noPlay) {
					System.out.println("The Player2 remains on same position");
					is_player1_turn = true;
					is_player2_turn = false;
				}
				else if(option == ladder) {
					if(position2+number_on_dice <=100)
						position2 += number_on_dice;
				}
				else if(option == snake) {
					if(position2-number_on_dice > 0)
					 position2 -= number_on_dice;
					else
						position2 = 0;
					is_player1_turn = true;
					is_player2_turn = false;
				}
				System.out.println("The position of player 2 is: "+position2);
			}
		}
		System.out.println("The final position of player1 is:"+position1);
		System.out.println("The final position of player2 is:"+position2);
		
		if(position1 == 100) {
			System.out.println("The player1 win and he turned dice :"+number_of_turns_of_player1+" times");
		}
		else {
			System.out.println("The player2 win and he turned dice :"+number_of_turns_of_player2+" times");
		}
		}
}
