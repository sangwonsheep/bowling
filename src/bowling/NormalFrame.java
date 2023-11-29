package bowling;

public class NormalFrame implements Frame{

    private static final int NORMAL_FRAME = 2;
    private static final int TOTAL_PIN = 10;

    private int turn;
    private int firstShot;
    private int secondShot;

    public NormalFrame(int frameNumber) {
        this.firstShot = 0;
        this.secondShot = 0;
        turn = NORMAL_FRAME;
    }

    @Override
    public boolean hasTurn() {
        return turn > 0;
    }

    @Override
    public void playBawling(int pinCount) {
        setScore(pinCount);
        setTurn();
    }

    private void setScore(int pinCount) {
        if(!hasTurn()){
            secondShot = pinCount;
            return;
        }
        firstShot = pinCount;
    }

    private void setTurn() {
        if(firstShot == TOTAL_PIN){
            turn -= 2;
            return;
        }
        turn--;
    }

}
