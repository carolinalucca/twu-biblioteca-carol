package com.twu.biblioteca;

import com.twu.biblioteca.application.BooksPresenter;
import com.twu.biblioteca.application.MenuPresenter;
import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.books.BookListing;

import java.io.IOException;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {

        MessagePresenter messagePresenter = new MessagePresenter();
        MenuPresenter menuPresenter = new MenuPresenter();
        BooksPresenter booksPresenter = new BooksPresenter();
        Scanner scan = new Scanner(System.in);

        messagePresenter.welcome();

        int option = 0;

        do {

            menuPresenter.present();
            option = scan.nextInt();

            switch (option) {
                case 0:
                    messagePresenter.goodbye();
                    break;
                case 1:
                    messagePresenter.listOfBooks();
                    booksPresenter.listOfBooks(new BookListing());
                    break;
                case 2:
                    break;
                default:
                    messagePresenter.invalid();
                    break;
            }

        }while(option != 0);
    }
}
