package refactoring;

import java.util.HashMap;
import java.util.Map;

public class NormalScore extends Score {

    public NormalScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public Boolean isOK() {
        return player1.getScore() <= 3 && player2.getScore() <= 3;
    }

    @Override
    public String toString() {
        return nameFor(player1.getScore()) + "-" + nameFor(player2.getScore());
    }

    private String nameFor(Integer score) {
        return scoreNames().get(score);
    }

    private static final Map<Integer, String> scoreNames() {
        return new HashMap<Integer, String>() {{
		            put(0, "Love");
		            put(1, "Fifteen");
		            put(2, "Thirty");
		            put(3, "Forty");
		        }};
    }
}