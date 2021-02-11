package com.shopping.webapp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.shopping.webapp.dao.ProductRepository;
import com.shopping.webapp.model.Product;
import com.shopping.webapp.service.ProductService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShoppingApplicationTests {

	@Autowired
	private ProductService productService;

	@MockBean
	private ProductRepository productRepository;

	@Test
	public void getAllProductsTest() {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(15, "car", 10, "This is a car", "www.image1"));
		products.add(new Product(16, "car2", 12, "This is a ca2r", "www.image"));

		when(productRepository.findAll()).thenReturn(products);
		assertEquals(2, productService.getAllProducts().size());
	}
	
	@Test
	public void addProductTest()
	{
		Product product = new Product(111, "car", 10, "This is a car", "www.image1");
		
		when(productRepository.save(product)).thenReturn(product);
		assertEquals(product, productService.addProduct(product));
		
	}
	

	
	
}
