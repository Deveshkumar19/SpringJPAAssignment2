package com.devesh.SpringAssignment.Service;

import com.devesh.SpringAssignment.Model.Book;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookService {

    /**
     * @return @{@link List Book}
     */
    public List<Book> getAllBook();

    /**
     * @param book
     */
    public void insertBook(Book book);

    /**
     * update
     */
    public void updateAuthorName();

    /**
     * Delete Book
     */
    public void deleteBook(int cost);
}
