package com.devesh.SpringAssignment.Controller;

import com.devesh.SpringAssignment.Exception.BookNotFoundException;
import com.devesh.SpringAssignment.Exception.ResponseObject;
import com.devesh.SpringAssignment.Model.Book;
import com.devesh.SpringAssignment.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class BookController {

    /**
     * Book Service
     */
    @Autowired
    BookService bookService;

    /**
     * Read from property file in classpath
     */
    @Value("${server.port}")
    private String serverPort;

    /**
     * @return @{@link Book}
     */
    @RequestMapping(value = "/getBooks", method = RequestMethod.GET)
    public List<Book> getBook(){

        List<Book> listOfBook = bookService.getAllBook();
        try {
            if (listOfBook.size() != 0) {
                return listOfBook;
            } else {
                throw new BookNotFoundException("No book exists In DB");

            }
        }catch (BookNotFoundException exception){
            throw new BookNotFoundException("No book exists In DB");
        }

    }

    /**
     * @param book
     */
    @RequestMapping(value = "/insertBook", method = RequestMethod.POST)
    public ResponseEntity<ResponseObject> insertBook(@RequestBody Book book){
        bookService.insertBook(book);

        ResponseObject response=new ResponseObject(new Date(),"Inserted Successfully");
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    /**
     * @return String PortNumber
     */
    @RequestMapping(value = "/getServerPort", method = RequestMethod.GET)
    public String getServerPort(){
         return serverPort;
    }

    /**
     * Update Author named Will with William
     */
    @RequestMapping(value = "/updateAuthorName", method = RequestMethod.PUT)
    public ResponseEntity<ResponseObject> updateAuthor(){
        System.out.println("Inside Update");
        bookService.updateAuthorName();
        ResponseObject response=new ResponseObject(new Date(),"Updated Successfully");
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    /**
     * @param cost
     * @return
     * For current Assignment we can have cost as 1000 being passed via postman .
     */
    @RequestMapping(value = "/deleteBook/{cost}", method = RequestMethod.DELETE)
    public ResponseEntity<ResponseObject> deleteBook(@PathVariable("cost") int cost) {
        bookService.deleteBook(cost);
        ResponseObject response=new ResponseObject(new Date(),"Deleted Successfully");
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
