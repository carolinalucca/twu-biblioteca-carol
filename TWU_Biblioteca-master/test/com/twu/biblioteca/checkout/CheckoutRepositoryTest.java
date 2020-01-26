package com.twu.biblioteca.checkout;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.books.BookRepository;
import com.twu.biblioteca.models.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CheckoutRepositoryTest {

    public BookRepository bookRepository;
    public Book book1;
    public CheckoutRepository checkoutRepository;

    @Before
    public void init() {
        bookRepository = new BookRepository();
        checkoutRepository = new CheckoutRepository();
        book1 = new Book("Mr. Mercedes", "Stephen King", 2016, false);
        List<Book> list = new ArrayList<>();
        list.addAll(Arrays.asList(book1));
        bookRepository.setBookList(list);
    }

    @Test
    public void shouldReturnASuccessMessageWhenBookIsAvailable() {
        assertEquals(MessagePresenter.CHECKOUT_SUCESS, checkoutRepository.checkoutBook(bookRepository, "Mr. Mercedes"));
    }

    @Test
    public void shouldReturnAnErrorMessageWhenBookIsNotAvailableOrMisspelled() {
        assertEquals(MessagePresenter.CHECKOUT_ERROR, checkoutRepository.checkoutBook(bookRepository, "Test"));

    }
}
