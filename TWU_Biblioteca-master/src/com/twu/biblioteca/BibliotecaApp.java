package com.twu.biblioteca;

import com.twu.biblioteca.listing.BookListing;
import com.twu.biblioteca.models.Books;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {

        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        int opcao = 0;

        System.out.println("\n" + welcomeMessage.toUpperCase());
        System.out.println("-------------------------");
        System.out.println("1 - List of books");
        System.out.println("-------------------------");

        Scanner scan = new Scanner(System.in);
        opcao = scan.nextInt();

        switch(opcao) {
            case 0:
                break;
            case 1:
                Books book1 = new Books("Mr. Mercedes", "Stephen King", 2016);
                Books book2 = new Books("Lord of the Rings", "J. R. R. Tolken", 1954);
                Books book3 = new Books("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997);

                BookListing booksList = new BookListing(Arrays.asList(book1, book2, book3));

                System.out.println("\nList of Books:");
                for (Books book : booksList.getBookListing()) {
                    System.out.println(" - " + book.getTitle() + " | " + book.getAuthor() + " | " + book.getYear());
                }
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
}
