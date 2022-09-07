package refactoring;

public class WinScore extends Score {

    public WinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public Boolean isAppliable() {
        return player1.hasWonAgainst(player2) || player2.hasWonAgainst(player1);
    }

    @Override
    public String toString() {
        return "Win for " + playerWhoWon().getName();
    }

    private Player playerWhoWon() {
        return player1.hasWonAgainst(player2) ? player1 : player2;
    }
}