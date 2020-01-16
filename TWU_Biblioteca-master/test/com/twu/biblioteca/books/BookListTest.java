package com.twu.biblioteca.books;

import com.twu.biblioteca.models.Books;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class BookListTest {

    @Test
    public void shouldReturnFormatBook() {
        String expected = " - Mr. Mercedes | Stephen King | 2016\n";
        Books actual = new Books("Mr. Mercedes", "Stephen King", 2016, false);
        assertEquals(expected, actual.formatBook());
    }

    @Test
    public void shouldReturnAListOf3Books() {
        assertEquals(3, new BookListing().getBookListing().size());
    }
}
