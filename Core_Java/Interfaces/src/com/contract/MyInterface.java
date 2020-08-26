package com.contract;

public interface MyInterface {

	public default void display(){
		System.out.println("Interface Default Display");
	}
	static void myFun(){
		System.out.println("My Function");
	}
}

class MyClass implements MyInterface{
	public void display(){
		System.out.println("Inside Myclass");
	}
	
	void useDefault()
	{
	display();
	}
	
	public static void main(String[] args)
	{
		MyClass m = new MyClass();
		m.useDefault();
	}
}


