package movierating.services;

import movierating.repositories.MovieRepository;
import movierating.repositories.UserRepository;

public class ReviewServiceImpl1 implements ReviewService {

    private final UserRepository userRepository;
    private final MovieRepository movieRepository;

    public ReviewServiceImpl1(UserRepository userRepository, MovieRepository movieRepository) {
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
    }


    @Override
    public void addReview(String[] strings) {

    }
}
