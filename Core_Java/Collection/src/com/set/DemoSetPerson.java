package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoSetPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Person> persons=new HashSet<>();
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
		
		persons.forEach((p)->{
			System.out.println(p.getpId()+":"+p.getName());
		});
	}

}
