package refactoring;

public class DrawScore extends Score {

    public DrawScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public Boolean isOK() {
        return player1.isDraw(player2);
    }

    @Override
    public String toString() {
        return player1.getScore() > 2 ? "Deuce" : nameFor(player1.getScore()) + "-All";
    }
}
