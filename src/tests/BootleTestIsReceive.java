/* Comentei este teste porque a função pourOut está a ser utilizada de forma diferente da pedida no enunciado
package tests;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BootleTestIsReceive {

	private Bottle bootleTest;


	@Test
	void test1() {

		Animals[] vec = new Animals[7];


		bootleTest = new Bottle(vec);

		boolean actual = bootleTest.receive(Animals.ANT,4);
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

		int actual = bootleTest.pourOut(6);
		int expected = 6;

		assertEquals(actual, expected);
	}

	@Test
	void test3() {

		Emojis[] vec = new Emojis[7];

		vec[0] = Emojis.LOVE;
		vec[1] = Emojis.LOVE;

		for (int i = 2; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bootleTest = new Bottle(vec);

		int actual = bootleTest.pourOut(7);
		int expected = 5;

		assertEquals(actual, expected);

	}

	@Test
	void test4() {

		Emojis[] vec = new Emojis[7];

		vec[6] = Emojis.LOVE;
		vec[5] = Emojis.LOVE;

		for (int i = 0; i < vec.length-2; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bootleTest = new Bottle(vec);
		
		bootleTest.pourOut(1);

		int actual = bootleTest.pourOut(1);
		int expected = 1;

		assertEquals(actual, expected);

	}

	@Test
	void test5() {


		Emojis[] vec = new Emojis[7];

		vec[6] = Emojis.LOVE;
		vec[5] = Emojis.LOVE;

		for (int i = 0; i < vec.length-2; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bootleTest = new Bottle(vec);
		
		bootleTest.pourOut(2);

		int actual = bootleTest.pourOut(5);
		int expected = 5;

		assertEquals(actual, expected);
	}

	@Test
	void test6() {



		Emojis[] vec = new Emojis[7];

		vec[6] = Emojis.LOVE;
		vec[5] = Emojis.LOVE;

		for (int i = 0; i < vec.length-2; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bootleTest = new Bottle(vec);
		
		bootleTest.pourOut(2);

		int actual = bootleTest.pourOut(1);
		int expected = 1;

		assertEquals(actual, expected);
	}
	
	@Test
	void test7() {

		Emojis[] vec = new Emojis[7];

		for (int i = 0; i < vec.length-1; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bootleTest = new Bottle(vec);
		
		bootleTest.receive(Emojis.BLIINK,1);

		bootleTest.pourOut(1);
		
		int actual = bootleTest.pourOut(3);
		
		int expected = 3;

		assertEquals(actual, expected);
	}

	@Test
	void test8() {

		Emojis[] vec = new Emojis[7];

		for (int i = 0; i < vec.length-1; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bootleTest = new Bottle(vec);
		
		bootleTest.receive(Emojis.BLIINK,1);

		
		int actual = bootleTest.pourOut(3);
		
		int expected = 1;

		assertEquals(actual, expected);
	}

	
	
}
*/