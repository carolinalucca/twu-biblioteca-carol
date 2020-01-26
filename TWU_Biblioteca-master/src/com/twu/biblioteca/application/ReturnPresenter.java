package com.twu.biblioteca.application;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.bean.ReturnBean;

import java.util.Scanner;

public class ReturnPresenter {

    private Scanner scan;
    private ReturnBean returnBean;

    public ReturnPresenter() {
        scan = new Scanner(System.in);
        returnBean = new ReturnBean();
    }

    public void present(BookRepository bookRepository) {
        System.out.println("Type the name of the book:");
        String bookTitle = scan.nextLine();
        System.out.println(returnBean.returnBook(bookRepository, bookTitle));
    }

}
