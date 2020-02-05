package com.twu.biblioteca.repository;

import com.twu.biblioteca.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public void init() {
        User user1 = new User("111-1111", "teste1");
        User user2 = new User("222-2222", "teste2");
        User user3 = new User("333-3333", "teste3");

        userList.addAll(Arrays.asList(user1, user2, user3));
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User libraryNumberValidation(String libraryNumber) {
        for (User user : getUserList()) {
            if (libraryNumber.equals(user.getLibraryNumber())) {
                return user;
            }
        }
        return null;
    }

    public Boolean passwordValidation(User user, String password) {
        if (password.equals(user.getPassword())) {
            return true;
        }
        return false;
    }
}
