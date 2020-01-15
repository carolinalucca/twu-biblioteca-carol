package com.twu.biblioteca.listing;

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
        Books book3 = new Books("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997, false);

        bookList.addAll(Arrays.asList(book1, book2, book3));
        this.bookList = bookList;
    }

    private List<Books> getBookListing() {
        return bookList;
    }

    public String listOfBooks() {
        StringBuilder list = new StringBuilder();
        for (Books book : getBookListing()) {
            if (Boolean.FALSE.equals(book.getCheckedout())) {
                list.append(" - ").append(book.getTitle()).append(" | ").append(book.getAuthor()).append(" | ").append(book.getYear()).append("\n");
            }
        }
        return list.toString();
    }

}
