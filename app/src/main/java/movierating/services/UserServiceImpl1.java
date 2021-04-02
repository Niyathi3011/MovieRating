package movierating.services;

import movierating.exceptions.UserAlreadyExistsException;
import movierating.models.User;
import movierating.repositories.UserRepository;

public class UserServiceImpl1 implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) throws UserAlreadyExistsException {
        if (userRepository.getUsers().containsValue(user))
            throw new UserAlreadyExistsException(user.getUserName());
        this.userRepository.getUsers().put(user.getUserName(), user);
    }
}
