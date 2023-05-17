package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDao implements Users{

    private Connection connection;
    public UsersDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<User> all() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.users");
            while (resultSet.next()){
                User user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("user")
                );
                users.add(user);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public User findByUsername(String user) {
        return null;
    }

    @Override
    public void insert(User user) {

    }
}

    @Override
    public void insert(User user) {

    }
}