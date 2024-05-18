package com.sai.ratingservice.services;

import java.util.List;

import com.sai.ratingservice.entities.Rating;

public interface RatingService {
	public List<Rating> getratingById(String id);
	public List<Rating> getAllRatings();
	public Rating createRating(Rating rating);
}
