package VideogameCatalogue.model;

import java.util.ArrayList;

public class Catalogue {

    private ArrayList<Videogame> list;
    private String listName;
    private String fileName;

    public ArrayList<Videogame> getList() {
        return this.list;
    }

    /**
     *
     * @return
     */
    public String getListName() {
        return this.listName;
    }

    /**
     *
     * @param listName
     */
    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     *
     * @return
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     *
     */
    public Catalogue() {
        // TODO - implement Catalogue.Catalogue
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param listName
     */
    public Catalogue(String listName) {
        // TODO - implement Catalogue.Catalogue
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param newGame
     */
    public boolean add(Videogame newGame) {
        // TODO - implement Catalogue.add
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param newGame
     */
    public Videogame replace(Videogame newGame) {
        // TODO - implement Catalogue.replace
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param index
     */
    public Videogame remove(int index) {
        // TODO - implement Catalogue.remove
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param game
     */
    public boolean remove(Videogame game) {
        // TODO - implement Catalogue.remove
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param index
     */
    public Videogame get(int index) {
        // TODO - implement Catalogue.get
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param filters
     */
    public ArrayList<Videogame> search(String[] filters) {
        // TODO - implement Catalogue.search
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param sortBy
     */
    public void sort(String sortBy) {
        // TODO - implement Catalogue.sort
        throw new UnsupportedOperationException();
    }

    /**
     *
     */
    public void readFromFile() {
        // TODO - implement Catalogue.readFromFile
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param fileName
     */
    public void writeToFile(String fileName) {
        // TODO - implement Catalogue.writeToFile
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    public String toString() {
        // TODO - implement Catalogue.toString
        throw new UnsupportedOperationException();
    }

}
