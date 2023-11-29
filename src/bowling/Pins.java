package bowling;

public class Pins {
	
	private static final int MAX_BOWLING_PIN = 10;
	
	private int bowlingPins;
	
	public Pins() {
		resetPin();
	}

	public int rollingBall() {
		int randomNumber = (int)(Math.random() * bowlingPins) + 1;
		hitBowlingPin(randomNumber);
		return randomNumber;
	}

	public void resetPin() {
		this.bowlingPins = MAX_BOWLING_PIN;
	}

	public void hitBowlingPin(int hitBowlingPinCount) {
		this.bowlingPins -= hitBowlingPinCount;
	}

}
