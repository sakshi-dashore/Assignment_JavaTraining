package com.movie.service;

import java.util.List;

import com.movie.model.Movie;

public interface MovieService {

	void insertMovie(Movie movie);

	void updateMovie(Movie movie);

	Movie getMovieById(int movieId);

	Movie getMovieByName(String movieName);

	void deleteMovieById(int movieId);

	List<Movie> getAllMovies();
}
