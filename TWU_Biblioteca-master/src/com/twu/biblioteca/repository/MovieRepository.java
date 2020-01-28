package com.twu.biblioteca.repository;

import com.twu.biblioteca.models.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieRepository {

    private List<Movie> movieList = new ArrayList<>();

    public void init() {
        Movie movie1 = new Movie("Almost Famous                        ", 2000, "Cameron Crowe       ", 7.9, false);
        Movie movie2 = new Movie("Inside Out                           ", 2015, "Pete Docter         ", 9.2, false);
        Movie movie3 = new Movie("Eternal Sunshine of the Spotless Mind", 2004, "Michel Gondry       ", 8.3, false);
        Movie movie4 = new Movie("The Godfather                        ", 1972, "Francis Ford Coppola", 9.2, false);
        Movie movie5 = new Movie("Pulp Fiction                         ", 1994, "Quentin Tarantino   ", 8.9, false);
        Movie movie6 = new Movie("Schindler's List                     ", 1993, "Steven Spielberg    ", 8.9, false);
        Movie movie7 = new Movie("2001: A Space Odyssey                ", 1968, "Stanley Kubrick     ", 8.3, false);
        Movie movie8 = new Movie("The Silence of the Lambs             ", 1991, "Jonathan Demme      ", 8.6, false);
        Movie movie9 = new Movie("Titanic                              ", 1997, "James Cameron       ", 7.8, false);
        Movie movie10 = new Movie("Inception                            ", 2010, "Christopher Nolan   ", 8.8, false);

        movieList.addAll(Arrays.asList(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10));
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getAvailableMovies() {
        List<Movie> list = new ArrayList<>();
        for (Movie movie : getMovieList()) {
            if (Boolean.FALSE.equals(movie.getCheckout())) {
                list.add(movie);
            }
        }
        return list;
    }

}
