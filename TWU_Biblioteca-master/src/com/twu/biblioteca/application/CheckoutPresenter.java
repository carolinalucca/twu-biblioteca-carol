package com.twu.biblioteca.application;

import com.twu.biblioteca.books.BookRepository;

import java.util.Scanner;

public class CheckoutPresenter {

    private Scanner scan;

    public CheckoutPresenter() {
        scan = new Scanner(System.in);
    }

    public void present(BookRepository bookRepository) {
        System.out.println("Type the name of the book:");
        String bookTitle = scan.nextLine();
        if (bookRepository.checkout(bookTitle)) {
            System.out.println("The book was checkedout sucessfully!");
        } else {
            System.out.println("Checkout Error!");
        }
    }
}
