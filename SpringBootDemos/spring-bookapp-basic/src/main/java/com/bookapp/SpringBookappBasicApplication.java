package com.bookapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.util.BookDetails;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}
	
    @Autowired
    IBookService bookService;
    
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);


        try {
            System.out.println("Enter Category :");
            String category=sc.next();
            List<Book>booksByCategory=bookService.getByCategory(category);
            for (Book book:booksByCategory){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Enter price :");
        double price=sc.nextDouble();
        try{
            List<Book>bookByPrice=bookService.getByPriceLessThan(price);
            for (Book book:bookByPrice){
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Enter id :");
        Integer id=sc.nextInt();
        }

}
