package refactoring;

import java.util.Arrays;
import java.util.List;

public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;
    private List<Score> ScoreLists;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);

        ScoreLists = Arrays.asList(
                new NormalScore(player1, player2),
                new DrawScore(player1, player2),
                new AdvantageScore(player1, player2),
                new WinScore(player1, player2));
    }

    public void wonPoint(String playerName) {
        if (player1.isName(playerName))
            player1.wonPoint();
        else
            player2.wonPoint();
    }

    public String getLiteralScore() {
        for (Score score : ScoreLists) {
            if (score.isOK()) {
                return score.toString();
            }
        }
        return "";
    }

    @Override
    public boolean isEnd() {
        Score winScore = new WinScore(player1, player2);
        return winScore.isOK();
    }

}
