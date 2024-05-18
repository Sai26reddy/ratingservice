package com.sai.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.ratingservice.entities.Rating;
import com.sai.ratingservice.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	

	@Autowired
	RatingService ratingService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getRatingbyId(@PathVariable String id){
		List<Rating> rating = ratingService.getratingById(id);
		return ResponseEntity.ok(rating);
	}
	        
	@GetMapping
	public ResponseEntity<?> getAllRatings(){
		List<Rating> ratings = ratingService.getAllRatings();
		return ResponseEntity.ok(ratings);
	}
	
	@PostMapping
	public ResponseEntity<?> createRating(@RequestBody Rating rating){
		Rating rating1 = ratingService.createRating(rating);
		return ResponseEntity.ok(rating1);
	}
}
