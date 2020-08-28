package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select a collection and create and Objects
		List<Integer> l=new ArrayList<>();
		
		//add data or elements to Collection
		//In Collection only Objects can be added
		l.add(10);  //=l.add(new Integer(10)); ==boxing
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(123);
		//-------Manipulation
		System.out.println("Size :- "+l.size());
		System.out.println("Elemets of list: "+l);
		
		l.add(1);
		l.add(4,100);
		
		System.out.println("After Addition Elemets of list: "+l);
		l.remove(new Integer(100));
		System.out.println("After Removal Elemets of list: "+l);
		
//		l.add("My Data");
//		System.out.println("After Adding String Elemets of list: "+l);

		Iterator<Integer> iterator=l.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		int total=0;
		for(Integer i : l)
		{
			System.out.println("Value : "+i);
			total+=i;
		}
		System.out.println("Total is :"+total);
		
		
		l.forEach((no)->{
			System.out.println("No :- "+no);
		});
	}

}
