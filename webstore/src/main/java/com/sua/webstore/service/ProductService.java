package com.sua.webstore.service;

import java.util.List;

import com.sua.webstore.domain.Product;

public interface ProductService {
	void updateAllStock();
	List<Product> getAllProducts();
	List<Product> getAllProducts(String...arg);
	List<Product> getProductsByCategory(String category);
}
