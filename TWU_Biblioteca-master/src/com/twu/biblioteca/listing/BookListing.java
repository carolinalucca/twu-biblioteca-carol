package com.twu.biblioteca.listing;

import com.twu.biblioteca.models.Books;

import java.util.ArrayList;
import java.util.List;

public class BookListing {

    private List<Books> bookList;

    public BookListing(List<Books> bookList) {
        this.bookList = bookList;
    }

    public List<String> getBookTitle() {
        List<String> titleList = new ArrayList<String>();
        for (Books book : bookList) {
            titleList.add(book.getTitle());
        }
        return titleList;
    }

    public List<String> getBookAuthor() {
        List<String> authorList = new ArrayList<String>();
        for (Books book : bookList) {
            authorList.add(book.getAuthor());
        }
        return authorList;
    }

    public List<Integer> getBookYear() {
        List<Integer> yearList = new ArrayList<Integer>();
        for (Books book : bookList) {
            yearList.add(book.getYear());
        }
        return yearList;
    }

    public List<Books> getBookListing() {
        return bookList;
    }
}
