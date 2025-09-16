package types;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An implementation of the Bottle class.
 * Group 39 
 * @author Andre Agostinho N 57577
 * @author David Simoes N 57578
 * @author Tomas Quintino N 58656
 */
public class Bottle implements Iterable<Filling>{


	public static int DEFAULT_SIZE = 5;

	public static String empty = "⬜";

	public static String EOL = System.lineSeparator();
	
	protected Filling[] contents;
	
	/**
	 * Creates a Bottle object with the default size 5
	 */
	public Bottle() {
		this.contents = new Filling[DEFAULT_SIZE];
	}

	/**
	 * Creates a Bottle object with the given size 
	 * @param size the size for the Bottle being created
	 * @requires size >0 and size != null
	 */
	public Bottle(int size) {
		this.contents = new Filling[size];
	}


	/**
	 * Creates a Bottle object with the given content
	 * @param content the filling to put in the Bottle that is being created
	 * @requires content != null
	 */
	public Bottle(Filling[] content) {
		this.contents = content;
	}
	/**
	 * Checks if the Bottle is full
	 * @return true if the Bottle is full, otherwise false
	 */
	public boolean isFull() {
		return this.contents[this.size()-1]!=null;
	}

	/**
	 * Checks if the Bottle is empty
	 * @return true if the Bottle is empty, otherwise false
	 */
	public boolean isEmpty() {
		return this.contents[0]==null;
	}

	/**
	 * Checks which Filling object is on top of the Bottle
	 * In case of the Bottle being empty returns null
	 * @return Filling object that is on top of the Bottle
	 * @throws ArrayIndexOutOfBoundsException in case of the Bottle being empty
	 */
	public Filling top() {
		if(!this.isEmpty()) {
			for (int i=this.size() -1; i>=0; i--) {
				if (this.contents[i] != null) {
					return contents[i];
				}
			}
		} 
		throw new ArrayIndexOutOfBoundsException();
	}

	/**
	 * Checks how much space there is left on the Bottle
	 * @return Integer representing the number of empty spaces left on the Bottle
	 */
	public int spaceAvailable() {
		int countSpace = 0;
		if(!this.isFull()) {
			for(int i=this.size()-1; i>=0; i--) {
				if(this.contents[i] == null)
					countSpace++;
				else
					return countSpace;
			}
		}
		return countSpace;
	}

	/**
	 * Pours out the Filling object on the top of the Bottle
	 */
	public void pourOut() {
		if(!this.isEmpty()) {
			this.contents[this.lastOccupiedPosition()] = null;
		}
	}

	/**
	 * In case there is space puts a Filling object on the first free position of the Bottle
	 * @param s the Filling object to put on the Bottle
	 * @return false case the Bottle is full or the top Filling object of the Bottle being different from the given one
	 * otherwise it puts the object on the first free position and returns true
	 * @requires s != null
	 */
	public boolean receive(Filling s) {
		if(this.isFull())
			return false;
		else if(this.isEmpty()) {
			this.contents[0] = s;
			return true;
		} else
			if(this.contents[this.lastOccupiedPosition()].equals(s)) {
				this.contents[this.lastOccupiedPosition()+1] = s;
				return true;
			} return false;
	}

	/**
	 * Gets the size of the Bottle
	 * @return Integer representing the size of the Bottle
	 */
	public int size() {
		return this.contents.length;
	}

	/**
	 * Checks if the content of the Bottle is all the same
	 * @return true if the Bottle is filled with only one type of Filling otherwise false
	 */
	public boolean isSingleFilling() {
		if(this.size()>1) {
			for (int i=1; i<this.size(); i++) {
				if (this.contents[0] != this.contents[i] && this.contents[i] != null) {
					return false;
				}
			} return true;
		} return true;
	}

	/**
	 * Gets the content of the Bottle
	 * @return a copy of the content of the Bottle
	 */
	public Filling[] getContent() {
		return this.contents.clone();
	}

	/**
	 * Overwriting of the object.toString() method for the Bottle object
	 * @return String representation of a Bottle type object
	 */
	public String toString() {
		StringBuilder StringBuilder = new StringBuilder();
		for(int i=this.size()-1; i>=0; i--) {
			if(this.contents[i] == null)
				StringBuilder.append(empty+EOL);
			else
				StringBuilder.append(this.contents[i].toString()+EOL);
		}
		return StringBuilder.toString();
	}

	/**
	 * Implementation of the iterator() method of the Iterable Interface
	 */
	@Override
	public Iterator<Filling> iterator() {
		return new BottleIterator();
	}
	
	private class BottleIterator implements Iterator<Filling> {
        private int currentIndex;
        
        private BottleIterator() {
        	currentIndex = -1;
        }
        
        @Override
        public boolean hasNext() {
            return currentIndex < contents.length-1;
        }

        @Override
        public Filling next() {
        	if(this.hasNext()) {
        		currentIndex++;
        		return contents[currentIndex];
        	}
        	else
        		throw new NoSuchElementException();
        }
    }
	
	/**
	 * Gets the index of the last occupied position of the Bottle
	 * @return Integer representing the index of the last occupied position of the Bottle
	 */
	private int lastOccupiedPosition() {
		int contentsLastPosition = this.size()-1; 
		int spaceAvailable = this.spaceAvailable();
		int lastOccupiedPosition = contentsLastPosition-spaceAvailable;
		return lastOccupiedPosition;
	}
}
