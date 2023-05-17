package dao;

import com.mysql.cj.jdbc.Driver;

import config.Config;
import models.Ad;
import models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(){
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
    public List<Ad> all() {
        Users usersDao = new UsersDao();
        List<User> users = usersDao.all();

        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
            while (resultSet.next()) {
              long user_id = resultSet.getLong("user_id");
                User adUser = null;
                for (User user : users)
                    if (user.getId() == user_id) {
                        adUser = user;
                    }
                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        adUser,
                        resultSet.getString("title"),
                        resultSet.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        String query = "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setLong(1, ad.getUser().getId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());

            stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();

            if(resultSet.next()){
                return resultSet.getLong(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
