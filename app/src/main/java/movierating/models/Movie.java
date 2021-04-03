package movierating.models;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final String movieName;
    private final int releaseYear;
    private final List<Review> reviewList;
    private final String genre;
    private int totalReviewScore;


    public Movie(String movieName, Integer releaseYear, String genre) {
        System.out.println("movie instance is called");
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.reviewList = new ArrayList<>();
        this.totalReviewScore = 0;
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

    public double getAverageReviewScore() {

        return (double) this.getTotalReviewScore() / reviewList.size();

    }

    public int getTotalReviewScore() {
        return totalReviewScore;
    }

    public void incrementTotalReviewScore(int rating) {
        totalReviewScore += rating;
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
