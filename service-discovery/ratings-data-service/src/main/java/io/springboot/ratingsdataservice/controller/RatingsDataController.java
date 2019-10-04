package io.springboot.ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.ratingsdataservice.model.RatingsData;
import io.springboot.ratingsdataservice.model.UserRatings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {
	
	@RequestMapping("/{movieId}")
	public RatingsData getRatings(@PathVariable("movieId") String movieId) {
		return new RatingsData(movieId, 4);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRatings getUserRatings(@PathVariable("userId") String userId) {
		List<RatingsData> ratings = Arrays.asList(
				new RatingsData("1234", 4),
				new RatingsData("5678", 3));
		UserRatings userRatings = new UserRatings();
		userRatings.setUserRatings(ratings);
		return userRatings;
	}

}
