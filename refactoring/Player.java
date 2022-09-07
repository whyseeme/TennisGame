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

    public Boolean isCalled(String name) {
        return this.name == name;
    }

    public String getName() {
        return name;
    }

    public Boolean hasWonAgainst(Player otherPlayer) {
        Integer advantageOverOtherPlayer = score - otherPlayer.getScore();
        return score >= 4 && advantageOverOtherPlayer >= 2;
    }

    public Boolean hasAdvantageOver(Player otherPlayer) {
        Integer advantageOverOtherPlayer = score - otherPlayer.getScore();
        return score >= 4 && advantageOverOtherPlayer.equals(1);
    }

    public Boolean isInATieWith(Player otherPlayer) {
        return score.equals(otherPlayer.getScore());
    }
}