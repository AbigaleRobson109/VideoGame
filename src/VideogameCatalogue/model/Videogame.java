package VideogameCatalogue.model;

import java.util.ArrayList;
import java.util.Date;

public class Videogame {

    private String title;
    private Date releaseDate;
    private String developer;
    private String publisher;
    private ArrayList<Genre> genres;
    private ArrayList<Platform> platforms;

    /**
     *
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    /**
     *
     * @param releaseDate
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     *
     * @return
     */
    public String getDeveloper() {
        return this.developer;
    }

    /**
     *
     * @param developer
     */
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    /**
     *
     * @return
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     *
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     *
     * @return
     */
    public ArrayList<Genre> getGenres() {
        return this.genres;
    }

    /**
     *
     * @param genre
     * @return
     */
    public boolean addGenre(Genre genre) {
        // TODO - implement Videogame.addGenre
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param genre
     * @return
     */
    public boolean removeGenre(Genre genre) {
        // TODO - implement Videogame.removeGenre
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    public ArrayList<Platform> getPlatforms() {
        return this.platforms;
    }

    /**
     *
     * @param platforms
     */
    public void setPlatforms(Platform[] platforms) {
        // TODO - implement Videogame.setPlatforms
        throw new UnsupportedOperationException();
    }

    /**
     *
     */
    public Videogame() {
        // TODO - implement Videogame.Videogame
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param title
     */
    public Videogame(String title) {
        // TODO - implement Videogame.Videogame
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param game
     * @return
     */
    public boolean equals(Videogame game) {
        // TODO - implement Videogame.equals
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        // TODO - implement Videogame.toString
        throw new UnsupportedOperationException();
    }
}
