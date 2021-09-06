package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe 
{

	char[] board = new char[10];
	char playerInput,computerLetter;
	int turnToPlay;

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
			computerLetter='O';
		else if(playerInput=='O')
			computerLetter='X';
		else
			System.out.println("invalid input");
		System.out.println(computerLetter);
		
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
	
	public void makeMove(int location,char player)
	{
		if(board[location]==' ') 
		{
			 board[location]=player;

		}
			
		
	}

	public void checkFirstPlay()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter user's toss choice");
		char userTossChoice=scanner.next().toUpperCase().charAt(0);
		int usertossValue=(userTossChoice=='H')?0:1;
		int tossResult=(int)Math.floor(Math.random()*10)%2;

		//assigning user turn as 0 and computers turn as 1
		if(tossResult==usertossValue)
		{
			turnToPlay=0;
		}
		else
		{
			turnToPlay=1;
		}
		
		
	}
	public static void main(String[] args) 
	{

		System.out.println("welcome to tic tac toe game");
		
		TicTacToe game = new TicTacToe();
		
		game.initializeBoard();
		game.playerInput();
		game.showBoard();
		game.checkFirstPlay();
		

	}

}
