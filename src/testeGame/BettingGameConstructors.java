package testeGame;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BettingGameConstructors {

	private BettingFillingGame game;
	
	public String EOL = Table.EOL;
	
		
	@Test
	void testContrutor2() {
		
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
		int score  = 100;
		int bet = 50;
		int maxPlays = 5;
		

		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		String actual = game.toString();
		String expected = "Score: 100" + EOL +
				  "😃    😒    😡    ⬜    ⬜    ⬜    " + EOL
				+ "😒    😡    😡    ⬜    ⬜    ⬜    " + EOL
				+ "😒    😒    😃    ⬜    ⬜    ⬜    " + EOL
				+ "😃    😡    😃    ⬜    ⬜    ⬜    " + EOL
				+ "Status: 0 moves have been used until now. You still have 5 moves left." + EOL;

		assertEquals(expected, actual);

	}

}
