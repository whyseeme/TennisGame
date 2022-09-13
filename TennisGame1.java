package game;

public class TennisGame1 implements TennisGame {

    private int player1_score = 0;
    private int player2_score = 0;
    private boolean isEnd = false;

    private boolean sameScore() {
        return player1_score == player2_score;
    }

    private boolean above4Score() {
        return player1_score >= 4 || player2_score >= 4;
    }

    private boolean advantageP1() {
        return player1_score - player2_score == 1;
    }

    private boolean advantageP2() {
        return player1_score - player2_score == -1;
    }

    private boolean winP1() {
        return player1_score - player2_score >= 2;
    }

    private String getScore(int score) {
        String[] name = {"Love", "Fifteen", "Thirty", "Forty"};

        return name[score];
    }

    private String scoreForTie() {
        if (player1_score > 2)
            return "Deuce";
        else
            return getScore(player1_score) + "-All";
    }

    private String scoreForAtLeastOneAbove4() {
        String score;

        if (advantageP1())
            score ="Advantage player1";
        else if (advantageP2())
            score ="Advantage player2";
        else if (winP1()) {
            score = "Win for player1";
            isEnd = true;
        }
        else {
            score ="Win for player2";
            isEnd = true;
        }

        return score;
    }
    private String scoreForBothBelow4() {
        return getScore(player1_score) + "-" + getScore(player2_score);
    }

    public TennisGame1() {

    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1_score += 1;
        else
            player2_score += 1;

    }

    @Override
    public String getLiteralScore() {
        String score = "";
        int tempScore=0;

        if (sameScore())
            return scoreForTie();
        else if (above4Score())
            return scoreForAtLeastOneAbove4();
        else
            return scoreForBothBelow4();
    }

    @Override
    public boolean isEnd() {
        return isEnd;
    }

}
