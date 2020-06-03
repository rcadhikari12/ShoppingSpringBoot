package com.shopping.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.webapp.model.Review;
import com.shopping.webapp.service.ReviewService;

@RestController
@CrossOrigin
public class ReviewController 
{
	@Autowired
	private ReviewService reviewService;
	
	
	@GetMapping("/AllReviews/{productId}")
	public List<Review> getAllReviews(@PathVariable("productId") long productId)
	{
		return reviewService.getAllReviews(productId);
		
	}
	
	@PostMapping("/createReview/{productId}")
	public Review createReview(@PathVariable("productId") long productId, @RequestBody Review review)
	{
		return reviewService.createReview(productId, review);
		
	}

}
