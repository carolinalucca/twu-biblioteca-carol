package com.twu.biblioteca.checkout;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.books.BookRepository;

public class CheckoutRepository {

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
