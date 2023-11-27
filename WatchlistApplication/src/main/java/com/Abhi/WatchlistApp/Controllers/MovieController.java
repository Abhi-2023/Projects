	package com.Abhi.WatchlistApp.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.Abhi.WatchlistApp.Entity.Movie;
import com.Abhi.WatchlistApp.Service.DatabaseService;

@RestController
public class MovieController {
	
	@Autowired
	DatabaseService databaseService;
	@GetMapping("/watchlistItemForm")
	public ModelAndView showWatchlistForm(@RequestParam(required = false) Integer id) {
		String viewName = "watchlistItemForm";
		Map<String, Object> model = new HashMap<>();
//		Movie movie = new Movie();
//		movie.setTitle("Dummy");
//		movie.setRating(5.7);
//		movie.setPriority("Medium");
//		movie.setComment("Must watch Movie");
		if(id == null) {
		model.put("watchlistItem", new Movie());
		}
		else {
			model.put("watchlistItem", databaseService.getById(id));
		}
		return new ModelAndView(viewName, model);
	}
	
	@PostMapping("/watchlistItemForm")
	public ModelAndView submitWatchlistItemForm(@Valid @ModelAttribute("watchlistItem") Movie movie, BindingResult bindingResult ) {
		
		if(bindingResult.hasErrors()) {
			// if errors are there, redisplay the form and let the user enter the data again..
			return new ModelAndView("watchlistItemForm");
		}
		Integer id = movie.getId();
		if(id==null) {
		databaseService.createMovie(movie);
		}
		else {
			databaseService.update(movie,id);
		}
		RedirectView rd = new RedirectView();
		rd.setUrl("/watchlist");
		return new ModelAndView(rd);
	}
	
	@GetMapping("/watchlist")
	public ModelAndView showWatchlist(@RequestParam(required = false) Integer id) {
		String viewName = "watchlist";
		Map<String, Object> model = new HashMap<>();
		if(id==null ) {
			
			List<Movie> movieList = databaseService.getAllMovies();
			model.put("watchlistrows", movieList);
			model.put("noOfMovies", movieList.size());
			return new ModelAndView(viewName, model);			
		} else {
			databaseService.deleteMovie(id);
			RedirectView rd = new RedirectView();
			rd.setUrl("/watchlist");
			return new ModelAndView(rd);			
		}
	}
	
	
	
	
}
