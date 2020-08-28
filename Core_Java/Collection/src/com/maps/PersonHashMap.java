package com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.arraylist.Person;

public class PersonHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Person> persons=new HashMap<String, Person>();
		persons.put("A",new Person(12,"A"));
		persons.put("B",new Person(13,"B"));
		persons.put("X",new Person(1,"X"));
		persons.put("Y",new Person(44,"Y"));
		
		System.out.println(persons);
		persons.remove("Y");
		System.out.println(persons.size());
		
		persons.replace("B",new Person(33,"New Value"));
		System.out.println(persons);
		
		persons.forEach((s,p)->{
			System.out.println("Key is "+s+ " Value is "+p);
		});
		
		//Iterator <Entry<String,Person>> iterator = persons.entrySet().iterator();
		java.util.Iterator<Entry<String,Person>> iterator =persons.entrySet().iterator();
		while(iterator.hasNext())
		{
			Entry <String,Person> entry = iterator.next();
			Person p = entry.getValue();
			if(p.getpId() == 12)
			{
//				p.setName("New Name");
//				persons.put(entry.getKey(), p);
				
				persons.put("XX", new Person(1234,"name"));
			}
		}
		
		persons.forEach((s,p)->{
			System.out.println("Key is "+s+ " Value is "+p);
		});
		
	}

}
