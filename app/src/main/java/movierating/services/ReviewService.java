package movierating.services;

import movierating.repositories.Repository;

public class ReviewService {

    private final Repository repository;

    public ReviewService(Repository repository) {
        this.repository = repository;
    }
}
