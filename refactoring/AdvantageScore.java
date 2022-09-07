package refactoring;

public class AdvantageScore extends Score {

    public AdvantageScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public Boolean isAppliable() {
        return player1.hasAdvantageOver(player2) || player2.hasAdvantageOver(player1);
    }

    @Override
    public String toString() {
        return "Advantage " + playerInAdvantage().getName();
    }

    private Player playerInAdvantage() {
        return player1.hasAdvantageOver(player2) ? player1 : player2;
    }
}