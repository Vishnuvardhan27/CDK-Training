package com.interfaces;

import com.pojo.Book;

public class BookStoreImpl implements BookStore {

	@Override
	public Book[] getBooks() {
		// TODO Auto-generated method stub
		Book[] books=new Book[5];
		books[0]=new Book(10001,"Python The Hard Way",200);
		books[1]=new Book(10002,"C++",300);
		books[2]=new Book(10003,"AI",500);
		books[3]=new Book(10004,"Machine Leaning","Super DataScience Team","Udemy");
		books[4]=new Book(10005,"The BlockChain blog","Mohd.Arbaaz Shaikh","WordPress");
		return books;
	}

	@Override
	public Book findBookById(Book[] books, long Id) {
		// TODO Auto-generated method stub
		for (Book b : books)
		{
			if(b.getIsbn()==Id)
			{
				return b;
			}
		}
		return null;
	}

	@Override
	public Book findBookByName(Book[] books, String name) {
		// TODO Auto-generated method stub
		for (Book b : books)
		{
			if(name.equals(b.getName()))
			{
				return b;
			}
		}
		return null;
	}

	@Override
	public Book updateBook(long id, double price, Book[] books) {
		// TODO Auto-generated method stub
		return null;
	}

}
