package com.shopping.webapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shopping.webapp.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
	

	
	@Query(value = "SELECT * FROM review WHERE product_id = :productId", nativeQuery = true)
	public List<Review> getReviews(@Param("productId") long productId);
	

}
