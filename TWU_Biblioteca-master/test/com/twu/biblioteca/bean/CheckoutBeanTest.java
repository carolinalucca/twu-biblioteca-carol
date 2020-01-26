package com.twu.biblioteca.bean;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.models.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CheckoutBeanTest {

    public BookRepository bookRepository;
    public Book book1;
    public CheckoutBean checkoutBean;

    @Before
    public void init() {
        bookRepository = new BookRepository();
        checkoutBean = new CheckoutBean();
        book1 = new Book("Mr. Mercedes", "Stephen King", 2016, false);
        List<Book> list = new ArrayList<>();
        list.addAll(Arrays.asList(book1));
        bookRepository.setBookList(list);
    }

    @Test
    public void shouldReturnASuccessMessageWhenBookIsAvailable() {
        assertEquals(MessagePresenter.CHECKOUT_SUCCESS, checkoutBean.checkoutBook(bookRepository, "Mr. Mercedes"));
    }

    @Test
    public void shouldReturnAnErrorMessageWhenBookIsNotAvailableOrMisspelled() {
        assertEquals(MessagePresenter.CHECKOUT_ERROR, checkoutBean.checkoutBook(bookRepository, "Test"));

    }
}
