package dao;

import models.User;

public interface Users {
    User findByUsername(String user);
    Long insert(User user);
}
