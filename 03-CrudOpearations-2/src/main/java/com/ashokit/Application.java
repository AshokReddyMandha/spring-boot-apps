package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Books;
import com.ashokit.repo.BooksRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(Application.class, args);
	BooksRepository bean = cont.getBean(BooksRepository.class);
	Books b1 = new Books();
	b1.setBookId(101);
	b1.setBookName("One");
	b1.setBookPrice(101.10);
	
	Books b2 = new Books();
	b2.setBookId(102);
	b2.setBookName("Two");
	b2.setBookPrice(202.20);
	
	Books b3 = new Books();
	b3.setBookId(103);
	b3.setBookName("One3");
	b3.setBookPrice(101.10);
	
	Books b4 = new Books();
	b4.setBookId(104);
	b4.setBookName("Two4");
	b4.setBookPrice(202.20);
	
	Books b5 = new Books();
	b5.setBookId(105);
	b5.setBookName("One5");
	b5.setBookPrice(101.10);
	
	Books b6 = new Books();
	b6.setBookId(106);
	b6.setBookName("Two6");
	b6.setBookPrice(202.20);
	
	Books b7 = new Books();
	b7.setBookId(107);
	b7.setBookName("One7");
	b7.setBookPrice(101.10);
	
	Books b8 = new Books();
	b8.setBookId(108);
	b8.setBookName("Two8");
	b8.setBookPrice(202.20);
	
	Books b9 = new Books();
	b9.setBookId(109);
	b9.setBookName("One9");
	b9.setBookPrice(101.10);
	
	Books b10 = new Books();
	b10.setBookId(110);
	b10.setBookName("Two10");
	b10.setBookPrice(202.20);
	
	Books b11 = new Books();
	b11.setBookId(111);
	b11.setBookName("One11");
	b11.setBookPrice(101.10);
	
	
	
	List<Books> asList = Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10, b11);
	
	bean.saveAll(asList);
		
	}

}
