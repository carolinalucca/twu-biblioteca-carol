package com.twu.biblioteca.application;

import com.twu.biblioteca.models.Movie;
import com.twu.biblioteca.repository.MovieRepository;

public class MoviesPresenter {

    public void present(MovieRepository movieRepository) {
        System.out.println(MessagePresenter.LIST_MOVIES);
        listOfMovies(movieRepository);
        System.out.println();
    }

    private void listOfMovies(MovieRepository movieRepository) {
        for (Movie movie : movieRepository.getAvailableMovies()) {
            System.out.println(movie.formatMovie());
        }
    }
}
