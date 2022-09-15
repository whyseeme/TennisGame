package refactoring;

public class WinScore extends Score {

    private Player playerWhoWon() {
        return player1.isWon(player2) ? player1 : player2;
    }

    public WinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public Boolean isOK() {
        return player1.isWon(player2) || player2.isWon(player1);
    }

    @Override
    public String toString() {
        return "Win for " + playerWhoWon().getName();
    }
}
