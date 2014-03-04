package com.xkland.examples.rcp.minihis.models;

public class Patient {//病人信息，id代表床号
	private int id;
	private String name;
	private Gender gender;
	private int age;
	private Department department;
	public Patient(int id, String name, Gender gender, int age, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.department = department;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
