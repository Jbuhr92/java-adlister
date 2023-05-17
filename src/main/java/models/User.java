package models;

public class User {
    private long id;
    private String user;
    private String email;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(long id, String user) {
        this.id = id;
        this.user = user;
    }

    public User(String user, String email, String password) {
        this.user = user;
        this.email = email;
        this.password = password;
    }

    public User(long id, String user, String email, String password) {
        this.id = id;
        this.user = user;
        this.email = email;
        this.password = password;
    }
}
