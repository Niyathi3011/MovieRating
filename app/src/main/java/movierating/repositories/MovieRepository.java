package movierating.repositories;

import movierating.models.Movie;
import movierating.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieRepository {

    private Map<String, Movie> movieMap;

    public MovieRepository() {
        this.movieMap = new HashMap<>();
    }

    public Map<String,Movie> getMovieList() {
        return movieMap;
    }
}
