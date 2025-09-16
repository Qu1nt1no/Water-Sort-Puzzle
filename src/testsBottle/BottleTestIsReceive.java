package testsBottle;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BottleTestIsReceive {

	private Bottle bottleTest;
	public String empty = Table.empty;
	public String EOL = Table.EOL;

	@Test
	void test1() {

		Animals[] vec = new Animals[7];


		bottleTest = new Bottle(vec);
		bottleTest.receive(Animals.ANT);
		bottleTest.receive(Animals.ANT);
		bottleTest.receive(Animals.ANT);
		

		boolean actual = bottleTest.receive(Animals.ANT);
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

		bottleTest = new Bottle(vec);

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
				+ "😍" + EOL;

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
	void test4() {

		Emojis[] vec = new Emojis[7];

		vec[6] = Emojis.LOVE;
		vec[5] = Emojis.LOVE;

		for (int i = 0; i < vec.length-2; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bottleTest = new Bottle(vec);
		bottleTest.pourOut();
		bottleTest.pourOut();
		bottleTest.receive(Emojis.LOVE);
		

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
	void test5() {
		Emojis[] vec = new Emojis[7];

		vec[6] = Emojis.LOVE;
		vec[5] = Emojis.LOVE;

		for (int i = 0; i < vec.length-2; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bottleTest = new Bottle(vec);
		bottleTest.pourOut();
		
		bottleTest.receive(Emojis.LOVE);
		

		String actual = bottleTest.toString();
		String expected = 
				  "😍" + EOL
				+ "😍" + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇"+ EOL
				+ "😇"+ EOL
				+ "😇" + EOL;

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

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();
		
		boolean actual = bottleTest.receive(Emojis.ANGEL);
		boolean expected = true;

		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {



		Emojis[] vec = new Emojis[7];

		vec[6] = Emojis.LOVE;
		vec[5] = Emojis.LOVE;

		for (int i = 0; i < vec.length-2; i++) {
			vec[i] = Emojis.ANGEL;
		}

		bottleTest = new Bottle(vec);
		
		bottleTest.pourOut();
		bottleTest.pourOut();
		
		bottleTest.receive(Emojis.ANGEL);

		String actual = bottleTest.toString();
		String expected = Table.empty + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL
				+ "😇" + EOL;

		assertEquals(expected, actual);
	}

	@Test
	void test8() {



	Emojis[] vec = new Emojis[7];

	vec[6] = Emojis.LOVE;
	vec[5] = Emojis.LOVE;

	for (int i = 0; i < vec.length-2; i++) {
		vec[i] = Emojis.ANGEL;
	}

	bottleTest = new Bottle(vec);
	
	bottleTest.pourOut();
	bottleTest.pourOut();
	
	boolean actual = bottleTest.receive(Emojis.LOVE);
	boolean expected = false;

	assertEquals(expected, actual);
}	
	
	@Test
	void test9() {

	Emojis[] vec = new Emojis[7];

	vec[6] = Emojis.LOVE;
	vec[5] = Emojis.LOVE;

	for (int i = 0; i < vec.length-2; i++) {
		vec[i] = Emojis.ANGEL;
	}

	bottleTest = new Bottle(vec);
	
	
	
	boolean actual = bottleTest.receive(Emojis.LOVE);
	boolean expected = false;

	assertEquals(expected, actual);
}
	
}
