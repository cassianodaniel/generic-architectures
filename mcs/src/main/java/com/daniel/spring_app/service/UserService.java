package com.daniel.spring_app.service;

import com.daniel.spring_app.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
        User user = new User(1, "John", "john@gmail.com");
        userList.add(user);
    }

    public User getUser(Integer id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }
}