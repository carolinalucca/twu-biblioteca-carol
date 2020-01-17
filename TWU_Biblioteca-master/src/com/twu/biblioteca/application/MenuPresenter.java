package com.twu.biblioteca.application;

import com.twu.biblioteca.books.BookRepository;

import java.util.Scanner;

public class MenuPresenter {

    private MessagePresenter messagePresenter;
    private BooksPresenter booksPresenter;
    private Scanner scan;

    public MenuPresenter() {
        messagePresenter = new MessagePresenter();
        booksPresenter = new BooksPresenter();
        scan = new Scanner(System.in);
    }

    public void present() {

        int option = 0;

        do {

            System.out.println("------------- MENU -------------");
            System.out.println("1 - List of books");
            System.out.println("2 - Checkout book");
            System.out.println("0 - Exit");
            System.out.println("--------------------------------");
            System.out.println("Type an option: ");
            option = scan.nextInt();

            switch (option) {
                case 0:
                    messagePresenter.goodbye();
                    break;
                case 1:
                    booksPresenter.present();
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
