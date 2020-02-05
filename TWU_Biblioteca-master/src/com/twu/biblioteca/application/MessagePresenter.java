package com.twu.biblioteca.application;

public class MessagePresenter {

    public static final String WELCOME = "\nWelcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    public static final String GOODBYE = "\nThank you for the visit!";
    public static final String INVALID = "\nInvalid option!";
    public static final String LIST_BOOKS = "\nList of books:";
    public static final String LIST_MOVIES = "\nList of movies:";
    public static final String CHECKOUT_BOOK_SUCCESS = "\nThank you! Enjoy the book";
    public static final String CHECKOUT_BOOK_ERROR = "\nSorry, that book is not available";
    public static final String CHECKOUT_MOVIE_SUCCESS = "\nThank you! Enjoy the movie";
    public static final String CHECKOUT_MOVIE_ERROR = "\nSorry, that movie is not available";
    public static final String RETURN_SUCCESS = "\nThank you for returning the book";
    public static final String RETURN_ERROR = "\nThat is not a valid book to return";

    public void welcome() {
        System.out.println(WELCOME);
    }

    public void goodbye() {
        System.out.println(GOODBYE);
    }

    public void invalid() {
        System.out.println(INVALID);
    }

}
