import java.util.Scanner;
public class TicTacToe
{
	
	public static void main(String args[])
	{
		turn(createArray());
		
	
	
	}
	/**
	* Creates the 2D array that 
	* will store the game.
	* @return a 2D int array that is the board
	*/
	
	public static int[][] createArray()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How long do you want each side to be? ");
		int n = keyboard.nextInt();
		int [][] arr1 = new int[n][n]; //creating a 2D int array that is n x n
		int num = 0;
		for(int k = 0; k < arr1.length; k++)
		{
			for(int p = 0; p < arr1[k].length; p ++)
			{
				arr1[k][p] = num;
				num++;
			}
		}
			

	
		return arr1;
	
	}
	
	/**
	* Prints board 
	* and prints them to the screen.
	* Works for up to a 9 x 9 board at 
	* which point the dashes are far too short
	* for the rest of the board.
	* @param n that is the dimensions of board
	* @return prints board to screen
	*/
	public static void boardPrinter(int[][] arr)
	{
		for(int y = 0; y < arr[0].length * 2 + arr[0].length * 2 + arr[0].length; y ++)
			System.out.print("-");
		System.out.println();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("|");
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(" ");
				for (int o = 0; o < numDigits(arr.length * arr.length ) - numDigits(arr[i][j]); o ++)
				{
					
					System.out.print(" ");
				}
				
				if (arr[i][j] == -1)
					System.out.print("X");
				else if (arr[i][j] == -2)
					System.out.print("O");
				else
					System.out.print(arr[i][j]);
				System.out.print(" |");
					
				
			}
			System.out.println();
			for(int y = 0; y < arr[i].length * 2 + arr[i].length * 2 + arr[0].length; y ++)
				System.out.print("-");
			System.out.println();
		}
	
	}
	
	/**
	* Returns the number of digits in the parameter
	* by looping through the number and dividing by 10
	* until the number is one digit.
	* @param the int to check the num of digits in
	* @return the num of digits in n
	*/
	public static int numDigits(int n)
	{
		int spaces = 1;
		while (n > 9)
		{
		
			n = n / 10;
			spaces ++;
		}
		return spaces;
		
	}
	/**
	* This function contains the main contents
	* of the program because it contains
	* the code that makes the turns.
	* @param the board
	*/
	public static void turn(int[][] arr)
	{
		boardPrinter(arr);
		while (isGameOver(arr) != true)
		{
			int player1 = -1;
			int player2 = -2;
			Scanner keyboard = new Scanner(System.in);
			boolean goTurn = false;
			int player1Placement = 0;
			while (goTurn == false)
			{
				System.out.print("Player 1: Where would you like to place your tile? ");
				player1Placement = keyboard.nextInt();
				if (checkPosition(player1Placement, arr) == true)
					goTurn = true;
			}
			int row = (player1Placement / arr.length);
			int column = (player1Placement % arr.length);
			arr[row][column] = player1;
			boardPrinter(arr);
			
			if (isGameOver(arr) == false)
			{
				boolean goTurn2 = false;
				int player2Placement = 0;
				while (goTurn2 == false)
				{
					System.out.print("Player 2: Where would you like to place your tile? ");
					player2Placement = keyboard.nextInt();
					if (checkPosition(player2Placement, arr) == true)
						goTurn2 = true;
				}
				int row2 = player2Placement / arr.length;
				int column2 = player2Placement % arr.length;
				arr[row2][column2] = player2;
				boardPrinter(arr);
			}
		}
	}
	/**
	* This function checks if the user's inputted
	* spot is available to place a tile at
	* in two if statements checking if the spot
	* is greater than the greatest spot
	* or if the place is taken already.
	* @aparm the position that the user chose
	* and the board
	* @return true if it is available and false if not
	*/	
	public static boolean checkPosition(int position, int[][] arr)
	{
		int row = position / arr.length;
		int column = position % arr.length;
		if ((position > (arr.length * arr.length) - 1))
		{
			System.out.println("That position is not on the board.");
			return false;
		}
		if (arr[row][column] == -1 || arr[row][column] == -2)
		{	
			System.out.println("That position is taken.");
			return false;
		}
		
		
		else
			return true;
	
	}
	/**
	* This function checks after each turn
	* if the game is over, and prints that
	* it is if it finds that the game is over.
	* It checks rows, columns, and diagonals
	* through for loops and counter
	* variables.
	* @param the board to check if the game is over
	* @return true if it is and false if it is not
	*/
	public static boolean isGameOver(int [][] board)
	{
		boolean gameOver = false;
		int player1Tiles = 0;
		int player2Tiles = 0;
		int row = 0;
		for (int j = 0; j < board.length; j ++)
		{
			for (int i = 0; i < board.length; i++)
			{
				if (board[row][i] == -1)
					player1Tiles ++;
				else if (board[row][i] == -2)
					player2Tiles ++;
			}
			if (player1Tiles == board.length)
			{
				System.out.println("Player 1 Wins!");
				gameOver = true;
			
			}
		
			if (player2Tiles == board.length)
			{
				System.out.println("Player 2 Wins!");
				gameOver = true;
			}
			player1Tiles = 0;
			player2Tiles = 0;
			row ++;
			
		}
		
		player1Tiles = 0;
		player2Tiles = 0;
		int column = 0;
		for (int j = 0; j < board.length; j ++)
		{
			for (int i = 0; i < board.length; i++)
			{
				if (board[i][column] == -1)
					player1Tiles ++;
				else if (board[i][column] == -2)
					player2Tiles ++;
			}
			column ++;
			if (player1Tiles == board.length)
			{
				System.out.println("Player 1 Wins!");
				return true;
			}	
		
			if (player2Tiles == board.length)
			{
				System.out.println("Player 2 Wins!");
				return true;
			}
			player1Tiles = 0;
			player2Tiles = 0;
			
		}
		
		
		
		int player1DiagonalCounter = 0;
		int player2DiagonalCounter = 0;
		int columnCounter = 0;
		int rowCounter = 0;
		while (rowCounter < board.length)
		{
			if (board[rowCounter][columnCounter] == -1)
				player1DiagonalCounter ++;
			if (board[rowCounter][columnCounter] == -2)
				player2DiagonalCounter ++;
			columnCounter += 1;
			rowCounter += 1;
		}
		if (player1DiagonalCounter == board.length)
		{
			System.out.println("Player 1 Wins!");
			return true;
		}
		if (player2DiagonalCounter == board.length)
		{
			System.out.println("Player 2 Wins!");
			return true;
		}

		player1DiagonalCounter = 0;
		player2DiagonalCounter = 0;
		columnCounter = board.length - 1;
		rowCounter = 0;
		while (rowCounter < board.length)
		{
			if (board[rowCounter][columnCounter] == -1)
				player1DiagonalCounter ++;
			if (board[rowCounter][columnCounter] == -2)
				player2DiagonalCounter ++;
			columnCounter -= 1;
			rowCounter += 1;
		}
		if (player1DiagonalCounter == board.length)
		{
			System.out.println("Player 1 Wins!");
			return true;
		}
		if (player2DiagonalCounter == board.length)
		{
			System.out.println("Player 2 Wins!");
			return true;
		}
		
		boolean boardFull = true;
		for (int k = 0; k < board.length; k++)
		{
			for (int q = 0; q < board.length; q ++)
			{
				if (board[k][q] >= 0)
					boardFull = false;
				
				
			}
		}
		
		if (boardFull != false)
		{
			System.out.println("The game ended in a tie.");
			gameOver = true;
		
		}
		return gameOver;
	}
	
	



}