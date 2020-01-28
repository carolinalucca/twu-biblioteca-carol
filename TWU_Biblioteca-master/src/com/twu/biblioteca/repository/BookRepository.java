package com.twu.biblioteca.repository;

import com.twu.biblioteca.models.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepository {

    private List<Book> bookList = new ArrayList<>();

    public void init() {
        Book book1 = new Book("Mr. Mercedes                         ", "Stephen King       ", 2016, false);
        Book book2 = new Book("Lord of the Rings                    ", "J. R. R. Tolken    ", 1954, false);
        Book book3 = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling      ", 1997, false);
        Book book4 = new Book("The Catcher in the Rye               ", "J. D. Salinger     ", 1951, false);
        Book book5 = new Book("The Great Gatsby                     ", "F. Scott Fitzgerald", 1925, false);
        Book book6 = new Book("1984                                 ", "George Orwell      ", 1984, false);
        Book book7 = new Book("Pride and Prejudice                  ", "Jane Austin        ", 1813, false);
        Book book8 = new Book("Thus Spoke Zarathustra               ", "Friedrich Nietzsche", 1883, false);
        Book book9 = new Book("A Clockwork Orange                   ", "Anthony Burgess    ", 1962, false);
        Book book10 = new Book("The Count of Monte Cristo            ", "Alexandre Dumas    ", 1844, false);

        bookList.addAll(Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));
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

    public Boolean returnBook(String bookTitle) {
        for (Book book : getBookList()) {
            if (bookTitle.equalsIgnoreCase(book.getTitle())) {
                book.setCheckout(false);
                return true;
            }
        }
        return false;
    }

}
