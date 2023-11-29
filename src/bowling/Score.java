package bowling;

import java.util.Arrays;

public class Score {

    private static final int FIRST_SHOT = 0;
    private static final int SECOND_SHOT = 1;
    private static final int FINAL_SHOT = 2;

    private static final int NORMAL_FRAME = 2;
	private static final int FINAL_FRAME = 3;

    private static final int NORMAL_FRAME_FIRST_TURN = 2;

    private static final int FINAL_FRAME_FIRST_TURN = 3;
    private static final int FINAL_FRAME_SECOND_TURN = 2;

    private int[] shotScores;
    private String state;

    public Score(int frameState) {
        if(frameState == FINAL_FRAME) {
            shotScores = new int[FINAL_FRAME];
        }
        shotScores = new int[NORMAL_FRAME];
        state = "NORMAL";
    }

    public int[] getShotScores() {
        return shotScores;
    }

    public String getState() {
        return state;
    }

    public void setScore(int pinCount, int turn) {
        if(shotScores.length == FINAL_FRAME) {
            finalFrameSetScore(pinCount, turn);
            return;
        }
        normalFrameSetScore(pinCount, turn);
    }

    public int getTotalScore() {
        return Arrays.stream(shotScores).sum();
    }

    public boolean hasFinalTurn() {
        return shotScores[FIRST_SHOT] + shotScores[SECOND_SHOT] >= 10;
    }

    private void finalFrameSetScore(int pinCount, int turn) {
        switch (turn) {
            case FINAL_FRAME_FIRST_TURN:
                shotScores[FIRST_SHOT] = pinCount;
                break;
            case FINAL_FRAME_SECOND_TURN:
                shotScores[SECOND_SHOT] = pinCount;
                break;
            default:
                shotScores[FINAL_SHOT] = pinCount;
                break;
        }
    }

    private void normalFrameSetScore(int pinCount, int turn) {
        switch (turn) {
            case NORMAL_FRAME_FIRST_TURN:
                shotScores[FIRST_SHOT] = pinCount;
                break;
            default:
                shotScores[SECOND_SHOT] = pinCount;
                break;
        }
    }

    public void calculateState() {
        if(shotScores[FIRST_SHOT] == 10) {
            state = "STRIKE";
            return;
        }

        if(shotScores[FIRST_SHOT] + shotScores[SECOND_SHOT] == 10){
            state = "SPARE";
            return;
        }
    }
}
