package com.awakening.bookstore.service;

import java.util.List;

import com.awakening.bookstore.model.Book;

public interface BookService {

	public void saveBook(Book book);
	public List<Book> listBooks();
	public Book getBook(Long id);
	public void deleteBook(Long id);

}
