package com.tanmoy.empdeptservice.model;

public class Department {

	private int id;
	private String name;
	private boolean isActive;

	public Department() {
		super();
	}

	public Department(String name, boolean isActive) {
		super();
		this.name = name;
		this.isActive = isActive;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", isActive=" + isActive + "]";
	}

}
