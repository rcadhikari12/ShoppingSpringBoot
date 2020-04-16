package com.shopping.webapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.webapp.dao.ProductRepository;
import com.shopping.webapp.model.Product;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> getAllProducts()
	{
		
		return productRepository.findAll();	
	}

}
