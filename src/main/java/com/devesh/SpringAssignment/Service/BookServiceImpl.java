package com.devesh.SpringAssignment.Service;

import com.devesh.SpringAssignment.Model.Book;
import com.devesh.SpringAssignment.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Service class to interact with Repository
 */
@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBook(){

        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public void insertBook(Book book) {
        //insert current time to book object top persist in DB
        book.setTimeStamp(new Date());
        bookRepository.save(book);
    }


    @Override
    public void updateAuthorName() {
        bookRepository.updateAuthorName();
    }

    @Override
    public void deleteBook(int cost) {
        bookRepository.deleteBook(cost);
    }
}
