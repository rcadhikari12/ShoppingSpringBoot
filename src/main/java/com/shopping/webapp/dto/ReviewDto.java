package com.shopping.webapp.dto;

import java.util.Date;

public class ReviewDto 
{
	private String reviewerName;
	private int rating;
	private Date date;
	private String topic;
	private String Description;
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	
	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public ReviewDto(String reviewerName, int rating, Date date, String topic, String description) {
		super();
		this.reviewerName = reviewerName;
		this.rating = rating;
		this.date = date;
		this.topic = topic;
		Description = description;
	}
	
	public ReviewDto() {
		
	}
	
	
	
	
	
	
	
}
