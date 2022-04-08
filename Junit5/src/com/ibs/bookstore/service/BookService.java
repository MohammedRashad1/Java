package com.ibs.bookstore.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ibs.bookstore.model.Book;

public class BookService {
	
private List<Book> listOfBooks = new ArrayList<>();
	
	public void addBook(Book book) {
		listOfBooks.add(book);
	}	
	
	public List<Book> books(){
		return Collections.unmodifiableList(listOfBooks);
	}

}
