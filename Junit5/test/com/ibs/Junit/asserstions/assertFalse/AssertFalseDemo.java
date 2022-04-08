package com.ibs.Junit.asserstions.assertFalse;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertFalseDemo {
	
	
	@Test
	public void assertFalseWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(listOfBooks.isEmpty());
		
	}
	
	
	@Test
	public void assertFalseWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse("List of books is empty!", listOfBooks.isEmpty());
	}	

}
