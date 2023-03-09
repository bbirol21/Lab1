package hotcold;

public class Player {

	String playerName;
	int guessedLocationx;
	int guessedLocationy;
	int totalScore;
	
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

	public int getTotalScore() {
		return totalScore;
	}

	public void setGuessedLocationx(int guessedLocationx) {
		this.guessedLocationx = guessedLocationx;
	}

	public void setGuessedLocationy(int guessedLocationy) {
		this.guessedLocationy = guessedLocationy;
	}
	
	public void incrementTotalScore(int points) {
		totalScore = totalScore + points;
	}
}
