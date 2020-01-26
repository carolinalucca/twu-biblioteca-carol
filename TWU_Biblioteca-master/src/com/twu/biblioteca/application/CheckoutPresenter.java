package com.twu.biblioteca.application;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.CheckoutReturnRepository;

import java.util.Scanner;

public class CheckoutPresenter {

    private Scanner scan;
    private CheckoutReturnRepository checkoutReturnRepository;

    public CheckoutPresenter() {
        scan = new Scanner(System.in);
        checkoutReturnRepository = new CheckoutReturnRepository();
    }

    public void present(BookRepository bookRepository) {
        System.out.println("Type the name of the book:");
        String bookTitle = scan.nextLine();
        System.out.println(checkoutReturnRepository.checkoutBook(bookRepository, bookTitle));

    }
}
