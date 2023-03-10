package main;

import java.security.SecureRandom;
import java.util.Scanner;

import hotcold.HotCold;
import hotcold.Player;

public class Main {

	public static void main(String[] args) {
		
		/* *********** Pledge of Honor ************************************************ *

		I hereby certify that I have completed this lab assignment on my own
		without any help from anyone else. I understand that the only sources of authorized
		information in this lab assignment are (1) the course textbook, (2) the
		materials posted at the course website and (3) any study notes handwritten by myself.
		I have not used, accessed or received any information from any other unauthorized
		source in taking this lab assignment. The effort in the assignment thus belongs
		completely to me.
		READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
		SIGNATURE: <Bartu Birol, 0079227>
		********************************************************************************/
		
		// 1. Take 2 Names for Player object creation.
		Scanner input = new Scanner (System.in);
		System.out.println("Player 1 Name: ");
		String name1 = input.nextLine();
		System.out.println("Player 2 Name: ");
		String name2 = input.nextLine();
		
		// 2. Create 2 Player objects
		Player p1 = new Player(name1);
		Player p2 = new Player(name2);
		
		// 3. Create a random location from computer.
		int x = getRandomNumber();
		int y = getRandomNumber();
		
		// 4. Create a HotCold object.
		HotCold HotCold = new HotCold(p1, p2, x, y);

		
		// 5. Play 3 rounds of Hot and Cold.
		// For each iteration of the loop:
		
		//for (int i = 0; i<3; i++) { (pre-lab code)
		System.out.println("Please enter number of rounds to play");
		int noOfRounds = input.nextInt();
		for (int i = 0; i<noOfRounds; i++) {
			
			// 5.1 Take player1's guessed location.
			System.out.println(name1 + " enter a number between 0 and 255 for the x location (both inclusive).");
			int x1 = input.nextInt();
			while (!(x1>=0 && x1<=255)) {
				System.out.println("Wrong input try again");
				x1 = input.nextInt();
			}
			p1.setGuessedLocationx(x1);

			System.out.println(name1 + " enter a number between 0 and 255 for the y location (both inclusive).");
			int y1 = input.nextInt();
			while (!(y1>=0 && y1<=255)) {
				System.out.println("Wrong input try again");
				y1 = input.nextInt();
			}
			p1.setGuessedLocationy(y1);
			
			// 5.2 Take player2's guessed location.
			System.out.println(name2 + " enter a number between 0 and 255 for the x location (both inclusive).");
			int x2 = input.nextInt();
			while (!(x2>=0 && x2<=255)) {
				System.out.println("Wrong input try again");
				x2 = input.nextInt();
			}
			p2.setGuessedLocationx(x2);
			
			System.out.println(name2 + " enter a number between 0 and 255 for the y location (both inclusive).");
			int y2 = input.nextInt();
			while (!(y2>=0 && y2<=255)) {
				System.out.println("Wrong input try again");
				y2 = input.nextInt();
			}
			p2.setGuessedLocationy(y2);
			
			// 5.3 Play a Hot and Cold round.
			HotCold.playEuclidean();
			
		}
		// 6. End of 3 rounds, display the results.
		HotCold.whoWon();
		
	}


	// Use this method to get a random number from computer between 0 and 255 (both inclusive).
	public static int getRandomNumber() {
		return new SecureRandom().nextInt(256);
	}

}
