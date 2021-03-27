package movierating.models;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final String movieName;
    private final int releaseYear;
    private final List<Review> reviewList;
    private final String genre;
    private int averageReviewScore;


    public Movie(String movieName, int releaseYear, String genre) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.reviewList = new ArrayList<>();
        this.averageReviewScore = 0;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public int getAverageReviewScore() {
        return averageReviewScore;

    }

    public List<Review> getReviewList() {
        return reviewList;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", releaseYear=" + releaseYear +
                ", reviewList=" + reviewList +
                ", genre='" + genre + '\'' +
                '}';
    }

}
