package movierating.repositories;

import movierating.models.Movie;
import movierating.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> userList;


    public UserRepository() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }
}
