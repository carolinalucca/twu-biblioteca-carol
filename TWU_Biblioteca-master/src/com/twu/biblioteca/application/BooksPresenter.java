package com.twu.biblioteca.application;

import com.twu.biblioteca.books.BookRepository;
import com.twu.biblioteca.models.Book;

public class BooksPresenter {

    private BookRepository bookRepository;

    public BooksPresenter() {
        bookRepository = new BookRepository();
        bookRepository.init();
    }

    public void present() {
        System.out.println(MessagePresenter.LIST_BOOKS);
        listOfBooks();
        System.out.println();
    }

    private void listOfBooks() {
        for (Book book : bookRepository.getAvailableBooks()) {
            System.out.println(book.formatBook());
        }
    }

}
