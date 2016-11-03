package aGameOfGold;

public class player {

	private int points = 1000, current, win = 0;
	private String name;

	public player(String a) { // constructor for the player class
		name = a; // sets the name of the player to "a"
	}

	public void checkWin() { // method for when the player wins
		if (points >= 3000) // if-sentence for when the player has a sum
									// past 3000 points
			win = 1; // Congratulations, you won the game
	}

	public void addPoints(int a) { // method for adding points to your current value
		points += a; // adds points to your account
	}

	public int getPoints() { // get'er for points
		return points; // returns point-integer
	}

	public int getWin() { // get'er for the winning integer
		return win; // returns win-integer
	}

	public int getCurrent() { // get'er for current value of player
		return current; // returns current value
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public String toString() {
		return name;
	}
	
	
}