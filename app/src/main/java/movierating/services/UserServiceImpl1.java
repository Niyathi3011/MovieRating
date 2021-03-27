package movierating.services;

import movierating.models.User;
import movierating.repositories.UserRepository;

public class UserServiceImpl1 implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        this.userRepository.getUsers().put(user.getUserName(), user);
    }
}
