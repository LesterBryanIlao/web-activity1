package com.bootcamp.hr.entity;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private float salary;
	private String departmentName;
	private String departmentId;
	private String jobId;
	public Employee() {
	}

	public Employee(int id, String firstName, String lastName, String email, float salary, String departmentName,
			String departmentId, String jobId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.departmentName = departmentName;
		this.departmentId = departmentId;
		this.jobId = jobId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Override
	public int hashCode() {
		return this.id * 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee otherEmployee = (Employee) obj;
		return this.id == otherEmployee.getId() && this.email.equals(otherEmployee.getEmail());
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.id, this.firstName, this.lastName, this.email, this.salary, this.departmentId, this.departmentName, this.jobId);
	}
}
