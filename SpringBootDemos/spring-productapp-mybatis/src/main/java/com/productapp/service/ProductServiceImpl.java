package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;
@Service
public class ProductServiceImpl implements  IProductService{
	@Autowired
	IProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
    productRepository.addProduct(product);		
	}

	@Override
	public void updateProduct(int productId,double price) {
    productRepository.updateProduct(productId ,price);		
	}

	@Override
	public void deleteProduct(int productId) {
    productRepository.deleteProduct(productId);		
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		Product product=productRepository.findById(productId);
		if(product==null) {
			throw new ProductNotFoundException("Invalid id");
		}
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product>products=productRepository.findAll();
		return products;
	}

	@Override
	public List<Product> getBrand(String brand) throws ProductNotFoundException {
		
		return null;
	}

	@Override
	public List<Product> getByLessPrice(double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByCategoryandPrice(String category, double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
