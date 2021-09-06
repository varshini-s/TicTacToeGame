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
		char playerInput =scanner.next().charAt(0);
		playerInput=Character.toUpperCase(playerInput);
		
		if(playerInput=='X')
			computerInput='O';
		else if(playerInput=='O')
			computerInput='X';
		else
			System.out.println("invalid input");
		
		
	}

	public static void main(String[] args) 
	{

		System.out.println("welcome to tic tac toe game");
		
		TicTacToe game = new TicTacToe();
		
		game.initializeBoard();
		game.playerInput();
		

	}

}
