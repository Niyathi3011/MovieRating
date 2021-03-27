package movierating.repositories;

import movierating.models.Movie;
import movierating.models.User;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<Movie> movieList;

    public MovieRepository() {
        this.movieList = new ArrayList<>();
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
