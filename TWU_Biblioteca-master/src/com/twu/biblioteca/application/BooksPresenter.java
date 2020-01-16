package com.twu.biblioteca.application;

import com.twu.biblioteca.books.BookListing;
import com.twu.biblioteca.models.Books;

public class BooksPresenter {

    public void listOfBooks(BookListing bookListing) {
        StringBuilder list = new StringBuilder();
        for (Books book : bookListing.getBookListing()) {
            if (Boolean.FALSE.equals(book.getCheckedout())) {
                list.append(book.formatBook());
            }
        }
        System.out.println(list.toString());
    }

}
