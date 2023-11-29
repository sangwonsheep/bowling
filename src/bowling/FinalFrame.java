package bowling;

public class FinalFrame implements Frame{

    private static final int FINAL_FRAME = 3;
    private static final int SECOND_SHOT = 2;
    private static final int FINAL_SHOT = 1;
    
    @Override
    public boolean hasTurn() {
        return false;
    }

    @Override
    public void playBawling(int pinCount) {

    }
}
