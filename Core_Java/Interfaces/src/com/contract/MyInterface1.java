package com.contract;

public interface MyInterface1 {

	public default void display(){
		System.out.println("Interface1 Default Display");
	}
	
	public default int calculate(int x,int y){
		return x*y;
		
	}
	static void myFun(){
		System.out.println("My Function");
	}
}

class MultiImplement implements MyInterface1,MyInterface{
	
	public void display(){
			MyInterface1.super.display();
			MyInterface.super.display();

			System.out.println("OverRidden");
		}
	public void show()
	{
		display();
		System.out.println(calculate(12,12));
		MyInterface1.myFun();
	}
}
