package com.twu.biblioteca;

import com.twu.biblioteca.application.MenuPresenter;
import com.twu.biblioteca.application.MessagePresenter;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {

        MessagePresenter messagePresenter = new MessagePresenter();
        MenuPresenter menuPresenter = new MenuPresenter();

        messagePresenter.welcome();
        menuPresenter.present();

    }
}
