//
//This will be the main program for running the game in the terminal.
//

import java.util.Random;

public class tictac	{
	
	private static void main(final String[] args)	{
		
		//initialize and assign x and o to player.
		
		System.out.println("Please enter your name, player one.");
		String name1 = TextIO.getln();
		Player player1 = new Player(name1);
		
		System.out.println("Please enter your name, player two.");
		String name2 = TextIO.getln();
		Player player2 = new Player(name2);
		
		Random rand = new Random();
		
		int n = rand.nextInt(10) + 1;
		
		if (n < 5)	{
			player1.x = true;
			player2.o = true;
		} else {
			player1.o = true;
			player2.x = true;
		}
		
		
		//initialize board
		
		
		//accept inputs and print the current board, check if win or tie each turn
		
		
		//if win or tie, end the game and declare the winner, or if there was a tie.
		
		
		//prompt to restart program.
		
		
		
	}
	
}
