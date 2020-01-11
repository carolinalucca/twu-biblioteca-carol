package com.twu.biblioteca.itemList;

import com.twu.biblioteca.models.Books;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    private Books book;

    @Before
    public void init() {
        book = new Books("Mr. Mercedes");
    }

    @Test
    public void getBookTitle() {
        assertEquals("Mr. Mercedes", book.getTitle());
    }
}
