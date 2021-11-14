package com.tanmoy.empdeptservice.model;

import java.sql.Date;

public class Employee {

	private int id;
	private String code;
	private String name;
	private Date dateOfBirth;
	private String gender;
	private int mobile;
	private int deptId;

	public Employee() {
		super();
	}

	public Employee(String code, String name, Date dateOfBirth, String gender, int mobile, int deptId) {
		super();
		this.code = code;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobile = mobile;
		this.deptId = deptId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", code=" + code + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + ", mobile=" + mobile + ", deptId=" + deptId + "]";
	}

}
