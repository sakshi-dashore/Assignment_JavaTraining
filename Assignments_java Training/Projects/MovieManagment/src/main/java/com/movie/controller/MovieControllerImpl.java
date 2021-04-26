
package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.movie.model.Movie;
import com.movie.service.MovieService;

@Controller
public class MovieControllerImpl implements MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping("insertMovie")
	public void insertMovie(@ModelAttribute Movie movie) {
		movieService.insertMovie(movie);
	}

	@RequestMapping(name = "updateMovie", method = RequestMethod.POST)
	public void updateMovie(@ModelAttribute Movie movie) {
		movieService.updateMovie(movie);
	}

	@RequestMapping("getMovieById")
	public ModelAndView getMovieById(@RequestParam(name = "movieId") int movieId) {
		Movie movieById = movieService.getMovieById(movieId);
		return new ModelAndView("MovieById", "movieById", movieById);
	}

	@RequestMapping("getMovieByName")
	public ModelAndView getMovieByName(@RequestParam(name = "movieName") String movieName) {
		Movie movieByName = movieService.getMovieByName(movieName);
		return new ModelAndView("MovieByName", "movieByName", movieByName);
	}

	@RequestMapping("deleteMovieById")
	public void deleteMovieById(@RequestParam(name = "movieId") int movieId) {
		movieService.deleteMovieById(movieId);
	}

	@RequestMapping(name = "getAllMovies", method = RequestMethod.GET)
	public ModelAndView getAllMovies() {
		List<Movie> allMovies = movieService.getAllMovies();
		return new ModelAndView("GetAllMovies", "getAllMovies", allMovies);
	}

}
