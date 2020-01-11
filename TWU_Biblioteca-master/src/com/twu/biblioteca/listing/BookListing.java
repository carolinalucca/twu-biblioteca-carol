package com.twu.biblioteca.listing;

import com.twu.biblioteca.models.Books;

import java.util.ArrayList;
import java.util.List;

public class BookListing {

    private List<Books> bookList;

    public BookListing(List<Books> bookList) {
        this.bookList = bookList;
    }

    public List<String> getBookListing() {
        List<String> list = new ArrayList<String>();
        for (Books book : bookList) {
            list.add(book.getTitle());
        }
        return list;
    }
}
