package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService{
    @Override
    public List<Book> getAll() {
        List<Book> books= BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> bookByauthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().startsWith(author)) ;
           bookByauthor.add(book);
        }
    if (bookByauthor.isEmpty())
        throw new BookNotFoundException("No book found by this author");
    return bookByauthor;
    }
    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book>books=BookDetails.showBooks();
        List<Book>bookByCategory=new ArrayList<>();
        for (Book book:books){
            if (book.getCategory().equals(category))
                bookByCategory.add(book);

        }
        if (bookByCategory.isEmpty())
            throw new BookNotFoundException("No book found by this category");

        return bookByCategory;
    }
    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        Double priceValue=price;
        List<Book>books=BookDetails.showBooks();
        List<Book>bookByPrice=new ArrayList<>();
        for (Book book:books){
            if (book.getPrice()<priceValue)
            bookByPrice.add(book);
        }
        if (bookByPrice.isEmpty())
            throw new BookNotFoundException("No book at this price");
        return bookByPrice;
    }
    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book>books=BookDetails.showBooks();
        List<Book>newBook3=new ArrayList<>();
        for (Book book:newBook3){
            if (book.getAuthor().equals(author) && book.getCategory().equals(category))
            newBook3.add(book);
        }
        if(newBook3==null)
            throw new BookNotFoundException();
        return newBook3;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book>books=BookDetails.showBooks();
        List<Book> matchigBook=new ArrayList<>();
        for (Book book:books){
            if (book.getBookId()==(bookId))
                matchigBook.add(book);
        }
            throw new IdNotFoundException("Id not found");

    }
}
