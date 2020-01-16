package com.twu.biblioteca.books;

import com.twu.biblioteca.models.Books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookListing {

    private List<Books> bookList = new ArrayList<>();

    public BookListing() {
        init(bookList);
    }

    public void init(List<Books> bookList) {
        Books book1 = new Books("Mr. Mercedes", "Stephen King", 2016, false);
        Books book2 = new Books("Lord of the Rings", "J. R. R. Tolken", 1954, false);
        Books book3 = new Books("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997, true);

        bookList.addAll(Arrays.asList(book1, book2, book3));
        this.bookList = bookList;
    }

    public List<Books> getBookListing() {
        return bookList;
    }

}
