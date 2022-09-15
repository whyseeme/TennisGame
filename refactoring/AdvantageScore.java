package refactoring;

public class AdvantageScore extends Score {

    private Player playerInAdvantage() {
        return player1.isAdvantage(player2) ? player1 : player2;
    }

    public AdvantageScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public Boolean isOK() {
        return player1.isAdvantage(player2) || player2.isAdvantage(player1);
    }

    @Override
    public String toString() {
        return "Advantage " + playerInAdvantage().getName();
    }
}
