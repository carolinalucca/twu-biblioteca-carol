package com.twu.biblioteca.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnFormatMovie() {
        String expected = " - Almost Famous | 2000 | Cameron Crowe | 7.9";
        Movie movie = new Movie("Almost Famous", 2000, "Cameron Crowe", 7.9);
        assertEquals(expected, movie.formatMovie());
    }
}
