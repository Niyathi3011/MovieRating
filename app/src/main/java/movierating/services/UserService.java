package movierating.services;

import movierating.exceptions.AddUserException;
import movierating.models.User;
import movierating.repositories.UserRepository;

public interface UserService {

    public void addUser(User user) throws AddUserException;
}
