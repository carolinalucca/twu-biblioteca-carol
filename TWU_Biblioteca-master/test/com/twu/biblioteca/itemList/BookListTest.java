package com.twu.biblioteca.itemList;

import com.twu.biblioteca.listing.BookListing;
import com.twu.biblioteca.models.Books;
import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class BookListTest {

    private Books book1;
    private BookListing bookListing;

    @Before
    public void init() {
        book1 = new Books("Mr. Mercedes", "Stephen King", 2016, false);
        bookListing = new BookListing();
    }

    @Test
    public void getBookTitle() {
        assertEquals("Mr. Mercedes", book1.getTitle());
    }

    @Test
    public void getBookAuthor() {
        assertEquals("Stephen King", book1.getAuthor());
    }

    @Test
    public void shouldReturnFormatBook() {
        String expected = " - Mr. Mercedes | Stephen King | 2016\n";
        Books actual = new Books("Mr. Mercedes", "Stephen King", 2016, false);
        assertEquals(expected, actual.formatBook());
    }

    @Test
    public void shouldReturnAListOfBooksWithoutTheCheckedOut() {
        String expected = " - Mr. Mercedes | Stephen King | 2016\n" + " - Lord of the Rings | J. R. R. Tolken | 1954";
        assertEquals(expected.trim(), bookListing.listOfBooks().trim());
    }
}
