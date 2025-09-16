package testeGame;

import types.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BettingGameprovideHelp {

	private BettingFillingGame game;
	
	public String EOL = Table.EOL;
	
		
	@Test
	void test1() {
		
		
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
		int score  = 1000;
		int bet = 50;
		int maxPlays = 5;
		
		

		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		game.provideHelp();
		
		String actual = game.toString();
		String expected = "Score: 1000" + EOL
				+ "😃    😒    😡    ⬜    ⬜    ⬜    ⚪    "+EOL
				+ "😒    😡    😡    ⬜    ⬜    ⬜    ⚪    "+EOL
				+ "😒    😒    😃    ⬜    ⬜    ⬜    ⚪    "+EOL
				+ "😃    😡    😃    ⬜    ⬜    ⬜    ⬜    "+EOL
				+ "Status: 0 moves have been used until now. You still have 4 moves left."+EOL;

		assertEquals(expected, actual);

	}

	
	@Test
	void test2() {
		Filling[] symbols = Emojis.values();
		int numberOfUsedSymbols = 3;
		int seed =1;
		int bootleSize = 4;
		int score  = 1000;
		int bet = 50;
		int maxPlays = 5;
		
		game = new BettingFillingGame(symbols, numberOfUsedSymbols, seed, bootleSize, score, bet, maxPlays);

		game.provideHelp();
		game.provideHelp();
		game.provideHelp();
		game.provideHelp();
		game.provideHelp();
		
		String actual = game.toString();
		String expected = 
				 "Score: 900" + EOL
				 + "😃    😒    😡    ⬜    ⬜    ⬜    ⚪    ⚪    ⚪    ⚪    ⚪    "+ EOL
				 + "😒    😡    😡    ⬜    ⬜    ⬜    ⚪    ⚪    ⚪    ⚪    ⚪    "+ EOL
				 + "😒    😒    😃    ⬜    ⬜    ⬜    ⚪    ⚪    ⚪    ⚪    ⚪    "+ EOL
				 + "😃    😡    😃    ⬜    ⬜    ⬜    ⬜    ⬜    ⬜    ⬜    ⬜    "+ EOL
				 + "Status: This round is finished."+ EOL
				 + "0 moves were used." + EOL;

		assertEquals(expected, actual);


	}

}
