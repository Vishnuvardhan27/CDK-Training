package com.exceptions;

public class PersonNotFoundException extends Exception {

	private String message;
	public PersonNotFoundException() {
		// TODO Auto-generated constructor stub
		
	}
	public PersonNotFoundException(String message) {
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
