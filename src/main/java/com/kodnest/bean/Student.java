package com.kodnest.bean;

public class Student {
	int id;
	String name;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
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

}
