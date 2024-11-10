package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {

    @Id
    private String id;
    private String title;
    private String genre;
    private boolean popular;
    private String posterUrl;
    public Movie(String id, String title, String genre, boolean popular, String posterUrl) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.popular = popular;
        this.posterUrl = posterUrl;
    }
    
    public Movie() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public boolean isPopular() {
        return popular;
    }
    public void setPopular(boolean popular) {
        this.popular = popular;
    }
    public String getPosterUrl() {
        return posterUrl;
    }
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }


    // Constructors, Getters, and Setters
    
}