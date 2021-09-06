package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe 
{

	char[] board = new char[10];

	public void initializeBoard()
	{
		for(int index=1;index<board.length;index++)
		{
			board[index]=' ';
		}

	}
	
	public void userInput()
	{
		Scanner scanner = new Scanner(System.in);
		char input =scanner.next().charAt(0);
		input=Character.toUpperCase(input);
		System.out.println(input);
		
	}
	
	public static void main(String[] args) 
	{

		System.out.println("welcome to tic tac toe game");
		
		TicTacToe game = new TicTacToe();
		
		game.initializeBoard();
		game.userInput();
		

		

	}

}
