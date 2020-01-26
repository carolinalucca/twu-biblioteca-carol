package com.twu.biblioteca.models;

public class Movie {

    private String title;
    private Integer year;
    private String director;

    public Movie(String title, Integer year, String director, Double rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    private Double rating;

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public Double getRating() {
        return rating;
    }

    public String formatMovie() {
        return " - " + getTitle() + " | " + getYear() + " | " + getDirector() + " | " + getRating();
    }
}
