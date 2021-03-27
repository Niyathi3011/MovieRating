package movierating.services;

import movierating.repositories.Repository;

public class UserService {

    private final Repository repository;

    public UserService(Repository repository) {
        this.repository = repository;
    }
}
