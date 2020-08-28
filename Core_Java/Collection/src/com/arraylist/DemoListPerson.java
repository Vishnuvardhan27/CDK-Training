package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoListPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons=new ArrayList<>();
		persons.add(new Person(1,"CDK"));
		persons.add(new Person(12, "Pune"));
		persons.add(new Person(11, "HYD"));
		persons.add(new Person(20, "Delhi"));
		
		System.out.println("Persons Are : "+persons);
		
		Iterator<Person> iterator =persons.iterator();
		while(iterator.hasNext())
		{
			Person person=iterator.next();
			System.out.println(person);
			System.out.println(person.getpId()+":"+person.getName());
		}
		for(Person p :persons)
		{
			System.out.println(p);
			System.out.println(p.getpId()+":"+p.getName());
		}
		
		System.out.println(persons.contains(new Person(11, "HYD")));
		
		persons.forEach((p)->{System.out.println(p.getName());});
		
		persons.forEach(System.out::println);
	}

}
