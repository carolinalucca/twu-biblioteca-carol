package com.twu.biblioteca.application;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.bean.CheckoutBean;
import com.twu.biblioteca.repository.MovieRepository;

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

    public void present(MovieRepository movieRepository) {
        System.out.println("Type the name of the movie:");
        String movieTitle = scan.nextLine();
        System.out.println(checkoutBean.checkoutMovie(movieRepository, movieTitle));
    }
}
