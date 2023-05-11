package models;

public class Album {

    private Long albumId;

    private String artist;

    private String recordName;

    private int releaseDate;

    private double sales;

    private String genre;

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Album() {
    }

    public Album(Long albumId, String artist, String recordName, int releaseDate, double sales, String genre) {
        this.albumId = albumId;
        this.artist = artist;
        this.recordName = recordName;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }
}
