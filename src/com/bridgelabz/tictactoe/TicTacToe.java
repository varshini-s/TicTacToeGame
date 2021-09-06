package com.bridgelabz.tictactoe;

public class TicTacToe 
{

	char[] board = new char[10];

	public void initializeBoard()
	{
		for(int index=1;index<11;index++)
		{
			board[index]=' ';
		}

	}

	public static void main(String[] args) 
	{

		System.out.println("welcome to tic tac toe game");




	}

}
