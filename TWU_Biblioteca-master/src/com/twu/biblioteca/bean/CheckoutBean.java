package com.twu.biblioteca.bean;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.repository.BookRepository;

public class CheckoutBean {

    public String checkoutBook(BookRepository bookRepository, String bookTitle) {
        if (bookRepository.checkout(bookTitle)) {
            return MessagePresenter.CHECKOUT_SUCCESS;
        } else {
            return MessagePresenter.CHECKOUT_ERROR;
        }
    }
}
