package movierating.repositories;

import movierating.models.Movie;
import movierating.models.User;

import java.util.List;

public class MovieRepository {

    private final List<Movie> movieList;

    public MovieRepository(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
