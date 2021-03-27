package movierating.models;

public class ReviewTestCase {

    private final String commandName;
    private final String userName;
    private final String movieName;
    private final int rating;

    public ReviewTestCase(String userName, String movieName, int rating) {
        this.commandName="add_review";
        this.userName = userName;
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getUserName() {
        return userName;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getRating() {
        return rating;
    }
}
