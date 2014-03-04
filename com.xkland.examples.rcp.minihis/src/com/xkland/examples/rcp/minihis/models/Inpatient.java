package com.xkland.examples.rcp.minihis.models;

public class Inpatient {//住院部
	private Department[] departments;

	public Department[] getDepartments() {
		return departments;
	}

	public Inpatient() {
		departments = new Department[4];
		departments[0] = new Department("内科");
		departments[1] = new Department("外科");
		departments[2] = new Department("妇产科");
		departments[3] = new Department("儿科");
	}
	
}
