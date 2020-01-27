package com.twu.biblioteca.repository;

import com.twu.biblioteca.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<Movie> movieList = new ArrayList<>();

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
