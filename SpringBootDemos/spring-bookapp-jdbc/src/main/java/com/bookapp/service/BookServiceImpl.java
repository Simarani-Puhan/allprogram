package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private IBookRepository bookRepository;
	@Override
	public void addBook(Book book) {
           bookRepository.addBook(book);		
	}

	@Override
	public void updateBook(int bookId, double price) {
          bookRepository.updateBook(bookId, price);		
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteBook(bookId);
	}

	@Override
	public List<Book> getAll() {
		List<Book>books=bookRepository.findAll();
		return books;
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		List<Book>books=bookRepository.findByAuthorStartsWith(author);
		return books;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		Book book=bookRepository.findById(bookId);
		if(book==null) {
			throw new IdNotFoundException("Invalid id");
		}
		return book;
	}
	
}	

