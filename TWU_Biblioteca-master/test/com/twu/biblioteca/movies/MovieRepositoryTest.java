package com.twu.biblioteca.movies;

import com.twu.biblioteca.models.Movie;
import com.twu.biblioteca.repository.MovieRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MovieRepositoryTest {

    public MovieRepository movieRepository;
    public Movie movie1;
    public Movie movie2;
    public Movie movie3;

    @Before
    public void init() {
        movie1 = new Movie("Almost Famous", 2000, "Cameron Crowe", 7.9);
        movie2 =  new Movie("Inside Out", 2015, "Pete Docter", 9.2);
        movie3 = new Movie("Eternal Sunshine of the Spotless Mind", 2004, "Michel Gondry", 8.3);
        movieRepository = new MovieRepository();
        List<Movie> movieList = new ArrayList<>();
        movieList.addAll(Arrays.asList(movie1, movie2, movie3));
        movieRepository.setMovieList(movieList);
    }

    @Test
    public void shouldReturnAListOf3Movies() {
        assertEquals(3, movieRepository.getMovieList().size());
    }


}
