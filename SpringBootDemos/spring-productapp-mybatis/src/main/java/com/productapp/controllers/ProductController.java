package com.productapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@RestController
@RequestMapping("/product-api/v1")
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@PostMapping("/products")
	void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	@PutMapping("/products")
	void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product.getProductId(), product.getPrice());
	}
	@DeleteMapping("/products/product-id/{productId}")
	void deleteProduct(@PathVariable("productId") int productId) {
		productService.deleteProduct(productId);
		
	}
	@GetMapping("/products/product-id/{productId}")
	Product getById(@PathVariable("productId") int productId) {
		return productService.getById(productId);
	}
	
	@GetMapping("/products")
	List<Product>getAll(){
		return productService.getAll();
		
	}
	@GetMapping("/products/brand/{brand}")
	List<Product>getBrand(@PathVariable("brand") String brand){
		return productService.getBrand(brand);
	}
	@GetMapping("/products/price/price")
	List<Product>getByLessPrice(@PathVariable("price") double price){
		return productService.getByLessPrice(price);
	}
	@GetMapping("/products/category/{category}/price/{price}")
	List<Product>getByCategoryandPrice(@RequestParam("category") String category,@RequestParam("price") double price){
		return productService.getByCategoryandPrice(category, price);
	}
	

}
