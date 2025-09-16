package tests;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BootleTestspaceAvailable {

	private Bottle bootleTest;

	
	@Test
	void test1() {

		Balls[] vec = new Balls[7];

		bootleTest = new Bottle(vec);

		int actual = bootleTest.spaceAvailable();
		int expected = 7;

		assertEquals(expected, actual);

	}
	
	@Test
	void test2() {

		Balls[] vec = new Balls[7];
		vec[0] = Balls.BALL1;
		
		bootleTest = new Bottle(vec);

		
		int actual = bootleTest.spaceAvailable();
		int expected = 6;

		assertEquals(expected, actual);

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

		
		int actual = bootleTest.spaceAvailable();
		int expected = 0;

		assertEquals(expected, actual);

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
		
		int actual = bootleTest.spaceAvailable();
		int expected = 1;

		assertEquals(expected, actual);

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
		
		int actual = bootleTest.spaceAvailable();
		int expected = 2;

		assertEquals(expected, actual);

	}
	
	@Test
	void test6() {

		Balls[] vec = new Balls[5];
		vec[0] = Balls.BALL1;
		vec[1] = Balls.BALL1;
		vec[2] = Balls.BALL1;
		vec[3] = Balls.BALL1;
		
		bootleTest = new Bottle(vec);

		bootleTest.pourOut();
		
		bootleTest.receive(vec[2]);
		
		int actual = bootleTest.spaceAvailable();
		int expected = 1;
		
		System.out.println(actual);

		assertEquals(expected, actual);

	}

}
