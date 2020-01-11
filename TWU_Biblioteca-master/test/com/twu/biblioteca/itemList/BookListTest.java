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
    private Books book2;
    private Books book3;
    private List<Books> bookList;
    private BookListing bookListing;

    @Before
    public void init() {
        book1 = new Books("Mr. Mercedes", "Stephen King", 2016);
        book2 = new Books("Lord of the Rings", "J. R. R. Tolken", 1954);
        book3 = new Books("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997);
        bookList = new ArrayList<Books>();
        bookList.addAll(Arrays.asList(book1, book2, book3));
        bookListing = new BookListing(bookList);
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
    public void getBookTitleList() {
        String[] list = new String[]{"Mr. Mercedes", "Lord of the Rings","Harry Potter and the Sorcerer's Stone"};
        assertEquals(Arrays.asList(list), bookListing.getBookTitle());
    }

    @Test
    public void getBookAuthorList() {
        String[] list = new String[]{"Stephen King", "J. R. R. Tolken", "J. K. Rowling"};
        assertEquals(Arrays.asList(list), bookListing.getBookAuthor());
    }

    @Test
    public void getBookYearList() {
        Integer[] list = new Integer[]{2016, 1954, 1997};
        assertEquals(Arrays.asList(list), bookListing.getBookYear());
    }

    @Test
    public void getBookListing() {
        Books[] list = new Books[]{book1, book2, book3};
        assertEquals(Arrays.asList(list), bookListing.getBookListing());
    }
}
