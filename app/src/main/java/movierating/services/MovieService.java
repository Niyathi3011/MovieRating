package movierating.services;

import movierating.models.Movie;
import movierating.repositories.MovieRepository;
import movierating.repositories.UserRepository;

public interface MovieService {

    public void addMovie(Movie movie);

}
