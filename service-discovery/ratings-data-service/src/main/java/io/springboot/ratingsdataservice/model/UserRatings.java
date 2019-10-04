package io.springboot.ratingsdataservice.model;

import java.util.List;

public class UserRatings {
	
	private List<RatingsData> userRatings;

	/**
	 * @return the userRatings
	 */
	public List<RatingsData> getUserRatings() {
		return userRatings;
	}

	/**
	 * @param userRatings the userRatings to set
	 */
	public void setUserRatings(List<RatingsData> userRatings) {
		this.userRatings = userRatings;
	}	

}
