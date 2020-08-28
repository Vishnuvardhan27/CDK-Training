package com.interfaces;
import java.util.ArrayList;
import java.util.List;
import com.exceptions.PersonNotFoundException;
import com.pojo.Person;

public class PersonIOImpl implements PersonIO {

	@Override
	public List<Person> getPersons() {

		List<Person>persons=new ArrayList<>();
		persons.add(new Person(1,"CDK"));
		persons.add(new Person(2,"Pune"));
		persons.add(new Person(3,"Hyderabad"));
		return persons;
	}
	@Override
	public Person findById(int id, List<Person> persons) {
	
		for(Person person:persons){
			if(person.getpId()==id)
			return person;
		}
		try{
	         throw new PersonNotFoundException("Person not found for given id");
		}
			catch(PersonNotFoundException p){
				p.printStackTrace();
			}
			return new Person();
	}
	@Override
	public boolean removePerson(int id, List<Person> persons) {
		for(Person person:persons){
			if(person.getpId()==id){
				persons.remove(person);
			return true;
		}
		}
		try{
	         throw new PersonNotFoundException("Person not found for given id .. cannot remove");
		}
			catch(PersonNotFoundException p){
				p.printStackTrace();
			}
		return false;
	}
	@Override
	public Person updatePerson(int id, List<Person> persons,String name) {
		for(Person person:persons){
			if(person.getpId()==id){
				person.setName(name);
				return person;
			}
		}
		try{
	         throw new PersonNotFoundException("Person not found for given id .. cannot update");
		}
			catch(PersonNotFoundException p){
				p.printStackTrace();
			}
		return new Person();
	}
	
	@Override
	public void displayPersons(List<Person>persons) {
		for(Person person:persons){
			System.out.println(person);
		}
	}
	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		persons.add(person);
		return persons;
	}

}