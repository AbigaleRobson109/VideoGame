package VideogameCatalogue.model;

public enum Genre {
    ACTION("Action"),
    ACTIONADVENTURE("Action Adventure"),
    ADVENTURE("Adventure"),
    RPG("Roleplaying"),
    SIM("Simulation"),
    STRATEGY("Strategy"),
    SPORTS("Sports"),
    PUZZLE("Puzzle"),
    FPS("First Person Shooter"),
    TPS("Third Person Shooter"),
    MOBA("Multiplayer Online Battle Arena"),
    FIGHTING("Fighting"),
    HORROR("Horror"),
    SURVIVAL("Survival"),
    RACING("Racing"),
    PLATFORMER("Platformer"),
    RHYTHM("Rhythm");

    private String longName;

    /**
     *
     * @param longName
     */
    Genre(String longName) {
        // TODO - implement Genre.Genre
        throw new UnsupportedOperationException();
    }

    public String getLongName() {
        return this.longName;
    }

    public String toString() {
        // TODO - implement Genre.toString
        throw new UnsupportedOperationException();
    }

}
