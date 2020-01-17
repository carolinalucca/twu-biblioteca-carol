package com.twu.biblioteca.application;

import com.twu.biblioteca.books.BookRepository;

import java.util.Scanner;

public class MenuPresenter {

    private BookRepository bookRepository;
    private MessagePresenter messagePresenter;
    private BooksPresenter booksPresenter;
    private Scanner scan;
    private CheckoutPresenter checkoutPresenter;

    public MenuPresenter() {
        bookRepository = new BookRepository();
        messagePresenter = new MessagePresenter();
        booksPresenter = new BooksPresenter();
        checkoutPresenter = new CheckoutPresenter();
        scan = new Scanner(System.in);
    }

    public void present() {

        int option = 0;
        bookRepository.init();

        do {

            System.out.println("------------- MENU -------------");
            System.out.println("1 - List of books");
            System.out.println("2 - Checkout book");
            System.out.println("0 - Exit");
            System.out.println("--------------------------------");
            System.out.println("Type an option: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 0:
                    messagePresenter.goodbye();
                    break;
                case 1:
                    booksPresenter.present(bookRepository);
                    break;
                case 2:
                    checkoutPresenter.present(bookRepository);
                    break;
                default:
                    messagePresenter.invalid();
                    break;
            }

        }while(option != 0);
    }
}
