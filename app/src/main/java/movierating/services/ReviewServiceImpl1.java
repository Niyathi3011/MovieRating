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

        int userIndex = -1, i = 0;
        for (User user : userRepository.getUserList()) {
            if (user.getUserName().equals(userName)) {
                userIndex = i;
                break;
            }
            i++;
        }

        if (userIndex == -1) {
            System.out.println("He is not a user of the service");
            return;
        }

        int movieIndex = -1, j = 0;
        for (Movie movie : movieRepository.getMovieList()) {
            if (movie.getMovieName().equals(movieName)) {
                movie.getReviewList().add(new Review(userRepository.getUserList().get(userIndex), Integer.valueOf(rating)));
                movieIndex = j;
                break;
            }
            j++;
        }

        if (movieIndex == -1)
            System.out.println("Movie is not released yet");
    }
}
