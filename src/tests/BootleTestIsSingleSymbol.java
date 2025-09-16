package tests;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BootleTestIsSingleSymbol {

	private Bottle bootleTest;


	@Test
	void test1() {

		Emojis[] vec = new Emojis[7];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.LOVE;
		}

		bootleTest = new Bottle(vec);

		boolean actual = bootleTest.isSingleFilling();
		boolean expected = true;

		assertEquals(actual, expected);

	}

	@Test
	void test2() {

		Emojis[] vec = new Emojis[7];

		vec[0] = Emojis.LOVE;

		for (int i = 1; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bootleTest = new Bottle(vec);

		boolean actual = bootleTest.isSingleFilling();
		boolean expected = false;

		assertEquals(actual, expected);
	}

	@Test
	void test3() {

		Emojis[] vec = new Emojis[5];



		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		vec[4] = Emojis.LOVE;
		
		bootleTest = new Bottle(vec);

		boolean actual = bootleTest.isSingleFilling();
		boolean expected = false;

		assertEquals(actual, expected);

	}

	@Test
	void test4() {

		Emojis[] vec = new Emojis[5];


		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		vec[2] = Emojis.LOVE;
		
		bootleTest = new Bottle(vec);

		boolean actual = bootleTest.isSingleFilling();
		boolean expected = false;

		assertEquals(actual, expected);

	}

	@Test
	void test5() {

		Emojis[] vec = new Emojis[5];



		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		vec[2] = Emojis.LOVE;
		
		bootleTest = new Bottle(vec);
		
		bootleTest.pourOut();

		boolean actual = bootleTest.isSingleFilling();
		boolean expected = false;

		assertEquals(actual, expected);
	}

	@Test
	void test6() {

		Emojis[] vec = new Emojis[5];



		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		vec[4] = Emojis.LOVE;
		
		bootleTest = new Bottle(vec);
		
		bootleTest.pourOut();

		boolean actual = bootleTest.isSingleFilling();
		boolean expected = true;

		assertEquals(actual, expected);
		
	}

}
