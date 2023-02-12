package com.sorrel012.oops.interfaces;

public class GameRunner {

    public static void main(String[] args) {

	MarioGame game = new MarioGame();

	game.up();
	game.down();
	game.left();
	game.right();

	System.out.println();


	ChessGame chess = new ChessGame();

	chess.up();
	chess.down();
	chess.left();
	chess.right();

    } //main
}
