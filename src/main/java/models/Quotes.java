package models;

public class Quotes {

    private Long id;

    private String content;

    private Authors author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    public Quotes() {
    }

    public Quotes(Long id, String content, Authors author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}