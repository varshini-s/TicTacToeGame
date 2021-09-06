package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe 
{

	char[] board = new char[10];
	char playerInput,computerInput;

	public void initializeBoard()
	{
		for(int index=1;index<board.length;index++)
		{
			board[index]=' ';
		}

	}
	
	public void playerInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter player input");
		char playerInput =scanner.next().toUpperCase().charAt(0);
		
		if(playerInput=='X')
			computerInput='O';
		else if(playerInput=='O')
			computerInput='X';
		else
			System.out.println("invalid input");
		System.out.println(computerInput);
		scanner.close();
	}
	
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

	public static void main(String[] args) 
	{

		System.out.println("welcome to tic tac toe game");
		
		TicTacToe game = new TicTacToe();
		
		game.initializeBoard();
		game.playerInput();
		game.showBoard();
		

	}

}
