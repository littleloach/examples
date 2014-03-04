package com.xkland.examples.rcp.minihis.models;

import java.util.LinkedList;
import java.util.List;

public class Department {
	private String name;
	private List<Patient> patients;
	public Department(String name) {
		super();
		this.name = name;
		patients = new LinkedList<Patient>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void addPatient(Patient patient){
		patients.add(patient);
	}
}
