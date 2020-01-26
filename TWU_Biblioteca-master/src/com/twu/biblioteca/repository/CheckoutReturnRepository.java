package com.twu.biblioteca.repository;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.repository.BookRepository;

public class CheckoutReturnRepository {

    public String checkoutBook(BookRepository bookRepository, String bookTitle) {

        String message;

        if (bookRepository.checkout(bookTitle)) {
            message = MessagePresenter.CHECKOUT_SUCESS;
        } else {
            message = MessagePresenter.CHECKOUT_ERROR;
        }

        return message;
    }
}
