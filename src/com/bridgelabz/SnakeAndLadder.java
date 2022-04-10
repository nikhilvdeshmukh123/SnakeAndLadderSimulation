package com.bridgelabz;

/*
 * @author : Nikhil
 * Snake And Ladder Simulation
 */
public class SnakeAndLadder {
	//Declaring Variables
	int player = 0;
	//Method Showing Player position
	public void startGame() {
		System.out.println("Player Initial Position: " + player);
	}

	public static void main(String[] args) {
		System.out.println("Snake And Ladder Simulation");
		//Object of SnakeAndLadder class created
		SnakeAndLadder start = new SnakeAndLadder();
		start.startGame();
	}
}