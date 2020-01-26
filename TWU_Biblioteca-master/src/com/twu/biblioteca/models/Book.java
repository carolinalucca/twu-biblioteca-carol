package com.twu.biblioteca.models;

public class Book {

    private String title;
    private String author;
    private Integer year;
    private Boolean checkout;

    public Book(String title, String author, Integer year, Boolean checkOut) {
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

    public void setCheckout(Boolean checkout) {
        this.checkout = checkout;
    }

    public String formatBook() {
        return " - " + getTitle() + " | " + getAuthor() + " | " + getYear();
    }

}
