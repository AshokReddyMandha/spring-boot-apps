package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
	
}
