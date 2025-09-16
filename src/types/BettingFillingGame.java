package types;

/**
 * An implementation of the BettingFillingGame class.
 * Group 39  
 * @author Andre Agostinho N 57577
 * @author David Simoes N 57578
 * @author Tomas Quintino N 58656
 */
public class BettingFillingGame extends AbstractFillingGame{
	private int maxPlays;
	private int bet;
	private int score;
	private Cup helpCup;

	/**
	 * Creates a BettingFillingGame object
	 * @param symbols the array of symbols with the symbols to be used in the game Table
	 * @param numberOfUsedSymbols the number of different symbols to be used in the game Table
	 * @param seed the seed for the Table Bottles content generator
	 * @param bootleSize the size for the Bottle Tables
	 * @param score the score of the game at the moment
	 * @param bet the amount of points that the player wants to bet
	 * @param maxPlays the max plays that are allowed per round
	 */
	public BettingFillingGame(Filling[] symbols, int numberOfUsedSymbols, int seed, int bottleSize, int score, int bet, int maxPlays) {
		super(symbols, numberOfUsedSymbols, seed, bottleSize);
		this.score = score;
		this.maxPlays = maxPlays;
		this.bet = bet;
	}

	
	/**
	 * Creates a help Cup
	 */
	@Override
	public void provideHelp() {
		Cup cup = new Cup();
		this.helpCup = cup;
		table.addBootle(cup);
		this.maxPlays--;
		if(isRoundFinished()) 
			updateScore();
	}

	/**
	 * Tells the Game score at the moment
	 */
	@Override
	public int score() {
		return this.score;
	}

	/**
	 * Checks if a round is finished
	 */
	@Override
	public boolean isRoundFinished() {
		return (this.table.areAllFilled() || this.maxPlays == this.numPlays);
	}


	/**
	 * Tells how many plays the player has left
	 * @return the number of plays the player has left
	 */
	public int numberOfPlaysLeft() {
		return this.maxPlays-this.numPlays;
	}


	/**
	 * returns the help cup
	 * @return the help cup object
	 */
	@Override
	public Bottle getNewBootle() {
		return helpCup;
	}

	/**
	 * Updates the player score based on the current last play 
	 */
	@Override
	public void updateScore() {
		if (this.table.areAllFilled() && this.numPlays<this.maxPlays) {
			this.score += this.bet*2;
		} else {
			this.score -= this.bet*2;
		}
	}
	
	/**
	 * String representation of the class BettingFillingGame
	 */
	@Override
	public String toString() {
		int playsLeft = this.maxPlays - this.numPlays;

		StringBuilder StringBuilder = new StringBuilder();
		StringBuilder.append("Score: " + this.score + EOL);
		StringBuilder.append(this.table.toString());
		if(!isRoundFinished())
			StringBuilder.append("Status: "+ this.numPlays + " moves have been used until now. You still have " + Integer.toString(playsLeft)+ " moves left." + EOL);
		else {
			StringBuilder.append("Status: This round is finished." + EOL);
			StringBuilder.append(this.numPlays + " moves were used." + EOL);
		}
		return StringBuilder.toString();
	}




}
