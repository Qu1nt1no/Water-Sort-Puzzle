package tests;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BootleTestConstructors {

	private Bottle bootleTest;

	@Test
	void testContrutor1() {

		bootleTest = new Bottle();

		int actual = bootleTest.size();
		int expected = Bottle.DEFAULT_SIZE;

		assertEquals(expected, actual);

	}

	@Test
	void testContrutor2() {

		bootleTest = new Bottle();

		int actual = bootleTest.spaceAvailable();
		int expected = 5;

		assertEquals(expected, actual);

	}

	@Test
	void testContrutor3() {

		Balls[] vec = new Balls[7];

		bootleTest = new Bottle(vec);

		int actual = bootleTest.size();
		int expected = 7;

		assertEquals(expected, actual);

	}

	@Test
	void testContrutor4() {

		Balls[] vec = new Balls[7];

		bootleTest = new Bottle(vec);

		int actual = bootleTest.spaceAvailable();
		int expected = 7;

		assertEquals(expected, actual);

	}

}
