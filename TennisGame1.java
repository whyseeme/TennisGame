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
        {
            switch (player1_score)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (above4Score())
        {
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
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1_score;
                else { score+="-"; tempScore = player2_score;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    @Override
    public boolean isEnd() {
        return isEnd;
    }

}
