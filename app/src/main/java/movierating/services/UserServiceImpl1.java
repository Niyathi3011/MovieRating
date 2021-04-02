package movierating.services;

import movierating.exceptions.AddUserException;
import movierating.models.User;
import movierating.repositories.UserRepository;

public class UserServiceImpl1 implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) throws AddUserException {
        if (userRepository.getUsers().containsValue(user))
            throw new AddUserException("He is already a user of this Service" + user.getUserName());
        this.userRepository.getUsers().put(user.getUserName(), user);
    }
}
