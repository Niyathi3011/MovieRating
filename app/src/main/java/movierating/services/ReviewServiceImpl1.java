package movierating.services;

import movierating.exceptions.MovieNotReleasedException;
import movierating.models.Movie;
import movierating.models.Review;
import movierating.models.User;
import movierating.models.UserType;
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
    public void addReview(String userName, String movieName, int rating) throws MovieNotReleasedException {

        User user;
        if (this.userRepository.getUsers() != null && this.userRepository.getUsers().containsKey(userName)) {
            user = this.userRepository.getUsers().get(userName);
        } else {
            System.out.println("He is not a user of this Service");
            return;
        }
        Review review = new Review(user, rating);

        Movie movie;
        if (movieRepository.getMovies() != null && movieRepository.getMovies().containsKey(movieName))
            movie = this.movieRepository.getMovies().get(movieName);
        else {
            throw new MovieNotReleasedException();
        }


        movie.getReviewList().add(review);

        if (user.getUserType() == UserType.VIEWER)
            movie.incrementTotalReviewScore(rating);
        else if (user.getUserType() == UserType.CRITIC)
            movie.incrementTotalReviewScore(rating * 2);

        user.incrementTotalReviewsAndPromoteUserType();

    }
}
