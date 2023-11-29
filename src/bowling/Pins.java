package bowling;

public class Pins {
	
	private static final int MAX_BOWLING_PIN = 10;
	
	private int bowlingPins;
	
	public Pins() {
		this.bowlingPins = MAX_BOWLING_PIN;
	}

	public void rollingBall() {
		int randomNumber = (int)(Math.random() * MAX_BOWLING_PIN + 1);
		hitBowlingPin(randomNumber);
	}
	
	public void hitBowlingPin(int hitBowlingPinCount) {
		this.bowlingPins -= hitBowlingPinCount;
	}
	
}
