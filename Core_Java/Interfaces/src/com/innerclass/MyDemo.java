package com.innerclass;

public interface MyDemo {
	
	int addition(int no1,int no2);;

}

class MyDemoImp1 implements MyDemo{

	@Override
	public int addition(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1+no2;
	}
	
}
