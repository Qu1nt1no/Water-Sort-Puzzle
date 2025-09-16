package testsTable;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TableTestTop {

	private Table tableTeste;
	public String EOL = Table.EOL;


	@Test
	void test1() {
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);



		Filling actual = tableTeste.top(2);
		Filling expected = Emojis.FURIOUS;

		assertEquals(expected, actual);
	}

	@Test
	void test2() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);

		Filling actual = tableTeste.top(0);
		Filling expected = Emojis.SMILE;


		assertEquals(expected, actual);
	}

	@Test
	void test4() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed = 2;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);


		tableTeste.pourFromTo(0,3);



		Filling actual = tableTeste.top(0);
		Filling expected = Emojis.FURIOUS;

		assertEquals(expected, actual);
	}

	@Test
	void test5() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed = 2;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);


		tableTeste.pourFromTo(0,3);



		Filling actual = tableTeste.top(3);
		Filling expected = Emojis.SAD;

		assertEquals(expected, actual);
	}

	@Test
	void test6() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed = 2;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);


		tableTeste.pourFromTo(0,3);
		tableTeste.pourFromTo(1,4);



		Filling actual = tableTeste.top(4);
		Filling expected = Emojis.SAD;

		assertEquals(expected, actual);
	}

	@Test
	public void test7() {
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed = 2;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);


		assertThrows(
				ArrayIndexOutOfBoundsException.class,
				() -> tableTeste.top(4),
				"Expected top() to throw, but it didn't"
				);
	}

	@Test
	void test8() {

		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed = 2;
		int bootleSize = 4;


		tableTeste = new Table(symbols, numberOfUsedSymbols, seed, bootleSize);

		tableTeste.pourFromTo(0,3);
		tableTeste.pourFromTo(0,4);
		tableTeste.pourFromTo(0,5);
		tableTeste.pourFromTo(0,3);
		

		assertThrows(
				ArrayIndexOutOfBoundsException.class,
				() -> tableTeste.top(0),
				"Expected top() to throw, but it didn't"
				);
	}
}
