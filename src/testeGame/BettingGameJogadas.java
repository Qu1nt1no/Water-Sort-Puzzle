package testeGame;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BettingGameJogadas {

	
	
	public String EOL = Table.EOL;
	
		

	@Test
	void test1() {
		
		BettingFillingGame game;
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
		int score  = 100;
		int bet = 50;
		int maxPlays = 5;

		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		game.play(2,3);
		
		
		int actual = game.jogadas();
		int expected = 1;

		assertEquals(expected, actual);

	}
	
	@Test
	void test2() {
	
BettingFillingGame game;
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
		int score  = 100;
		int bet = 50;
		int maxPlays = 5;

		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		int actual = game.jogadas();
		int expected = 0;

		assertEquals(expected, actual);

	}

}
