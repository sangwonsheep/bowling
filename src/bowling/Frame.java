package bowling;

public interface Frame {

	boolean hasTurn();
	
	void playBowling(int pinCount);

	int[] getScore();

	int getTotalScore();

	int getFrameNumber();

	String getState();
}
