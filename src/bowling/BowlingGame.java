package bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private static final int FINAL_FRAME = 10;

    private Player player;
    private List<Frame> frames;
    private View view;

    public BowlingGame(Player player) {
        this.player = player;
        this.frames = new ArrayList<>();
        this.view = new View();
        setFrames();
    }

    public void startGame() {
        for(Frame frame : frames) {
            playGame(frame);
        }
        view.showBowlingGame(frames, player);
    }

    private void playGame(Frame frame) {
        Pins pin = new Pins();
        while(frame.hasTurn()) {
            int pinCount = pin.rollingBall();
            frame.playBowling(pinCount);
        }
        pin.resetPin();
    }

    private void setFrames() {
        for(int i = 1; i <= FINAL_FRAME; i++) {
            if(i == FINAL_FRAME) {
                frames.add(new FinalFrame(i));
                return;
            }
            frames.add(new NormalFrame(i));
        }
    }
}
