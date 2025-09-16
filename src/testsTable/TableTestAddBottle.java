package testsTable;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TableTestAddBottle {

	private Table tableTeste;
	public String EOL = Table.EOL;


	@Test
	void test1() {
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);

		Emojis[] vec = new Emojis[4];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		Bottle bottleTest = new Bottle(vec);

		tableTeste.addBootle(bottleTest);

		String actual = tableTeste.toString();
		String expected = 
				      "😃    😒    😡    ⬜    ⬜    ⬜    😇    "+ Table.EOL
				    + "😒    😡    😡    ⬜    ⬜    ⬜    😇    "+ Table.EOL
				    + "😒    😒    😃    ⬜    ⬜    ⬜    😇    "+ Table.EOL
				    + "😃    😡    😃    ⬜    ⬜    ⬜    😇    "+ Table.EOL
				;

		assertEquals(expected,actual);
	}

	@Test
	void test2() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);

		Emojis[] vec = new Emojis[4];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		Bottle bottleTest = new Bottle(vec);

		tableTeste.addBootle(bottleTest);
		tableTeste.addBootle(bottleTest);

		String actual = tableTeste.toString();
		String expected = 
			          "😃    😒    😡    ⬜    ⬜    ⬜    😇    😇    "+ Table.EOL
				    + "😒    😡    😡    ⬜    ⬜    ⬜    😇    😇    "+ Table.EOL
				    + "😒    😒    😃    ⬜    ⬜    ⬜    😇    😇    "+ Table.EOL
				    + "😃    😡    😃    ⬜    ⬜    ⬜    😇    😇    "+ Table.EOL
				;

		assertEquals(expected,actual);
	}

	@Test
	void test4() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);

		Emojis[] vec = new Emojis[4];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		Bottle bottleTest = new Bottle(vec);

		tableTeste.addBootle(bottleTest);

		Cup cupTeste = new Cup();
		tableTeste.addBootle(cupTeste);

		String actual = tableTeste.toString();
		String expected = 
				      "😃    😒    😡    ⬜    ⬜    ⬜    😇    ⚪    "+ Table.EOL
				    + "😒    😡    😡    ⬜    ⬜    ⬜    😇    ⚪    "+ Table.EOL
				    + "😒    😒    😃    ⬜    ⬜    ⬜    😇    ⚪    "+ Table.EOL
				    + "😃    😡    😃    ⬜    ⬜    ⬜    😇    ⬜    "+ Table.EOL
				;


		assertEquals(expected,actual);  
	}

	@Test
	void test5() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);

		
		
		Cup cupTeste = new Cup();
		tableTeste.addBootle(cupTeste);

		String actual = tableTeste.toString();
		String expected = 
			          "😃    😒    😡    ⬜    ⬜    ⬜    ⚪    "+ Table.EOL
				    + "😒    😡    😡    ⬜    ⬜    ⬜    ⚪    "+ Table.EOL
				    + "😒    😒    😃    ⬜    ⬜    ⬜    ⚪    "+ Table.EOL
				    + "😃    😡    😃    ⬜    ⬜    ⬜    ⬜    "+ Table.EOL
				;

		assertEquals(expected,actual);
	}

	@Test
	void test6() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);

		
		
		Cup cupTeste = new Cup();
		cupTeste.receive(Emojis.SMILE);
		tableTeste.addBootle(cupTeste);

		String actual = tableTeste.toString();
		String expected = 
				"😃    😒    😡    ⬜    ⬜    ⬜    ⚪    "+ Table.EOL
			  + "😒    😡    😡    ⬜    ⬜    ⬜    ⚪    "+ Table.EOL
			  + "😒    😒    😃    ⬜    ⬜    ⬜    ⚪    "+ Table.EOL
			  + "😃    😡    😃    ⬜    ⬜    ⬜    😃    "+ Table.EOL
						;

		assertEquals(expected,actual);
	}

	
}
