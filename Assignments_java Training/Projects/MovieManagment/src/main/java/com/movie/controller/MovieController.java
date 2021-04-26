package com.movie.controller;


import org.springframework.web.servlet.ModelAndView;

import com.movie.model.Movie;

public interface MovieController {

	void insertMovie(Movie movie);

	void updateMovie(Movie movie);

	ModelAndView getMovieById(int movieId);

	ModelAndView getMovieByName(String movieName);

	void deleteMovieById(int movieId);

	ModelAndView getAllMovies();

}
