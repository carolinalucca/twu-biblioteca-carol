package com.twu.biblioteca;

import com.twu.biblioteca.application.BooksPresenter;
import com.twu.biblioteca.application.MenuPresenter;
import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.books.BookRepository;

import java.io.IOException;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {

        MessagePresenter messagePresenter = new MessagePresenter();
        MenuPresenter menuPresenter = new MenuPresenter();

        messagePresenter.welcome();
        menuPresenter.present();

    }
}
