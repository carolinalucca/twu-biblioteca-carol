package com.twu.biblioteca;

import com.twu.biblioteca.listing.BookListing;
import com.twu.biblioteca.models.Books;

import java.util.Arrays;

public class BibliotecaApp {

    public static void main(String[] args) {

        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        System.out.println("\n" + welcomeMessage.toUpperCase());

        Books book1 = new Books("Mr. Mercedes", "Stephen King", 2016);
        Books book2 = new Books("Lord of the Rings", "J. R. R. Tolken", 1954);
        Books book3 = new Books("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997);

        BookListing booksList = new BookListing(Arrays.asList(book1, book2, book3));

        System.out.println("\nList of Books:");
        for (Books book : booksList.getBookListing()) {
            System.out.println(" - " + book.getTitle() + " | " + book.getAuthor() + " | " + book.getYear());
        }

    }
}
