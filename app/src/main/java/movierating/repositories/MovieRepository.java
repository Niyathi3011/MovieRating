package movierating.repositories;

import movierating.models.Movie;
import movierating.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieRepository {

    private Map<String, Movie> movies;

    public MovieRepository() {
        this.movies = new HashMap<>();
    }

    public Map<String, Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "MovieRepository{" +
                "movies=" + movies +
                '}';
    }
}
