package testsBottle;

import types.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BottleTestsize {

	private Bottle bottleTest;

	
	@Test
	void test1() {

		Balls[] vec = new Balls[7];

		bottleTest = new Bottle(vec);

		int actual = bottleTest.size();
		int expected = 7;

		assertEquals(actual, expected);

	}
	
	@Test
	void test2() {

		Balls[] vec = new Balls[5];
		vec[0] = Balls.BALL1;
		
		bottleTest = new Bottle(vec);

		
		int actual = bottleTest.size();
		int expected = 5;
		
		assertEquals(actual, expected);

	}
	
	@Test
	void test3() {

		bottleTest = new Bottle();

		
		int actual = bottleTest.size();
		int expected = 5;
		
		assertEquals(actual, expected);

	}
	
	

}
