package com.interfaces;

import com.pojo.Book;

public interface BookStore {

	public Book[] getBooks();
	public Book findBookById(Book[] books,long Id);
	public Book findBookByName(Book[] books, String name);
	public Book updateBook(long id, double price, Book[] books);
	public default void display(Book[] books){
		for(Book b:books)
		{
			b.toString();
		}
	}
}
