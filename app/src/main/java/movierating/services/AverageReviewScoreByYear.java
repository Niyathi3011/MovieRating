package movierating.services;

import movierating.models.Movie;
import movierating.repositories.MovieRepository;

public class AverageReviewScoreByYear {

    private final MovieRepository movieRepository;

    public AverageReviewScoreByYear(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public double getAverageReviewScoreByYear(int releaseYear) {

        int reviewScore = 0, count = 0;
        for (Movie movie : movieRepository.getMovies().values()) {
            if (movie.getReleaseYear() == releaseYear) {
                count += movie.getReviewList().size();
                reviewScore += movie.getTotalReviewScore();
            }
        }

        return (double) reviewScore / count;
    }
}
