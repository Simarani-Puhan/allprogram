package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.util.BookDetails;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Book>books= BookDetails.showBooks();
        IBookService bookService=new BookServiceImpl();


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
//        try{
//            Book getBookId=bookService.getById(id);
//            for (Book book:getBookId){
//                System.out.println(book);
//            }
//        }catch (IdNotFoundException e){
//            e.printStackTrace();
//        }
    }
}
