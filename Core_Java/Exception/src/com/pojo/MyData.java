package com.pojo;

import java.io.Serializable;

public class MyData implements Serializable{

	private int id;
	private String name;
	private long marks ;
	public MyData(int id, String name, long marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "MyData [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}	
	
	
}
