package refactoring;

public abstract class Score {

    protected Player player1;
    protected Player player2;

    public Score(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public abstract Boolean isAppliable();

    @Override
    public abstract String toString();
}