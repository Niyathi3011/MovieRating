package movierating.services;

import movierating.exceptions.UserAlreadyExistsException;
import movierating.models.User;

public interface UserService {

    public void addUser(User user) throws UserAlreadyExistsException;
}
