package com.set;

import java.util.Comparator;

public class PersonIDComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getpId()-o2.getpId();
		
	}

}
