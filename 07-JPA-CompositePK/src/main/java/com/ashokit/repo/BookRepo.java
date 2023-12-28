package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Book;
import com.ashokit.entity.BookPK;

public interface BookRepo extends JpaRepository<Book, BookPK>{

}
