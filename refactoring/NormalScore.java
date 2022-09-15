package refactoring;

public class NormalScore extends Score {

    public NormalScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public Boolean isOK() {
        return player1.getScore() <= 3 && player2.getScore() <= 3;
    }

    @Override
    public String toString() {
        return nameFor(player1.getScore()) + "-" + nameFor(player2.getScore());
    }
}
