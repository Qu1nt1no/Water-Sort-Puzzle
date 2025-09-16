package testeGame;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BettingGamePlay {

	private BettingFillingGame game;
	
	public String EOL = Table.EOL;
	
		
	@Test
	void test1() {
		
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
		int score  = 100;
		int bet = 50;
		int maxPlays = 5;
		

		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		game.play(2,3);
		
		String actual = game.toString();
		String expected = "Score: 100" + EOL +
				  "😃    😒    ⬜    ⬜    ⬜    ⬜    " + EOL
				+ "😒    😡    ⬜    ⬜    ⬜    ⬜    " + EOL
				+ "😒    😒    😃    😡    ⬜    ⬜    " + EOL
				+ "😃    😡    😃    😡    ⬜    ⬜    " + EOL
				+ "Status: 1 moves have been used until now. You still have 4 moves left." + EOL;

		assertEquals(expected, actual);

	}
	
	@Test
	void test2() {
		
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;

		
		int score  = 100;
		int bet = 50;
		int maxPlays = 5;
		
		BettingFillingGame game;

		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		
		game.play(2,3);
		game.play(0,2);
		game.play(0,4);
		game.play(2,0);
		game.play(1,4);
		
		
		
		String actual = game.toString();
		String expected = "Score: 0" + EOL +
				      "😃    ⬜    ⬜    ⬜    ⬜    ⬜    "+ EOL
				    + "😃    😡    ⬜    ⬜    😒    ⬜    "+ EOL
				    + "😃    😒    ⬜    😡    😒    ⬜    "+ EOL
				    + "😃    😡    ⬜    😡    😒    ⬜    " + EOL
				+ "Status: This round is finished." + EOL
				+ "5 moves were used." + EOL;

		assertEquals(expected, actual);

	}

	@Test
	void test3() {
		
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;

		
		int score  = 100;
		int bet = 50;
		int maxPlays = 9;
		
		BettingFillingGame game;

		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		
		game.play(2,3);
		game.play(0,2);
		game.play(0,4);
		game.play(2,0);
		game.play(1,4);
		game.play(1,3);
		game.play(1,4);
		game.play(1,3);
		
		
		
		String actual = game.toString();
		String expected = "Score: 200" + EOL +
				 "😃    ⬜    ⬜    😡    😒    ⬜    " + EOL
			   + "😃    ⬜    ⬜    😡    😒    ⬜    " + EOL
		       + "😃    ⬜    ⬜    😡    😒    ⬜    " + EOL
		       + "😃    ⬜    ⬜    😡    😒    ⬜    " + EOL
			   + "Status: This round is finished." + EOL
			   + "8 moves were used." + EOL;

		assertEquals(expected, actual);

	}
}
