package logic;

public enum Direction {
    RIGHT   ("W prawo"),
    LEFT    ("W lewo"),
    FORWARD ("W przód"),
    BACK    ("Do tyłu"),
    STOP    ("Zatrzymany");

    private final String description;

    private Direction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
