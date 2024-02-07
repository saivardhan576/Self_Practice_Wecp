package com.day9s1.libraryplatform.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long  bookId;
    
    private String title;
    private String author;
    private long ispNo;

    public Book() {
    }
    public Book(String title, String author, long ispNo) {
        this.title = title;
        this.author = author;
        this.ispNo = ispNo;
    }

    public Long getBookId() {
        return bookId;
    }
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public long getIspNo() {
        return ispNo;
    }
    public void setIspNo(long ispNo) {
        this.ispNo = ispNo;
    }
    
    
}
