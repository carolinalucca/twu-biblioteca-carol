package com.twu.biblioteca.repository;

import com.twu.biblioteca.models.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    private User user1;
    private User user2;
    private User user3;
    private UserRepository userRepository;

    @Before
    public void init() {
        userRepository = new UserRepository();
        user1 = new User("111-1111", "teste1");
        user2 = new User("222-2222", "teste2");
        user3 = new User("333-3333", "teste3");
        List<User> userList = new ArrayList<>();
        userList.addAll(Arrays.asList(user1, user2, user3));
        userRepository.setUserList(userList);
    }

    @Test
    public void shouldReturnAListWith3Users() {
        assertEquals(3, userRepository.getUserList().size());
    }

    @Test
    public void shouldReturnAUserWhenLibraryNumberExists() {
        assertNotNull(userRepository.libraryNumberValidation("111-1111"));
    }

    @Test
    public void shouldReturnNullWhenLibraryNumberNotExists() {
        assertNull(userRepository.libraryNumberValidation("444-44444"));
    }

    @Test
    public void shouldReturnTrueWhenThePasswordIsCorrect() {
        assertTrue(userRepository.passwordValidation(user1, "teste1"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsIncorrect() {
        assertFalse(userRepository.passwordValidation(user1, "testeErro"));
    }

}
