package com.shopping.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.webapp.dao.ProductRepository;
import com.shopping.webapp.dao.ReviewRepository;
import com.shopping.webapp.model.Product;
import com.shopping.webapp.model.Review;

@Service
public class ReviewService
{
	
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private ProductRepository productRepository;
	
	
	public Review createReview(long productId, Review review)
	{	
		Optional<Product> productObject = productRepository.findById(productId);
		Product product = productObject.get();
		review.setProduct(product);
		return reviewRepository.save(review);	
	}
	
	
	public List<Review> FetchReviews(long productId)
	{
		return reviewRepository.getReviews(productId);
		
	}
	
	
	

}
