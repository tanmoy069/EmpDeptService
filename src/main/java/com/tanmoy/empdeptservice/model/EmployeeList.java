package com.tanmoy.empdeptservice.model;

import java.util.List;

public class EmployeeList {

	private List<Employee> empList;

	public EmployeeList() {
		super();
	}

	public EmployeeList(List<Employee> empList) {
		super();
		this.empList = empList;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

}
