package movierating.services;

import movierating.exceptions.MovieNotReleasedException;
import movierating.exceptions.MultipleReviewsException;
import movierating.models.Movie;
import movierating.models.Review;
import movierating.repositories.MovieRepository;
import movierating.repositories.UserRepository;

public interface ReviewService {

    public void addReview(String userName, String movieName, int rating) throws MultipleReviewsException, MovieNotReleasedException;
}
