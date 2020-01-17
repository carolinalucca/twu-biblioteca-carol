package com.twu.biblioteca.models;

import com.twu.biblioteca.models.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldReturnFormatBook() {
        String expected = " - Mr. Mercedes | Stephen King | 2016";
        Book actual = new Book("Mr. Mercedes", "Stephen King", 2016, false);
        assertEquals(expected, actual.formatBook());
    }
}
