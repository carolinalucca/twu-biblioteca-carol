package com.twu.biblioteca.bean;

import com.twu.biblioteca.application.MessagePresenter;
import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReturnBeanTest {

    public BookRepository bookRepository;
    public Book book1;
    public ReturnBean returnBean;

    @Before
    public void init() {
        bookRepository = new BookRepository();
        returnBean = new ReturnBean();
        book1 = new Book("Mr. Mercedes", "Stephen King", 2016, false);
        List<Book> list = new ArrayList<>();
        list.addAll(Arrays.asList(book1));
        bookRepository.setBookList(list);
    }

    @Test
    public void shouldReturnASuccessMessageWhenReturnBookSuccessfully() {
        assertEquals(MessagePresenter.RETURN_SUCCESS, returnBean.returnBook(bookRepository, "Mr. Mercedes"));
    }

    @Test
    public void shouldReturnAErrorMessageWhenTryToReturnAnInvalidBook() {
        assertEquals(MessagePresenter.RETURN_ERROR, returnBean.returnBook(bookRepository, "Test"));
    }
}
