package models;

import java.util.List;

public class Authors {

    private Long authorID;

    private String firstName;

    private String lastName;

    private List<Quotes> getQuotes;

    public List<Quotes> getGetQuotes() {
        return getQuotes;
    }

    public void setGetQuotes(List<Quotes> getQuotes) {
        this.getQuotes = getQuotes;
    }

    public Long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Long authorID) {
        this.authorID = authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Authors() {
    }

    public Authors(Long authorID, String firstName, String lastName) {
        this.authorID = authorID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Authors(Long authorID, String firstName, String lastName, List<Quotes> getQuotes) {
        this.authorID = authorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.getQuotes = getQuotes;
    }
}