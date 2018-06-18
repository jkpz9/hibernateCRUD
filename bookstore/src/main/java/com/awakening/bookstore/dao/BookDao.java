package com.awakening.bookstore.dao;

import java.util.List;
import com.awakening.bookstore.model.Book;

public interface BookDao {

	public void saveBook(Book book); // for create and update
	public List<Book> listBooks();
	public Book getBook(Long id);
	public void deleteBook(Long id);
}
