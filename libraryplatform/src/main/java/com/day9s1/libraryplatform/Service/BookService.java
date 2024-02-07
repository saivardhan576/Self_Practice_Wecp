package com.day9s1.libraryplatform.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day9s1.libraryplatform.Entity.Book;
import com.day9s1.libraryplatform.Repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
        
    }

    public Book addBooks(Book book){
        return bookRepository.save(book);
    }
    
    public Book updateBooks(Long bookId,Book updatedbook){
            return bookRepository.findById(bookId).map(book->{
                book.setAuthor(updatedbook.getAuthor());
                book.setTitle(updatedbook.getTitle());
                book.setIspNo(updatedbook.getIspNo());
                return bookRepository.save(book);
            }).get();

        }

    public void deleteBookById(Long bookId){
        bookRepository.deleteById(bookId);
    }
}
