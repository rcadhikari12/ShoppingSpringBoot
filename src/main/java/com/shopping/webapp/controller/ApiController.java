package com.shopping.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.webapp.model.Product;
import com.shopping.webapp.service.ProductService;

@RestController("/product")
@CrossOrigin
public class ApiController 
{
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProductsList()
	{
		return productService.getAllProducts();
		
	}
	
	
	@GetMapping("/getProduct/{id}")
	public Product showProduct(@PathVariable("id") long id)
	{
		return productService.getProductById(id);
		
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
		
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProductById(@PathVariable("id") long id)
	{
		productService.deleteProduct(id);
		
		
	}
	
	@GetMapping("/searchProducts/{name}")
	public List<Product> searchProductsByName(@PathVariable("name") String name)
	{
		return productService.searchProduct(name);
	}
	
	
	
	
	
	
	
	
	
	
	

}
