package com.day9s1.libraryplatform.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day9s1.libraryplatform.Entity.Book;
import com.day9s1.libraryplatform.Service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired 
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book addBooks(@RequestBody Book book){
        return bookService.addBooks(book);
    }

    @PutMapping("/{bookId}")
    public Book updateBooks(@PathVariable Long bookId, @RequestBody Book updatedBook){
        return bookService.updateBooks(bookId, updatedBook);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBookById(@PathVariable Long bookId){
        bookService.deleteBookById(bookId);
    }
    
    
}
