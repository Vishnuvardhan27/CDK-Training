package com.set;

import java.util.Comparator;

public class PersonID2Comparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o2.getpId()-o1.getpId();
	}

}
