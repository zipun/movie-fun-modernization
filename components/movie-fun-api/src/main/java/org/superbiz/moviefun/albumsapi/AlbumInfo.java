package org.superbiz.moviefun.albumsapi;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AlbumInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String artist;
    private String title;
    private int year;
    private int rating;

    public AlbumInfo(Long id, String artist, String title, int year, int rating) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumInfo albumInfo = (AlbumInfo) o;
        return year == albumInfo.year &&
                rating == albumInfo.rating &&
                Objects.equals(id, albumInfo.id) &&
                Objects.equals(artist, albumInfo.artist) &&
                Objects.equals(title, albumInfo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, artist, title, year, rating);
    }

    public Long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}
