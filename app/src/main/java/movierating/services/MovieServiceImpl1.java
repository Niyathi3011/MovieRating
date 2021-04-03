package movierating.services;

import movierating.exceptions.MovieReleasedException;
import movierating.models.Movie;
import movierating.repositories.MovieRepository;

public class MovieServiceImpl1 implements MovieService {


    private final MovieRepository movieRepository;

    public MovieServiceImpl1(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public void addMovie(Movie movie) throws MovieReleasedException {

        if (movieRepository.getMovies()!=null && movieRepository.getMovies().containsValue(movie))
            throw new MovieReleasedException(movie.getMovieName());
        movieRepository.getMovies().put(movie.getMovieName(), movie);
        movieRepository.toString();
    }
}
