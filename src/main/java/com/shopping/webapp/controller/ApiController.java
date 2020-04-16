package com.shopping.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.webapp.model.Product;
import com.shopping.webapp.service.ProductService;

@RestController
public class ApiController 
{
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProductsList()
	{
		return productService.getAllProducts();
		
	}
	
}
