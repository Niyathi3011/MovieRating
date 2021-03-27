package movierating.services;

import movierating.repositories.Repository;

public class MovieService {

    private final Repository repository;



    public MovieService(Repository repository) {
        this.repository = repository;
    }
}
