package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

		ModelAndView mav = new ModelAndView();
		mav.addObject("books", allBooks);
		mav.setViewName("index");

		return mav;
	}

}
