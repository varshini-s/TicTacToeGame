package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class TicTacToe 
{

	//User turn is taken as 0 and computer turn as 0
	//Assuming game win as 1 and game draw as 0
	char[] board = new char[10];
	char playerInput,computerLetter;
	int turnToPlay,winner;
	int gameResult=-1;


	//initialising board with empty space
	public void initializeBoard()
	{
		for(int index=1;index<board.length;index++)
		{
			board[index]=' ';
		}

	}

	//asking for player symbol
	public void playerInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter player input Symbol:X or O ");
		playerInput =scanner.next().toUpperCase().charAt(0);

		if(playerInput=='X')
			computerLetter='O';
		else if(playerInput=='O')
			computerLetter='X';
		else
			System.out.println("invalid input");

	}
	//displaying the board with symbols
	public void showBoard()
	{
		int index=1;

		System.out.println("Displaying board");
		for(int rowIndex=1;rowIndex<=3;rowIndex++)
		{
			for(int columnIndex=1;columnIndex<=3;columnIndex++)
			{

				System.out.print(board[index++]+"|");
			}
			System.out.print("\n------\n");
		}
	}
	//making a move to given index for given player
	public void makeMove(int location,char player)
	{
		if(board[location]==' ') 
		{
			board[location]=player;

		}
	}

	//deciding first play using random number
	public void decideFirstPlay()
	{

		System.out.println("enter user's toss choice : Press H for heads, T for tails");
		Scanner scanner = new Scanner(System.in);
		char userTossChoice=scanner.next().toUpperCase().charAt(0);
		int usertossValue=(userTossChoice=='H')?0:1;
		int tossResult=(int)Math.floor(Math.random()*10)%2;

		//assigning user turn as 0 and computers turn as 1
		if(tossResult==usertossValue)
		{
			System.out.println("Player wins the toss!");
			turnToPlay=0;
		}
		else
		{
			System.out.println("Computer wins the toss!");
			turnToPlay=1;
		}


	}

	//changing the turn of player
	public void changeTurn()
	{


		if(turnToPlay==1)
		{
			turnToPlay=0;
		}
		else
		{
			turnToPlay=1;
		}
	}

	//checking game result
	public void  checkWinOrDraw()
	{
		String winCombinations = null;
		if(gameResult!=1)
		{
			for(int index=0;index<8;index++)
			{

				switch (index) 
				{
				case 0:
					winCombinations =new StringBuilder().append(board[1]).append(board[2]).append(board[3]).toString();
					break;
				case 1:
					winCombinations = new StringBuilder().append(board[4]).append(board[5]).append(board[6]).toString();
					break;
				case 2:
					winCombinations = new StringBuilder().append(board[7]).append(board[8]).append(board[9]).toString();
					break;
				case 3:
					winCombinations = new StringBuilder().append(board[1]).append(board[4]).append(board[7]).toString();
					break;
				case 4:
					winCombinations = new StringBuilder().append(board[2]).append(board[5]).append(board[8]).toString();
					break;
				case 5:
					winCombinations = new StringBuilder().append(board[3]).append(board[6]).append(board[9]).toString();
					break;
				case 6:
					winCombinations = new StringBuilder().append(board[1]).append(board[5]).append(board[9]).toString();
					break;
				case 7:
					winCombinations = new StringBuilder().append(board[3]).append(board[5]).append(board[7]).toString();
					break;
				}
				if(winCombinations.equals("XXX"))
				{
					winner=0;
					gameResult=1;
					break;

				}
				else if(winCombinations.equals("OOO"))
				{
					winner=1;
					gameResult=1;
					break;
				}
			}

		}

		else if(gameResult!=1 && isBoardFull()==true)
		{
			gameResult=0;
		}

	}
	
	//checking if board is fully occupied with symbols
		public boolean isBoardFull()
		{
			for(int index=0;index<board.length;index++)
			{
				if(board[index]==' ')
				{
					return false;

				}
			}

			return true;	
		}
		




}
