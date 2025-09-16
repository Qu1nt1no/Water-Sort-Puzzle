package types;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * An implementation of the Table class.
 * Group 39 
 * @author Andre Agostinho N 57577
 * @author David Simoes N 57578
 * @author Tomas Quintino N 58656
 */
public class Table {

	public static String EOL = System.lineSeparator();

	public static final String empty = "⬜";

	public static final int DIFICULTY = 3;

	public static final int DEFAULT_BOTTLE_SIZE = 5; 

	private List<Bottle> bottles;
	
	private int bottleSize;
	
	private Random generator;
	
	private Filling[] symbolType;

	/**
	 * Creates a Table object 
	 * @param symbols a symbol array with the symbols to be used in the bottles of the Table
	 * @param numberOfUsedSymbols the number of different symbols that can be used from the symbols array
	 * @param seed the seed to create the Random generator that will generate the Fillings for the Table bottles
	 * @param bottleSize the size of the Table bottles
	 */
	public Table(Filling[] symbols, int numberOfUsedSymbols, int seed, int bottleSize) {
		this.bottleSize = bottleSize;
		this.symbolType = symbols;
		this.bottles = new ArrayList<Bottle>();
		int numBottles = Math.min(numberOfUsedSymbols, symbols.length)+DIFICULTY;
		this.generator = new Random(seed);
		int[] numRepetitions = new int[numberOfUsedSymbols];
		for(int i=0; i<numBottles-DIFICULTY; i++){
			Filling[] content = new Filling[bottleSize];
			for (int j = 0; j<bottleSize; j++) {
				int symbolPos = generator.nextInt(numberOfUsedSymbols);
				while (numRepetitions[symbolPos] == bottleSize) {
					symbolPos = generator.nextInt(numberOfUsedSymbols);
				}
				content[j] = symbols[symbolPos];
				numRepetitions[symbolPos]++;
			}
			this.bottles.add(new Bottle(content));
		}
		for(int i=0; i<DIFICULTY; i++){
			this.bottles.add(new Bottle(bottleSize));
		}	
	}

	/**
	 * Creates new Bottles for the current Table
	 */
	public void regenerateTable() {
		int numBottles = this.bottles.size();
		this.bottles = new ArrayList<Bottle>();
		int[] numRepetitions = new int[numBottles-DIFICULTY];
		for(int i=0; i<numBottles-DIFICULTY; i++){
			Filling[] content = new Filling[bottleSize];
			for (int j = 0; j<bottleSize; j++) {
				int symbolPos = generator.nextInt(numBottles-DIFICULTY);
				while (numRepetitions[symbolPos] == bottleSize) {
					symbolPos = generator.nextInt(numBottles-DIFICULTY);
				}
				content[j] = this.symbolType[symbolPos];
				numRepetitions[symbolPos]++;
			}
			this.bottles.add(new Bottle(content));
		}
		for(int i=0; i<DIFICULTY; i++){
			this.bottles.add(new Bottle(bottleSize));
		}
	}

	/**
	 * Checks if the Bottle in the given index is singleFilling
	 * @param x the index of the Bottle to check 
	 * @return true if the Bottle is filled with only one type of Filling otherwise false
	 */
	public boolean singleFilling(int x) {
		return this.bottles.get(x).isSingleFilling();
	}

	/**
	 * Checks if the Bottle in the given index is empty
	 * @param x the index of the Bottle to check 
	 * @return true if the Bottle is empty otherwise false
	 */
	public boolean isEmpty(int x) {
		return this.bottles.get(x).isEmpty();
	}

	/**
	 * Checks if the Bottle in the given index is full
	 * @param x the index of the Bottle to check 
	 * @return true if the Bottle is full otherwise false
	 */
	public boolean isFull(int x) {
		return this.bottles.get(x).isFull();
	}

	/**
	 * Checks if all the Table Bottles are filled and have only one content
	 * @return true if all the not empty bottles are filled with only one type of content otherwise false
	 */
	public boolean areAllFilled() {
		for(Bottle bottle: this.bottles) {
			if(!bottle.isEmpty()) {
				if(bottle.isFull()) {
					if (!bottle.isSingleFilling()){
						return false;
					}
				} else 
					return false;
			}
		} 
		return true;
	}


	/**
	 * Pours the Filling on top of a Bottle to another
	 * @param i the index of the Bottle where to pour from
	 * @param j the index of the Bottle where to pour to 
	 */
	public void pourFromTo(int i, int j) {
		Filling fillingToPour = this.bottles.get(i).top();
		if (!this.bottles.get(j).isFull() && fillingToPour!=null) {
			if(this.bottles.get(j).receive(fillingToPour))
				this.bottles.get(i).pourOut();
			}
	}

	/**
	 * Adds the given Bottle to the Table
	 * @param bottle to be added to the Table
	 */
	public void addBootle(Bottle bottle) {
		this.bottles.add(bottle);
	}

	/**
	 * Gets the bottle size being used in the Table
	 * @return an integer with the size of the bottles of the Table
	 */
	public int getSizeBottles() {
		return this.bottleSize;
	}


	/**
	 * Checks the Filling on top of the Bottle with the given index
	 * @param x the index of the Bottle to check
	 * @return the filling on top of the bottle
	 */
	public Filling top(int x) {
		return this.bottles.get(x).top();
	}

	/**
	 * String representation of a Table
	 * @return a String representation of this Table 
	 */
	public String toString() {
		StringBuilder StringBuilder = new StringBuilder();
		for (int i=bottleSize-1; i>=0; i--) {
			for (Bottle bottle: this.bottles) {
				if(bottle.getContent()[i] != null)
					StringBuilder.append(bottle.getContent()[i].toString()+"    ");
				else {
					if(bottle instanceof Cup && i!=0) {
						StringBuilder.append(Cup.empty+"    ");
					} else
						StringBuilder.append(Bottle.empty+"    ");
				}
			}
			StringBuilder.append(EOL);
		}
		return StringBuilder.toString();
	}

}
