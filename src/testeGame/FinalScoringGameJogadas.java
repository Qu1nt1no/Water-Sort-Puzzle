package testeGame;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FinalScoringGameJogadas {

	
	
	public String EOL = Table.EOL;
	
		

	@Test
	void test1() {
		
		FinalScoringFillingGame game;
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
		

		game = new FinalScoringFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize);

		game.play(2,3);
		
		
		int actual = game.jogadas();
		int expected = 1;

		assertEquals(expected, actual);

	}
	
	@Test
	void test2() {
	
		FinalScoringFillingGame game;
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
	
		game = new FinalScoringFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize);
		
		int actual = game.jogadas();
		int expected = 0;

		assertEquals(expected, actual);

	}

}
