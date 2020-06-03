package com.shopping.webapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long id;
	
	private String username;
	
	private String password;
	
	private String role;
	
	
	
	@OneToMany
	@JoinTable(
			  name="USER_PRODUCT",
			  joinColumns=@JoinColumn(name="user_id", referencedColumnName="user_id"),
			  inverseJoinColumns=@JoinColumn(name="product_id", referencedColumnName="product_id"))
	private List<Product> product;
	

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}


	public User() 
	{
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", product="
				+ product + "]";
	}

}

	
	
	
	


