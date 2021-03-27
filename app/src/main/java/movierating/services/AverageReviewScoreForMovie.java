package movierating.services;

import movierating.models.Movie;
import movierating.repositories.MovieRepository;

public class AverageReviewScoreForMovie {

    private final MovieRepository movieRepository;

    public AverageReviewScoreForMovie(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public double getAverageReviewScoreForMovie(String movieName) {

        if (movieRepository.getMovies() != null && movieRepository.getMovies().containsKey(movieName))
            return movieRepository.getMovies().get(movieName).getAverageReviewScore();
        else {
            System.out.println("Movie is not released yet!");
            return 0;
        }
    }
}
