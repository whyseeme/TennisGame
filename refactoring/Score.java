package refactoring;

public abstract class Score {

    protected Player player1;
    protected Player player2;

    protected String nameFor(Integer score) {
        String [] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[score];
    }

    public Score(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public abstract Boolean isOK();

    public abstract String toString();
}
