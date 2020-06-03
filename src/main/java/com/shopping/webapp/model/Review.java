package com.shopping.webapp.model;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Review 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "review_id")
	private int id;
	private String reviewerName;
	private int rating;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new Date();
	private String topic;
	private String description;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private Product product;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Review()
	{
		
	}
	
	public Review(int id, String reviewerName, int rating, Date date, String topic, String description) {
		super();
		this.id = id;
		this.reviewerName = reviewerName;
		this.rating = rating;
		this.date = date;
		this.topic = topic;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", reviewerName=" + reviewerName + ", rating=" + rating + ", date=" + date
				+ ", topic=" + topic + ", description=" + description + "]";
	}
	
	
	
	
	
	

}
