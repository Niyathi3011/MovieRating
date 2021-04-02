package movierating.services;

import movierating.exceptions.MovieNotReleasedException;

public interface ReviewService {

    public void addReview(String userName, String movieName, int rating) throws MovieNotReleasedException;
}
