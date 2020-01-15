package com.twu.biblioteca;

import com.twu.biblioteca.application.MenuPresenter;
import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.listing.BookListing;
import com.twu.biblioteca.models.Books;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {

        MessagePresenter messagePresenter = new MessagePresenter();
        MenuPresenter menuPresenter = new MenuPresenter();

        messagePresenter.welcome();

        int option = 0;

        do {

            menuPresenter.present();
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite uma opção: ");
            option = scan.nextInt();

            switch (option) {
                case 0:
                    messagePresenter.goodbye();
                    break;
                case 1:
                    BookListing booksList = new BookListing();
                    messagePresenter.listOfBooks();
                    System.out.println(booksList.listOfBooks());
                    break;
                default:
                    messagePresenter.invalid();
                    break;
            }

        }while(option != 0);
    }
}
