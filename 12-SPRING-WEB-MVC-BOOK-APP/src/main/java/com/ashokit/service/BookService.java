package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ashokit.entity.Book;
import com.ashokit.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;

	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	public boolean saveBook(Book book) {
		Book bookObj = bookRepo.save(book);

		if (bookObj.getBookId() != null) {
			return true;
		} else {
			return false;
		}

	}
	
	public void deleteBookById(Integer bid) {
		bookRepo.deleteById(bid);
	}
	
	public Optional<Book> updateBookById(Integer bid) {
		return bookRepo.findById(bid);
	}

}
