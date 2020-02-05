package com.twu.biblioteca.bean;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;

public class CheckoutBean {

    public String checkoutBook(BookRepository bookRepository, String bookTitle) {
        if (bookRepository.checkout(bookTitle)) {
            return MessagePresenter.CHECKOUT_BOOK_SUCCESS;
        } else {
            return MessagePresenter.CHECKOUT_BOOK_ERROR;
        }
    }

    public String checkoutMovie(MovieRepository movieRepository, String movieTitle) {
        if (movieRepository.checkout(movieTitle)) {
            return MessagePresenter.CHECKOUT_MOVIE_SUCCESS;
        } else {
            return MessagePresenter.CHECKOUT_MOVIE_ERROR;
        }
    }
}
