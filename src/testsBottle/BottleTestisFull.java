package testsBottle;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BottleTestisFull {

	private Bottle bottleTest;

	
	@Test
	void test1() {

		Balls[] vec = new Balls[7];

		bottleTest = new Bottle(vec);

		boolean actual = bottleTest.isFull();
		boolean expected = false;

		assertEquals(actual, expected);

	}
	
	@Test
	void test2() {

		Balls[] vec = new Balls[7];
		vec[0] = Balls.BALL1;
		
		bottleTest = new Bottle(vec);

		
		boolean actual = bottleTest.isFull();
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
		
		bottleTest = new Bottle(vec);

		
		boolean actual = bottleTest.isFull();
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
		
		bottleTest = new Bottle(vec);

		bottleTest.pourOut();
		
		boolean actual = bottleTest.isFull();
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
		
		bottleTest = new Bottle(vec);

		bottleTest.pourOut();
		
		boolean actual = bottleTest.isFull();
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
		
		bottleTest = new Bottle(vec);
		
		bottleTest.receive(vec[2]);
		
		boolean actual = bottleTest.isFull();
		boolean expected = true;

		assertEquals(actual, expected);

	}

}
