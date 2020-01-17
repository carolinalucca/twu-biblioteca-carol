package com.twu.biblioteca.books;

import com.twu.biblioteca.models.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepository {

    private List<Book> bookList = new ArrayList<>();

    public void init() {
        Book book1 = new Book("Mr. Mercedes", "Stephen King", 2016, false);
        Book book2 = new Book("Lord of the Rings", "J. R. R. Tolken", 1954, false);
        Book book3 = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997, false);

        bookList.addAll(Arrays.asList(book1, book2, book3));
        this.bookList = bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> getAvailableBooks() {
        List<Book> list = new ArrayList<>();
        for (Book book : getBookList()) {
            if (Boolean.FALSE.equals(book.getCheckedout())) {
                list.add(book);
            }
        }
        return list;
    }

    public Boolean checkout(String bookTitle) {
        for (Book book : getBookList()) {
            if (bookTitle.equalsIgnoreCase(book.getTitle())) {
                book.setCheckout(true);
                return true;
            }
        }
        return false ;
    }

}
