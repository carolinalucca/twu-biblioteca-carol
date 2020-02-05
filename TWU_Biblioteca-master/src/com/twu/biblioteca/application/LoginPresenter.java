package com.twu.biblioteca.application;

import com.twu.biblioteca.models.User;
import com.twu.biblioteca.repository.UserRepository;

import java.util.Scanner;

public class LoginPresenter {

    private Scanner scan = new Scanner(System.in);

    public Boolean present(UserRepository userRepository) {
        System.out.println("------------- Login -------------");
        System.out.println("Library number:");
        return loginValidation(userRepository);
    }

    private Boolean loginValidation(UserRepository userRepository) {
        String libraryNumber = scan.nextLine();
        User user = userRepository.libraryNumberValidation(libraryNumber);
        if ( user != null) {
            System.out.println("Password:");
            String password = scan.nextLine();
            if (userRepository.passwordValidation(user, password)) {
                return true;
            }
        }
        return false;
    }
}
