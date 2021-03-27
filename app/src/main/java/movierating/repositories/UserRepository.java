package movierating.repositories;

import movierating.models.Movie;
import movierating.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private Map<String, User> userMap;


    public UserRepository() {
        this.userMap = new HashMap<>();
    }

    public Map<String, User> getUserList() {
        return userMap;
    }
}
