package types;

/**
 * An implementation of the FinalScoringFillingGame class.
 * Group 39  
 * @author Andre Agostinho N 57577
 * @author David Simoes N 57578
 * @author Tomas Quintino N 58656
 */
public class FinalScoringFillingGame extends AbstractFillingGame{
	private int score;
	private Bottle helpBottle;

	/**
	 * Creates a FinalScoringFillingGame object
	 * @param symbols the array of symbols with the symbols to be used in the game Table
	 * @param numberOfUsedSymbols the number of different symbols to be used in the game Table
	 * @param seed the seed for the Table Bottles content generator
	 * @param bootleSize the size for the Bottle Tables
	 */
	public FinalScoringFillingGame(Filling[] symbols, int numberOfUsedSymbols, int seed, int bottleSize) {
		super(symbols, numberOfUsedSymbols, seed, bottleSize);
	}

	/**
	 * Creates a FinalScoringFillingGame object
	 * @param symbols the array of symbols with the symbols to be used in the game Table
	 * @param numberOfUsedSymbols the number of different symbols to be used in the game Table
	 * @param seed the seed for the Table Bottles content generator
	 * @param bootleSize the size for the Bottle Tables
	 * @param score the user score at the moment
	 */
	public FinalScoringFillingGame(Filling[] symbols, int numberOfUsedSymbols, int seed, int bottleSize, int score) {
		super(symbols, numberOfUsedSymbols, seed, bottleSize);
		this.score = score;
	}

	/**
	 * Creates an empty helping bottle and adds it to the Table
	 */
	@Override
	public void provideHelp() {
		Bottle bottle = new Bottle();
		this.helpBottle = bottle;
		table.addBootle(bottle);
		this.score = this.score - 100; 
		if(isRoundFinished()) 
			updateScore();
	}


	/**
	 * Updates the player score based on the number of plays that he uses to complete the Game
	 */
	public void updateScore() {
		if(numPlays>15 && numPlays<25) {
			this.score+=200;
		} else if (numPlays>10 && numPlays<15) {
			this.score += 500;
		} else if (numPlays<10) {
			this.score += 1000;
		}
	}
	
	/**
	 * Checks if the round is finished
	 */
	public boolean isRoundFinished(){
		return this.table.areAllFilled();
	}

	/**
	 * Gets the player score at the moment
	 */
	@Override
	public int score() {
		return this.score;
	}

	
	/**
	 * Gets the help bottle generated when the player asks for help
	 */
	@Override
	public Bottle getNewBootle() {
		return this.helpBottle;
	}

	/**
	 * Creates a String representation of the Game
	 */
	@Override
	public String toString() {
		StringBuilder StringBuilder = new StringBuilder();
		StringBuilder.append("Score: " + this.score + EOL);
		StringBuilder.append(this.table.toString());
		if(!isRoundFinished()) {
			StringBuilder.append("Status: The round is not finished." + EOL);
			StringBuilder.append(this.numPlays + " moves have been used until now." + EOL);
		}
		else {
			StringBuilder.append("Status: This round is finished." + EOL);
			StringBuilder.append(this.numPlays + " moves were used." + EOL);
		}
		
		return StringBuilder.toString();
	}
}
