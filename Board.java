//
// creates a tic tac toe board.

public class Board {
	
	/**
	 * the board height and width is 3.
	 */
	private int dimention = 3;
	
	/**
	 * player array that is the board.
	 */
	private static Player[][] playerboard;
	
	/**
	 * constructor for tictac.
	 */
	public Board()	{
		
		playerboard = new Player[dimention][dimention];
	}
	
	public void gameStart(Player player1, Player player2)	{
		
	}
	
	public boolean setBoardAt(final Player player, final int setX, final int setY)	{
		
		if (playerboard[setX][setY] == null)	{
			playerboard[setX][setY] = player;
			return true;
		}
		return false;
		
		}
	
	public Player winner(final Player[][] board) {
		
		//horizontal cases
		if(board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != null)	{
			return board[0][0];
		}
		if(board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != null)	{
			return board[0][1];
		}
		if(board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != null)	{
			return board[0][2];
		}
		//vertical cases
		if(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != null)	{
			return board[0][0];
		}
		if(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != null)	{
			return board[1][0];
		}
		if(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != null)	{
			return board[2][0];
		}
		//diagonal cases
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != null)	{
			return board[0][0];
		}
		if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != null)	{
			return board[0][2];
		}
		return null;
	}
	public boolean tie(final Player[][] board)	{
		if(winner(board) == null)	{
			for (int i = 0; i < dimention; i++) {
				for (int j = 0; j < dimention; j++) {
					if(board[i][j] == null)	{
						return false;
					}
				}
			} 

		}
		return true;
	}
}
