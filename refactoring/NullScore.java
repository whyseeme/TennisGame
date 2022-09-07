package refactoring;

public class NullScore extends Score {

    public NullScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public Boolean isAppliable() {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }
}