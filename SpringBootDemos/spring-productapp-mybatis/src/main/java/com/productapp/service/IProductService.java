package com.productapp.service;

import java.util.List;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {
	
	void addProduct(Product product);
	void updateProduct(int  productId,double price);
	void deleteProduct(int productId);
	Product getById(int productId)throws ProductNotFoundException;
	List<Product>getAll();
	List<Product>getBrand(String brand)throws ProductNotFoundException;
	List<Product>getByLessPrice(double price)throws ProductNotFoundException;
	List<Product>getByCategoryandPrice(String category,double price)throws ProductNotFoundException;
	

}
