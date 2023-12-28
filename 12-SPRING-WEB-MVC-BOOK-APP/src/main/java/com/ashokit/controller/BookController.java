package com.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.entity.Book;
import com.ashokit.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public ModelAndView getBooks() {
		List<Book> allBooks = bookService.getAllBooks();
		System.out.println("getBooks() :: METHOD");

		ModelAndView mav = new ModelAndView();
		mav.addObject("books", allBooks);
		mav.setViewName("index");

		return mav;
	}

	@GetMapping("/addBookPage1")
	public ModelAndView showAddBooksPage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("book", new Book());
		mav.setViewName("addBookPage");

		System.out.println("showAddBooksPage() :: METHOD");

		return mav;
	}

	@PostMapping("/addBookPage")
	public ModelAndView saveBooks(Book book) {
		boolean saveBook = bookService.saveBook(book);
		ModelAndView mav = new ModelAndView();

		if (saveBook) {
			mav.addObject("successMessage", "Record Inserted");
		} else {
			mav.addObject("errorMessage", "Record Not Inserted");
		}

		mav.setViewName("addBookPage");

		return mav;
	}

	@GetMapping("/deleteBook/{id}")
	public ModelAndView deleteBook(@PathVariable("id") Integer id) {
		bookService.deleteBookById(id);
		return getBooks();
	}
	
	
	@GetMapping("/edit/{id}")
	public ModelAndView updateBook(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView();
		Optional<Book> books = bookService.updateBookById(id);
		if (books.isPresent()) {
			Book bookById = books.get();	
			mav.addObject("book" ,bookById);
			mav.setViewName("/addBookPage");
		}
		return mav;
	}
}