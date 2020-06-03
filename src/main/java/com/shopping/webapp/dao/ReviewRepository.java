package com.shopping.webapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.webapp.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
	
	
	@Query("SELECT R FROM Review R INNER JOIN Product P ON R.id = P.id WHERE P.id =?1")
	public List<Review> getAllReviews(long productId);

		

}
