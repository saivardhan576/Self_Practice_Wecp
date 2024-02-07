package com.day9s1.libraryplatform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day9s1.libraryplatform.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    
}
