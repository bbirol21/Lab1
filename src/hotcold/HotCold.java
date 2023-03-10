package hotcold;

import java.util.Scanner;

public class HotCold {

	Player player1;
	Player player2;
	int xLocationToGuess;
	int yLocationToGuess;
	
	public HotCold(Player player1, Player player2, int xLocationToGuess, int yLocationToGuess) {
		this.player1 = player1;
		this.player2 = player2;
		this.xLocationToGuess = xLocationToGuess;
		this.yLocationToGuess = yLocationToGuess;
	}
	
	//new method was added for manhattan distance
	public void playManhattan() {
	
		//if statement was planned to added but time wasn't enough
	}
	
	
	public void playEuclidean() {
		
		int dx1 = player1.getGuessedLocationx()-xLocationToGuess;
		int dy1 = player1.getGuessedLocationy()-yLocationToGuess;
		double distance1 = Math.sqrt(dx1*dx1+dy1*dy1);
		
		int dx2 = player2.getGuessedLocationx()-xLocationToGuess;
		int dy2 = player2.getGuessedLocationy()-yLocationToGuess;
		double distance2 = Math.sqrt(dx2*dx2+dy2*dy2);
		
		String name1 = player1.getPlayerName();
		String name2 = player2.getPlayerName();
		
		System.out.printf(name1 + "'s distance is %.3f %n", distance1);
		System.out.printf(name2 + "'s distance is %.3f %n", distance2);
		
		if (distance1 > distance2) {
			System.out.println(name2 + " won");
			//player2.incrementTotalScore(1);(pre-lab code)
			player2.incrementTotalScore((1/distance2)*100);
			
		}
		else if (distance1 == distance2) {
			System.out.println(name1 + " and " + name2 + " were the same distance to the location.");
			player1.incrementTotalScore(3);
			player2.incrementTotalScore(3);
		}
		else {
			System.out.println(name1 + " won");
			//player1.incrementTotalScore(1);
			player1.incrementTotalScore((1/distance1)*100);
		}
	}
	
	
	public void whoWon() {
		
		System.out.println("Location to guess was: x: " + xLocationToGuess + ", y: " + yLocationToGuess + "."); 
		
		String name1 = player1.getPlayerName();
		String name2 = player2.getPlayerName();
		
		if (player2.getTotalScore() > player1.getTotalScore()) {
			String winner = name2;
			double winnerPoints =player2.getTotalScore();
			System.out.println(winner + " has won Hot and Cold with a total " + winnerPoints + " points");
		}
		if (player1.getTotalScore() > player2.getTotalScore()) {
			String winner = name1;
			double winnerPoints = player1.getTotalScore();
			System.out.println(winner + " has won Hot and Cold with a total " + winnerPoints + " points");
		}
		else if (player1.getTotalScore() == player2.getTotalScore()) {
			System.out.println("Hot and Cold between " + name1 + " and " + name2 + " resulted in a tie with both scoring " + player1.getTotalScore() + " points.");
		}
		
	}
}
