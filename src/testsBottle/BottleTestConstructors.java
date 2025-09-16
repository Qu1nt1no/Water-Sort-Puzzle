package testsBottle;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BottleTestConstructors {

	private Bottle bottleTest;

	@Test
	void testContrutor1() {

		bottleTest = new Bottle();

		int actual = bottleTest.size();
		int expected = Bottle.DEFAULT_SIZE;

		assertEquals(expected, actual);

	}

	@Test
	void testContrutor2() {

		bottleTest = new Bottle();

		int actual = bottleTest.spaceAvailable();
		int expected = 5;

		assertEquals(expected, actual);

	}

	@Test
	void testContrutor3() {

		Balls[] vec = new Balls[7];

		bottleTest = new Bottle(vec);

		int actual = bottleTest.size();
		int expected = 7;

		assertEquals(expected, actual);

	}

	@Test
	void testContrutor4() {

		Balls[] vec = new Balls[7];

		bottleTest = new Bottle(vec);

		int actual = bottleTest.spaceAvailable();
		int expected = 7;

		assertEquals(expected, actual);

	}
	
	
	@Test
	void test8() {
		Emojis[] vec = new Emojis[7];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();

		String actual = bottleTest.toString();
		String expected = Table.empty + Table.EOL
				+ Table.empty + Table.EOL
				+ "😇"+ Table.EOL
				+ "😇"+ Table.EOL
				+ "😇"+ Table.EOL
				+ "😇"+ Table.EOL
				+ "😇"+ Table.EOL;

		assertEquals(actual, expected);
	}

}
