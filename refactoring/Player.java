package refactoring;

public class Player {

    private Integer score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public Integer getScore() {
        return score;
    }

    public void wonPoint() {
        score++;
    }

    public Boolean isName(String name) {
        return this.name == name;
    }

    public String getName() {
        return name;
    }

    public Boolean isWon(Player player) {
        return score >= 4 && (score - player.getScore()) >= 2;
    }

    public Boolean isAdvantage(Player player) {
        return score >= 4 && (score - player.getScore()) == 1;
    }

    public Boolean isDraw(Player player) {
        return score.equals(player.getScore());
    }
}
