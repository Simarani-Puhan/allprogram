package com.bookapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}
     @Autowired
     IBookService  bookService;
	@Override
	public void run(String... args) throws Exception {
		/*List<Book>books=bookService.getAll();
		for(Book book:books) {
			System.out.println(book);
			*/
			/*Book book=new Book("Seven girl","Sheetal","Story",400, 4);
			bookService.addBook(book);
	}*/
			
			System.out.println(bookService.getById(2));
	
		//}
}
}