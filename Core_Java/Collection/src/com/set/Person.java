package com.set;

public class Person implements Comparable<Person> {
	private int pId;
	private String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int pId, String name) {
		super();
		this.pId = pId;
		this.name = name;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pId != other.pId)
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		//return this.getpId()-o.getpId();
		//return o.getpId()-this.getpId();
		return this.getName().compareTo(o.getName());
	}

	
}
