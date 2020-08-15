package com.sample;

public class Employee implements Comparable<Object> {

	private int employeeId;
	private String employeeName;
	private String designation;

	public Employee(int employeeId, String employeeName, String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
	}

	@Override
	public int compareTo(Object e) {
		int id = ((Employee) e).employeeId;

		return this.employeeId - id;
	}

	@Override
	public String toString() {
		return "[ Employee ID:" + employeeId + ", Employee Name: " + employeeName + ", Designation: " + designation + "]";
	}
}
