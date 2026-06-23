package com.orangehrm.pojo.addemployee;

public class AddEmployee_Input_Pojo {
	private String firstName;
	private String lastName;
	private String employeeId;
	private String jobTitle;
	private String employmentStatus;

	public AddEmployee_Input_Pojo() {
	}

	public AddEmployee_Input_Pojo(String firstName, String lastName, String employeeId, String jobTitle,
			String employmentStatus) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.employmentStatus = employmentStatus;
	}

}