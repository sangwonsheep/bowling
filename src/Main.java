import bowling.BowlingGame;
import bowling.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("test");
        BowlingGame bowlingGame = new BowlingGame(player);
        bowlingGame.startGame();
    }
}