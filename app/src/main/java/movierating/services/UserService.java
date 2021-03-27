package movierating.services;

import movierating.models.User;
import movierating.repositories.UserRepository;

public interface UserService {

    public void addUser(User user);
}
