package dao;

import models.User;

import java.util.List;

public interface Users {
    List<User> all();
    void insert(User user);
}