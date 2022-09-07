package refactoring;

import java.util.Random;

public class TennisMain {

    public static void main(String[] args) {

        String player1 = "leek";
        String player2 = "lily";

        TennisGame1 game = new TennisGame1(player1, player2);
        playGame(game, player1, player2);

    }

    public static void playGame(TennisGame tennisGame, String player1, String player2) {

        Random random = new Random();

        while (!tennisGame.isEnd()) {
            if (random.nextBoolean()) {
                tennisGame.wonPoint(player1);
            } else {
                tennisGame.wonPoint(player2);
            }
            System.out.println(tennisGame.getLiteralScore());
        }
    }
}
