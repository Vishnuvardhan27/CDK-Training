package com.interfaces;

import java.util.List;

import com.pojo.Person;

public interface PersonIO {

	   List<Person> getPersons(); 
	   Person findById(int id, List<Person>persons);
	   boolean removePerson(int id,List<Person>persons);
	   Person updatePerson(int id,List<Person>persons,String name);
	   void displayPersons(List<Person>persons); 
	   List<Person> addPerson(List<Person> persons, Person person);	   
	
	}

