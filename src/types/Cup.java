package types;

/**
 * An implementation of the Cup class.
 * Group 39  
 * @author Andre Agostinho N 57577
 * @author David Simoes N 57578
 * @author Tomas Quintino N 58656
 */
public class Cup extends Bottle{

	public static final int CUP_SIZE = 1; 

	private static final int TIMES_OF_USAGES = 3;

	public static String empty = "⚪";
	
	private int currentUses = 0;

	/**
	 * Creates a Cup object with the default size 1
	 */
	public Cup() {
		super(DEFAULT_SIZE);
	}

	/**
	 * Creates a Cup object with the first element of the given content 
	 * @param content the content array from where it will be chosen the first element to fill the cup
	 * @requires content != null
	 */
	public Cup(Filling[] content) {
		super(DEFAULT_SIZE);
		this.contents[0]=content[0];
		this.currentUses++;
	}

	/**
	 * Differently from the method receive from the super class Bottle, this receive method can only be used
	 * up to 3 times so it will fill the cup with the given content and increment the number of current usages
	 * until it reaches the maximum if it succeeded returns true otherwise false
	 * @param s Filling to put in the cup content
	 * @returns true if it succeeded otherwise false
	 * @requires s != null
	 */
	@Override
	public boolean receive(Filling s) {
		if(this.currentUses < TIMES_OF_USAGES) {
			this.contents[0] = s;
			this.currentUses++;
			return true;
		} return false;
	}
	
	/**
	 * Makes a String representation of the class cup
	 * @returns String representation of this cup
	 */
	@Override
	public String toString() {
		if(this.isFull())
			return this.contents[0].toString();
		else
			return empty;
	}
}