package types;

/**
 * An implementation of the AbstractFillingGame class.
 * Group 39  
 * @author Andre Agostinho N 57577
 * @author David Simoes N 57578
 * @author Tomas Quintino N 58656
 */
public abstract class AbstractFillingGame implements FillingGame {

	public static String EOL = System.lineSeparator();
	protected Table table;
	protected int numPlays;

	/**
	 * 
	 * @param symbols
	 * @param numberOfUsedSymbols
	 * @param seed
	 * @param bootleSize
	 */
	public AbstractFillingGame(Filling[] symbols, int numberOfUsedSymbols, int seed, int bottleSize) {
		this.table = new Table(symbols, numberOfUsedSymbols, seed, bottleSize);
		this.numPlays = 0;
	}


	/**
	 * 
	 * @return
	 */
	public int jogadas() {
		return this.numPlays;
	}


	/**
	 * 
	 * @return
	 */
	public int getBottlesSize() {
		return this.getBottlesSize();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void play(int x, int y) {
		Filling fillingToPour= this.table.top(x);
		numPlays++;
		try {
		while((this.table.top(x)).equals(fillingToPour)) {
			this.table.pourFromTo(x, y);
			if(isRoundFinished()) {
				updateScore();
			}
		}
		} catch(ArrayIndexOutOfBoundsException e) {}
	}

	/**
	 * 
	 */
	public void provideHelp() {
		
	}

	/**
	 * 
	 * @return
	 */
	public abstract Bottle getNewBootle();

	/**
	 * 
	 * @return
	 */
	public abstract void updateScore();

	/**
	 * 
	 * @param x
	 * @return
	 */
	public Filling top(int x) {
		return this.table.top(x);
	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public boolean singleFilling(int x) {
		return this.table.singleFilling(x);
	}

	/**
	 * 
	 * @return
	 */
	public abstract boolean isRoundFinished();


	/**
	 * 
	 * @return
	 */
	public abstract int score();

	/**
	 * 
	 */
	public void startNewRound() {
		
	}

	/**
	 * 
	 * @return
	 */
	public boolean areAllFilled() {
		return false;
	}

	
	/**
	 * 
	 * @return
	 */
	public String toString() {
		
		return null;
	}

}
