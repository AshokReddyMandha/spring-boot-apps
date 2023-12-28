package com.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="book_PK_TAB")
public class Book 
{
  private String authorName;
  private Double price;
  
  @EmbeddedId
  private BookPK bookPK;

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public BookPK getBookPK() {
	return bookPK;
}

public void setBookPK(BookPK bookPK) {
	this.bookPK = bookPK;
}

@Override
public String toString() {
	return "Book [authorName=" + authorName + ", price=" + price + ", bookPK=" + bookPK + "]";
}

public Book(String authorName, Double price, BookPK bookPK) {
	
	this.authorName = authorName;
	this.price = price;
	this.bookPK = bookPK;
}

public Book() {
	// TODO Auto-generated constructor stub
}
  
  
  
}
