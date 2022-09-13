package game;

public class TennisGame1 implements TennisGame {

    private int player1_score = 0;
    private int player2_score = 0;
    private boolean isEnd = false;

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
        if (player1_score==player2_score)
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
        else if (player1_score>=4 || player2_score>=4)
        {
            int score_gap = player1_score-player2_score;
            if (score_gap==1) score ="Advantage player1";
            else if (score_gap ==-1) score ="Advantage player2";
            else if (score_gap>=2) {
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
