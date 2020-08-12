package com.devesh.SpringAssignment.Repository;

import com.devesh.SpringAssignment.Model.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface BookRepository extends CrudRepository<Book,Integer> {

    @Modifying
    @Query("update Book b set b.authorName = 'William' where b.authorName like 'Will %'")
    public void updateAuthorName();

    @Modifying
    @Query(value = "delete  from book  where cost <:cost",nativeQuery = true)
    public void deleteBook(int cost);
}
