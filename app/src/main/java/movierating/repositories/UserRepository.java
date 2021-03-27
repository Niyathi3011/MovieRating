package movierating.repositories;

import movierating.models.User;

import java.util.List;

public class UserRepository implements Repository{

    private final List<User> userList;

    public UserRepository(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}
