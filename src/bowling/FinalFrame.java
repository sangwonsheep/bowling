package bowling;

public class FinalFrame implements Frame{

    private static final int FINAL_FRAME = 3;
    private static final int SECOND_TURN = 2;

    private int turn;
    private Score score;
    private int frameNumber;

    public FinalFrame(int frameNumber) {
        this.frameNumber = frameNumber;
        turn = FINAL_FRAME;
        score = new Score(turn);
    }

    @Override
    public int[] getScore() {
        return score.getShotScores();
    }

    @Override
    public int getTotalScore() {
        return score.getTotalScore();
    }

    @Override
    public int getFrameNumber() {
        return frameNumber;
    }

    @Override
    public String getState() {
        return score.getState();
    }

    @Override
    public boolean hasTurn() {
        return turn > 0;
    }

    @Override
    public void playBowling(int pinCount) {
        setScore(pinCount);
        setTurn();
    }

    private void setScore(int pinCount) {
        score.setScore(pinCount, turn);
    }

    private void setTurn() {
        if(turn == SECOND_TURN && !score.hasFinalTurn()){
            turn -= 2;
        }
        turn--;
    }
}
