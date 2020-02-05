package com.twu.biblioteca.models;

public class Movie {

    private String title;
    private Integer year;
    private String director;
    private Double rating;
    private Boolean checkout;

    public Movie(String title, Integer year, String director, Double rating, Boolean checkout) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checkout = checkout;
    }

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

    public Boolean getCheckout() { return checkout; }

    public void setCheckout(Boolean checkout) {
        this.checkout = checkout;
    }

    public String formatMovie() {
        return " - " + getTitle() + " | " + getYear() + " | " + getDirector() + " | " + getRating();
    }
}
