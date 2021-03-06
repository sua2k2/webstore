package com.sua.webstore.domain.repository;

import java.util.List;

import com.sua.webstore.domain.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	List<Product> getAllProducts(String...arg);
	void updateStock(String productId, long noOfUnits);
	List<Product> getProductsByCategory(String category);
}
