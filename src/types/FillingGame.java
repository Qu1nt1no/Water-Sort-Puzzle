package types;

public interface FillingGame {

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void play(int x, int y);
	
	/**
	 * 
	 * @return
	 */
	public boolean isRoundFinished();
	
	/**
	 * 
	 */
	public void startNewRound();
	
	/**
	 * 
	 */
	public void provideHelp();
	
	/**
	 * 
	 * @param x
	 * @return
	 */
	public Filling top (int x);
	
	/**
	 * 
	 * @param x
	 * @return
	 */
	public boolean singleFilling(int x);
	
	
	/**
	 * 
	 * @return
	 */
	public int score();


}
