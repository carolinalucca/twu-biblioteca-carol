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


public class BookListTest {

    private Books book1;
    private Books book2;
    private Books book3;
    private List<Books> bookList;
    private BookListing bookListing;

    @Before
    public void init() {
        book1 = new Books("Mr. Mercedes");
        book2 = new Books("Lord of the Rings");
        book3 = new Books("Harry Potter");
        bookList = new ArrayList<Books>();
        bookList.addAll(Arrays.asList(book1, book2, book3));
        bookListing = new BookListing(bookList);
    }

    @Test
    public void getBookTitle() {
        assertEquals("Mr. Mercedes", book1.getTitle());
    }

    @Test
    public void getBookTitleList() {
        String[] list = new String[]{"Mr. Mercedes", "Lord of the Rings","Harry Potter"};
        assertEquals(Arrays.asList(list), bookListing.getBookListing());
    }
}
