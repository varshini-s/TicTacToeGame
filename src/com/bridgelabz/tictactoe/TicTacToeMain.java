package com.bridgelabz.tictactoe;

public class TicTacToeMain {

	public static void main(String[] args) 
	{

			System.out.println("welcome to tic tac toe game");

			TicTacToe game = new TicTacToe();
			game.initializeBoard();
			game.playerInput();
			game.showBoard();
			game.decideFirstPlay();



	}

}
