package com.ashokit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>{

}
