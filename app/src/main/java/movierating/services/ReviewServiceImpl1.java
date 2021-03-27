package movierating.services;

import movierating.models.Movie;
import movierating.models.Review;
import movierating.models.User;
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
    public void addReview(String userName, String movieName, int rating) {

        User user = this.userRepository.getUsers().get(userName);
        if (user == null) {
            System.out.println("He is not a user of this Service");
            return;
        }
        Review review = new Review(user, rating);
        Movie movie = this.movieRepository.getMovies().get(movieName);
        if (movie == null) {
            System.out.println("Movie is not released yet");
            return;
        }

        movie.getReviewList().add(review);
        user.incrementTotalReviewsAndPromoteUserType();

    }
}
