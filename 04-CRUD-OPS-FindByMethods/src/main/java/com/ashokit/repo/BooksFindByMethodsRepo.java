package com.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Books;
@Repository
public interface BooksFindByMethodsRepo extends CrudRepository<Books, Integer>{
	
	
    List<Books> findByBookName(String bookName);
    
    
   
 @Query("from Books")
 Iterable<Books>  getAllBooks();

}
