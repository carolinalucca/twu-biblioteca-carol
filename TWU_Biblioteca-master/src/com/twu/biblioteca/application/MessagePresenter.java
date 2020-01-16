package com.twu.biblioteca.application;

public class MessagePresenter {

    public static final String WELCOME = "\nWelcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    public static final String GOODBYE = "\nThank you for the visit!";
    public static final String INVALID = "\nInvalid option!";
    public static final String LIST_BOOKS = "\nList of books:";
    public static final String CHECKOUT_SUCESS = "\nThank you! Enjoy the book";

    public void welcome() {
        System.out.println(WELCOME);
    }

    public void goodbye() {
        System.out.println(GOODBYE);
    }

    public void invalid() {
        System.out.println(INVALID);
    }

    public void listOfBooks() {
        System.out.println(LIST_BOOKS);
    }

    public void checkoutSucess() {
        System.out.println(CHECKOUT_SUCESS);
    }

}
