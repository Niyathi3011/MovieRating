package movierating.repositories;

import movierating.models.Movie;
import movierating.models.User;

import java.util.List;

public class UserRepository {

    private final List<User> userList;

    public UserRepository(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}
