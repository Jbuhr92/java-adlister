package config;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;

public class Config {
    public static String getUrl() {
               return "jdbc:mysql://localhost:3306/bigfoot_test_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public  static String getUser() {

       return "root";
    }
    public static String getPassword(){
       return "codeup";
    }
}
