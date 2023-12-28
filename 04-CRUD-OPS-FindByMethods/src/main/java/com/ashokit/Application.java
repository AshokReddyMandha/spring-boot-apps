package com.ashokit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Books;
import com.ashokit.repo.BooksFindByMethodsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BooksFindByMethodsRepo repoBean = context.getBean(BooksFindByMethodsRepo.class);
		long count = repoBean.count();
		System.out.println("Number of records in table : "+count);
		Iterable<Books> findAll = repoBean.findAll();
		for (Books string : findAll) {
			System.out.println("Sting: "+string);
		}
		
		//repoBean.deleteAll();
		//repoBean.deleteById(102);
		
		//Books b = new Books();
		//b.setBookId(101);
		//repoBean.delete(b);;
		
		//repoBean.deleteAllById(Arrays.asList(101,102));
		
		//repoBean.deleteAll(findAll);
		
		List<Books> booknames = repoBean.findByBookName("One");
		
		for (Books books : booknames) {
			
			System.out.println(books);
		}
		
		
		System.out.println("Custome method--------------------");
		
		Iterable<Books> allBooks = repoBean.getAllBooks();
		allBooks.forEach(s->System.out.println(s));
		
		
		
	}

}
