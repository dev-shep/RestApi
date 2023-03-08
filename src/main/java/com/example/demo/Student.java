package com.example.demo;

public class Student {
	public String firstName;
	public String LastName;
	
	public Student(String firstName,String LastName) {
		super();
		this.firstName = firstName;
		this.LastName  = LastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
