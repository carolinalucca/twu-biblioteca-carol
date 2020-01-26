package com.twu.biblioteca.application;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.bean.CheckoutBean;

import java.util.Scanner;

public class CheckoutPresenter {

    private Scanner scan;
    private CheckoutBean checkoutBean;

    public CheckoutPresenter() {
        scan = new Scanner(System.in);
        checkoutBean = new CheckoutBean();
    }

    public void present(BookRepository bookRepository) {
        System.out.println("Type the name of the book:");
        String bookTitle = scan.nextLine();
        System.out.println(checkoutBean.checkoutBook(bookRepository, bookTitle));

    }
}
