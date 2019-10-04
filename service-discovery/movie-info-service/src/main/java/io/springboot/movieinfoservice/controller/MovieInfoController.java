package io.springboot.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.movieinfoservice.model.MovieDetails;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
	@RequestMapping("/{movieId}")
	public MovieDetails getMovieInfo(@PathVariable("movieId") String movieId) {
		return new MovieDetails(movieId, "Transformers");
	}

}
