package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.MovieDao;
import com.movie.model.Movie;

@Service("MovieServiceImpl")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;

	public void insertMovie(Movie movie) {
		movieDao.save(movie);
	}

	public void updateMovie(Movie movie) {
		movieDao.save(movie);
	}

	public Movie getMovieById(int movieId) {
		Object movieById = movieDao.findById(movieId);
		return (Movie) movieById;
	}

	public Movie getMovieByName(String movieName) {
		return movieDao.getByName(movieName);
	}

	public List<Movie> getAllMovies() {
		return (List<Movie>) movieDao.findAll();
	}

	public void deleteMovieById(int movieId) {
		movieDao.deleteById(movieId);
	}

}
