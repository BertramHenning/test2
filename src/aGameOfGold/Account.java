package aGameOfGold;

// Creates Account Class
public class Account {

	private int goldCoins;
	// Ceates Account constructor and get and set methods
	public Account() {
		goldCoins = 1000;

	}

	public int getGoldcoins() {
		return goldCoins;
	}

	public void setgoldCoins(int goldCoins) {
		this.goldCoins = goldCoins;

		if (this.goldCoins < 0) {
			this.goldCoins = 0;			
			}
	
	}
}
