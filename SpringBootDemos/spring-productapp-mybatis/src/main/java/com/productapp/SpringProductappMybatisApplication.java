package com.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
	
	/*
	 * @Autowired IProductService productService;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 */
    // Product product=new Product(1,"TV","LG",20000,"Electric");
   //  productService.addProduct(product);
		// Product product=new Product(2,"Mobile","Oppo",25000,"Electric");
		 //    productService.addProduct(product);
		//Product product=new Product(3,"Fan","Usa",15000,"Electric");
		  //  productService.addProduct(product);
     // productService.updateProduct(1, 10000);
		//productService.deleteProduct(2);
		//System.out.println(productService.getById(1));
		/*List<Product>products=productService.getAll();
		for(Product product:products) {
			System.out.println(product);
	}*/
	//}
}
