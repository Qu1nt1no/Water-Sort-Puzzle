package tests;

import types.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BootleTestsize {

	private Bottle bootleTest;

	
	@Test
	void test1() {

		Balls[] vec = new Balls[7];

		bootleTest = new Bottle(vec);

		boolean actual = bootleTest.isFull();
		boolean expected = false;

		assertEquals(actual, expected);

	}
	
	@Test
	void test2() {

		Balls[] vec = new Balls[7];
		vec[0] = Balls.BALL1;
		
		bootleTest = new Bottle(vec);

		
		boolean actual = bootleTest.isFull();
		boolean expected = false;

		assertEquals(actual, expected);

	}
	
	@Test
	void test3() {

		Balls[] vec = new Balls[5];
		vec[0] = Balls.BALL1;
		vec[1] = Balls.BALL1;
		vec[2] = Balls.BALL1;
		vec[3] = Balls.BALL1;
		vec[4] = Balls.BALL1;
		
		bootleTest = new Bottle(vec);

		
		boolean actual = bootleTest.isFull();
		boolean expected = true;

		assertEquals(actual, expected);

	}
	
	@Test
	void test4() {

		Balls[] vec = new Balls[5];
		vec[0] = Balls.BALL1;
		vec[1] = Balls.BALL1;
		vec[2] = Balls.BALL1;
		vec[3] = Balls.BALL1;
		vec[4] = Balls.BALL1;
		
		bootleTest = new Bottle(vec);

		bootleTest.pourOut();
		
		boolean actual = bootleTest.isFull();
		boolean expected = false;

		assertEquals(actual, expected);

	}
	
	@Test
	void test5() {

		Balls[] vec = new Balls[5];
		vec[0] = Balls.BALL1;
		vec[1] = Balls.BALL1;
		vec[2] = Balls.BALL1;
		vec[3] = Balls.BALL1;
		
		bootleTest = new Bottle(vec);

		bootleTest.pourOut();
		
		boolean actual = bootleTest.isFull();
		boolean expected = false;

		assertEquals(actual, expected);
	}
	
	@Test
	void test6() {

		Balls[] vec = new Balls[5];
		vec[0] = Balls.BALL1;
		vec[1] = Balls.BALL1;
		vec[2] = Balls.BALL1;
		vec[3] = Balls.BALL1;
		
		bootleTest = new Bottle(vec);
		
		bootleTest.receive(vec[2]);
		
		boolean actual = bootleTest.isFull();
		boolean expected = true;

		assertEquals(actual, expected);

	}

}
