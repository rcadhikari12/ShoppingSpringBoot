package com.shopping.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.webapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
