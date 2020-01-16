package com.twu.biblioteca.books;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CheckoutTest {

    @Test
    public void shouldCheckoutABook() {
        BookCheckout bookCheckout = new BookCheckout();
        assertTrue(bookCheckout.checkout());
    }
}
