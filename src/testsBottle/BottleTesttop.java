package testsBottle;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BottleTesttop {

	private Bottle bottleTest;

	@Test
	public void test1() {
		Filling[] vec = new Filling[1];
		bottleTest = new Bottle(vec);
		assertThrows(
						ArrayIndexOutOfBoundsException.class,
						() -> bottleTest.top(),
						"Expected top() to throw, but it didn't"
		);
	}

	@Test
	void test2() {

		Filling[] vec = new Filling[7];
		vec[0] = Balls.BALL1;

		bottleTest = new Bottle(vec);


		Filling actual = bottleTest.top();
		Filling expected = Balls.BALL1;

		assertEquals(expected,actual);
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


		Filling actual = bottleTest.top();
		Filling expected = Balls.BALL1;

		assertEquals(expected,actual);
	}

	@Test
	void test4() {

		Filling[] vec = new Filling[5];
		vec[0] = Emojis.LOVE;

		for (int i = 1; i < vec.length; i++) {
			vec[i] = Emojis.ANGEL;
		}
		bottleTest = new Bottle(vec);

		bottleTest = new Bottle(vec);


		Filling actual = bottleTest.top();
		Filling expected = Emojis.ANGEL;

		assertEquals(expected,actual);
	}

	@Test
	void test5() {

		Filling[] vec = new Filling[2];
		vec[0] = Emojis.LOVE;
		vec[1] = Emojis.ANGEL;


		bottleTest = new Bottle(vec);

		bottleTest = new Bottle(vec);

		bottleTest.pourOut();

		Filling actual = bottleTest.top();
		Filling expected = Emojis.LOVE;

		assertEquals(expected,actual);
	}

	@Test
	void test6() {

		Filling[] vec = new Filling[3];
		vec[0] = Emojis.LOVE;
		vec[1] = Emojis.ANGEL;


		bottleTest = new Bottle(vec);

		bottleTest = new Bottle(vec);

		bottleTest.receive(Emojis.ANGEL);

		Filling actual = bottleTest.top();
		Filling expected = Emojis.ANGEL;

		assertEquals(expected,actual);
	}

}
