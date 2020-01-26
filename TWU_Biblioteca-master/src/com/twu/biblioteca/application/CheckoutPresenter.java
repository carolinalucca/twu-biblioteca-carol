package com.twu.biblioteca.application;

import com.twu.biblioteca.books.BookRepository;
import com.twu.biblioteca.checkout.CheckoutRepository;

import java.util.Scanner;

public class CheckoutPresenter {

    private Scanner scan;
    private CheckoutRepository checkoutRepository;

    public CheckoutPresenter() {
        scan = new Scanner(System.in);
        checkoutRepository = new CheckoutRepository();
    }

    public void present(BookRepository bookRepository) {
        System.out.println("Type the name of the book:");
        String bookTitle = scan.nextLine();
        System.out.println(checkoutRepository.checkoutBook(bookRepository, bookTitle));

    }
}
