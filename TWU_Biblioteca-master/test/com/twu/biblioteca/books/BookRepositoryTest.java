package com.twu.biblioteca.books;

import com.twu.biblioteca.models.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class BookRepositoryTest {

    public BookRepository bookRepository;
    public Book book1;
    public Book book2;
    public Book book3;

    @Before
    public void init() {
        bookRepository = new BookRepository();
        book1 = new Book("Mr. Mercedes", "Stephen King", 2016, false);
        book2 = new Book("Lord of the Rings", "J. R. R. Tolken", 1954, false);
        book3 = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997, true);
        List<Book> list = new ArrayList<>();
        list.addAll(Arrays.asList(book1, book2, book3));
        bookRepository.setBookList(list);
    }

    @Test
    public void shouldReturnAListOf3Books() {
        assertEquals(3, bookRepository.getBookList().size());
    }

    @Test
    public void shouldReturnAListOfAvailableBooks() {
        assertEquals(2, bookRepository.getAvailableBooks().size());
    }

    @Test
    public void shouldReturnAnAvailableBook() {
        String bookTitle = "Mr. Mercedes";
        assertTrue(bookRepository.checkout(bookTitle));
    }
}
