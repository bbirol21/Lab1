package hotcold;

public class Player {
	
	// type of total score was changed to double

	String playerName;
	int guessedLocationx;
	int guessedLocationy;
	double totalScore;
	
	public Player(String name) {
		
		this.playerName = name;
		guessedLocationx = -1;
		guessedLocationy = -1;
		totalScore = 0;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getGuessedLocationx() {
		return guessedLocationx;
	}

	public int getGuessedLocationy() {
		return guessedLocationy;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public void setGuessedLocationx(int guessedLocationx) {
		this.guessedLocationx = guessedLocationx;
	}

	public void setGuessedLocationy(int guessedLocationy) {
		this.guessedLocationy = guessedLocationy;
	}
	
	// it was changed to double
	public void incrementTotalScore(double points) {
		totalScore = totalScore + points;
	}
}
