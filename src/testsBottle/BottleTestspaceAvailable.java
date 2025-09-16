package testsBottle;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BottleTestspaceAvailable {

	private Bottle bottleTest;

	
	@Test
	void test1() {

		Balls[] vec = new Balls[7];

		bottleTest = new Bottle(vec);

		int actual = bottleTest.spaceAvailable();
		int expected = 7;

		assertEquals(expected, actual);

	}
	
	@Test
	void test2() {

		Balls[] vec = new Balls[7];
		vec[0] = Balls.BALL1;
		
		bottleTest = new Bottle(vec);

		
		int actual = bottleTest.spaceAvailable();
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
		
		bottleTest = new Bottle(vec);

		
		int actual = bottleTest.spaceAvailable();
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
		
		bottleTest = new Bottle(vec);

		bottleTest.pourOut();
		
		int actual = bottleTest.spaceAvailable();
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
		
		bottleTest = new Bottle(vec);

		bottleTest.pourOut();
		
		
		int actual = bottleTest.spaceAvailable();
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
		
		bottleTest = new Bottle(vec);

		bottleTest.pourOut();
		
		bottleTest.receive(vec[2]);
		
		int actual = bottleTest.spaceAvailable();
		int expected = 1;
		

		assertEquals(expected, actual);

	}
	
	@Test
	void test7() {

		
		bottleTest = new Bottle();

		
		int actual = bottleTest.spaceAvailable();
		int expected = 5;
		

		assertEquals(expected, actual);

	}
	
	@Test
	void test8() {

		
		bottleTest = new Bottle();

		bottleTest.receive(Emojis.ANGEL);
		
		int actual = bottleTest.spaceAvailable();
		int expected = 4;
		

		assertEquals(expected, actual);

	}

}
