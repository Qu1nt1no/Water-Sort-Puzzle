package testsBottle;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BottleTestPourOut {

	private Bottle bottleTest;
	
	public String empty = Table.empty;
	public String EOL = Table.EOL;


	@Test
	void test1() {
		Emojis[] vec = new Emojis[7];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();

		String actual = bottleTest.toString();
		String expected = Table.empty + EOL
				+ Table.empty + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇"+ EOL
				+ "😇"+ EOL
				+ "😇" + EOL;

		assertEquals(actual, expected);
	}

	@Test
	void test2() {

		Emojis[] vec = new Emojis[7];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();

		String actual = bottleTest.toString();
		String expected = Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL;

		assertEquals(actual, expected);

	}

	@Test
	void test3() {

		Emojis[] vec = new Emojis[7];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();

		String actual = bottleTest.toString();
		String expected = Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ "😇"+ EOL
				+ "😇" + EOL;

		assertEquals(actual, expected);

	}

	
	@Test
	void test4() {

		Emojis[] vec = new Emojis[8];

		for (int i = 0; i < vec.length/2; i++) {
			vec[i] = Emojis.ANGEL;
		}
		for (int i = vec.length/2; i < vec.length; i++) {
			vec[i] = Emojis.LOVE;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();


		String actual = bottleTest.toString();
		String expected = 
				  Table.empty + EOL
				+ Table.empty + EOL
				+ "😍" + EOL
				+ "😍" + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL;

		assertEquals(actual, expected);

	}
	
	@Test
	void test5() {

		Emojis[] vec = new Emojis[8];

		for (int i = 0; i < vec.length/2; i++) {
			vec[i] = Emojis.ANGEL;
		}
		for (int i = vec.length/2; i < vec.length; i++) {
			vec[i] = Emojis.LOVE;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();

		String actual = bottleTest.toString();
		String expected = 
				  Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL;

		assertEquals(actual, expected);

	}
	
	@Test
	void test6() {

		Emojis[] vec = new Emojis[8];

		for (int i = 0; i < vec.length/2; i++) {
			vec[i] = Emojis.ANGEL;
		}
		for (int i = vec.length/2; i < vec.length; i++) {
			vec[i] = Emojis.LOVE;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.pourOut();

		String actual = bottleTest.toString();
		String expected = 
				  Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ Table.empty + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL;

		assertEquals(actual, expected);

	}
}
