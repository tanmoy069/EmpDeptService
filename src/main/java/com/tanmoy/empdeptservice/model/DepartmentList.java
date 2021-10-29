package com.tanmoy.empdeptservice.model;

import java.util.List;

public class DepartmentList {

	private List<Department> deptList;

	public DepartmentList() {
		super();
	}

	public DepartmentList(List<Department> deptList) {
		super();
		this.deptList = deptList;
	}

	public List<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}

}
