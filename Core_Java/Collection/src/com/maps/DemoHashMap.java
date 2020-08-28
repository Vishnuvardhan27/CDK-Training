package com.maps;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer> map=new HashMap<>();
		
		map.put("A", 10);
		map.put("B", 5);
		map.put("Z", 55);
		map.put("F", 10);
		
		System.out.println(map);
		System.out.println(map.size());
		
		map.put("Z", 0);
		System.out.println("After Duplicate Entry :"+map);
		
		Set <Entry< String ,Integer>> entries=map.entrySet();
		Iterator<Entry<String,Integer>> iterator =entries.iterator();
		
		while(iterator.hasNext())
		{
			Entry<String,Integer> entry=iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		for(Map.Entry<String,Integer> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());

		}
		map.forEach((s,i)->{
			
			System.out.println("Key is :"+s+"Value is :"+i);

		});
	}
	

}
