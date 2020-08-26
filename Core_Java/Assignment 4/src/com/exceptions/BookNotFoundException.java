package com.exceptions;

public class BookNotFoundException extends Exception {

	private String message;
	public BookNotFoundException() {
		// TODO Auto-generated constructor stub
		
	}
	public BookNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void displayMessage()
	{
		System.out.println(getMessage());
	}
}
