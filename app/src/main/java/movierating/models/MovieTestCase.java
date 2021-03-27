package movierating.models;

public class MovieTestCase {

    private final String command;
    private final String movieName;
    private final int year;
    private final String genre;

    public MovieTestCase(String movieName, int year, String genre) {
        this.command = "Add Movie";
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
    }

    public String getCommand() {
        return command;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
