package com.twu.biblioteca.application;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.models.Book;

public class BooksPresenter {

    public void present(BookRepository bookRepository) {
        System.out.println(MessagePresenter.LIST_BOOKS);
        listOfBooks(bookRepository);
        System.out.println();
    }

    private void listOfBooks(BookRepository bookRepository) {
        for (Book book : bookRepository.getAvailableBooks()) {
            System.out.println(book.formatBook());
        }
    }

}
