package movierating.services;

import movierating.repositories.MovieRepository;
import movierating.repositories.UserRepository;

public interface ReviewService {

    public void addReview(String[] input);
}
