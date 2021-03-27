package movierating.services;

import movierating.repositories.MovieRepository;

public class MovieServiceImpl1 implements MovieService {


    private final MovieRepository movieRepository;

    public MovieServiceImpl1(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public void addMovie(String[] strings) {

    }
}
