package movierating.services;

import movierating.models.Movie;
import movierating.models.Review;
import movierating.repositories.MovieRepository;
import movierating.repositories.UserRepository;

public interface ReviewService {

    public void addReview(String[] fields);
}
