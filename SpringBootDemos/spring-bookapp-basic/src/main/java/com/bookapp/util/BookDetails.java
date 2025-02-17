package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookapp.model.Book;

@Component
public class BookDetails {
    public  List<Book> showBooks(){
        return Arrays.asList(
                new Book("The story","John","Story",1,900.90),
                new Book("Java","Ben","Tech",2,45.67),
                new Book("Seven Habits","John Hopper","Selfhelp",3,5667.67),
                new Book("Secret Seven","Enid Ben","Fiction",4,565665.78));
    }
}
