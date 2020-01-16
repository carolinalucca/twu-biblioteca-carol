package com.twu.biblioteca.models;

public class Books {

    private String title;
    private String author;
    private Integer year;
    private Boolean checkout;

    public Books(String title, String author, Integer year, Boolean checkOut) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.checkout = checkOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Boolean getCheckedout() { return checkout; }

    public String formatBook() {
        return " - " + getTitle() + " | " + getAuthor() + " | " + getYear() + "\n";
    }

}
