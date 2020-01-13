package com.twu.biblioteca.models;

import com.twu.biblioteca.listing.BookListing;

public class Books {

    private String title;
    private String author;
    private Integer year;

    public Books(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
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

    public String listOfBooks() {
        String list = "";

        return list;
    }

    //TODO metodo de listar (string)
    //TODO init - chamar no construtor do objeto


}
