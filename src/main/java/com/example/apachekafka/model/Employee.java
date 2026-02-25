package com.example.apachekafka.model;

public class Employee {

	private String employeeName;
	private int id;
	private String projectName;
	private double salary;
	
	public Employee() {}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", id=" + id + ", projectName=" + projectName + ", salary="
				+ salary + "]";
	}
}
