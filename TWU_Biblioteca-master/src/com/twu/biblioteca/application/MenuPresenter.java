package com.twu.biblioteca.application;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.repository.UserRepository;

import java.util.Scanner;

public class MenuPresenter {

    private BookRepository bookRepository;
    private MovieRepository movieRepository;
    private MessagePresenter messagePresenter;
    private BooksPresenter booksPresenter;
    private Scanner scan;
    private CheckoutPresenter checkoutPresenter;
    private ReturnPresenter returnPresenter;
    private MoviesPresenter moviesPresenter;
    private LoginPresenter loginPresenter;
    private UserRepository userRepository;

    public MenuPresenter() {
        bookRepository = new BookRepository();
        movieRepository = new MovieRepository();
        messagePresenter = new MessagePresenter();
        booksPresenter = new BooksPresenter();
        checkoutPresenter = new CheckoutPresenter();
        returnPresenter = new ReturnPresenter();
        moviesPresenter = new MoviesPresenter();
        loginPresenter = new LoginPresenter();
        userRepository = new UserRepository();
        scan = new Scanner(System.in);
    }

    public void present() {

        int option = 0;
        bookRepository.init();
        movieRepository.init();
        userRepository.init();

        if (loginPresenter.present(userRepository)) {

            do {

                System.out.println("------------- MENU -------------");
                System.out.println("1 - List of books");
                System.out.println("2 - Checkout book");
                System.out.println("3 - Return book");
                System.out.println("4 - List of movies");
                System.out.println("5 - Checkout movie");
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
                    case 3:
                        returnPresenter.present(bookRepository);
                        break;
                    case 4:
                        moviesPresenter.present(movieRepository);
                        break;
                    case 5:
                        checkoutPresenter.present(movieRepository);
                        break;
                    default:
                        messagePresenter.invalid();
                        break;
                }

            } while (option != 0);

        } else {
            System.out.println("Login Error!");
        }
    }
}
