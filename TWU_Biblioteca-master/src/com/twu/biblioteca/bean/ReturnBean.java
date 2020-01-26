package com.twu.biblioteca.bean;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.repository.BookRepository;

public class ReturnBean {

    public String returnBook(BookRepository bookRepository, String bookTitle) {
        if (bookRepository.returnBook(bookTitle)) {
            return MessagePresenter.RETURN_SUCCESS;
        } else {
            return MessagePresenter.RETURN_ERROR;
        }
    }
}
