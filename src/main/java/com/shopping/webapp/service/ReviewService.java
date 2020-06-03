package com.shopping.webapp.service;

import java.util.ArrayList;
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
	
	
	public List<Review> getAllReviews(long productId)
	{
		List<Review> list = new ArrayList<Review>();	
		for(Review x: reviewRepository.findAll())
		{
			list.add(x);	
		}
		return list;
		
	}
	
	public Review createReview(long productId, Review review)
	{	
		Optional<Product> productObject = productRepository.findById(productId);
		Product product = productObject.get();
		review.setProduct(product);
		return reviewRepository.save(review);	
	}

}
