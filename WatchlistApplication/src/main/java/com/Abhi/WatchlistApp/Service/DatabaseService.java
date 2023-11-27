package com.Abhi.WatchlistApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Abhi.WatchlistApp.Entity.Movie;
import com.Abhi.WatchlistApp.Repositories.MovieRepository;

@Service
public class DatabaseService {
	
	@Autowired
	MovieRepository movieRepository;
	
	
	@Autowired
	RatingService ratingService;
	
	public void createMovie(Movie movie) {
		// TODO Auto-generated method stub
		String rating = ratingService.getMoveString(movie.getTitle());
		if(rating != null) {
			movie.setRating(Double.parseDouble(rating));
		}
		movieRepository.save(movie);
	}

	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	public void update(Movie movie, Integer id) {
		// TODO Auto-generated method stub
		Movie tobeupdatedMovie = movieRepository.findById(id).get();
		tobeupdatedMovie.setTitle(movie.getTitle());
		tobeupdatedMovie.setRating(movie.getRating());
		tobeupdatedMovie.setPriority(movie.getPriority());
		tobeupdatedMovie.setComment(movie.getComment());
		movieRepository.save(tobeupdatedMovie);
	}

	public Movie getById(Integer id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id).get();
	}

	public void deleteMovie(Integer id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
	}	
}
