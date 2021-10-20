package com.employeeManagement;

public class EmployeeImp {
	
	private int empId;
	private String empName;
	private String empPhone;
	private String empAdders;
	
	public EmployeeImp(int empId, String empName, String empPhone, String empAdders) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAdders = empAdders;
	}

	public EmployeeImp(String empName, String empPhone, String empAdders) {
		super();
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAdders = empAdders;
	}

	public EmployeeImp() {
		super();
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpAdders() {
		return empAdders;
	}

	public void setEmpAdders(String empAdders) {
		this.empAdders = empAdders;
	}

	@Override
	public String toString() {
		return "EmployeeImp [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empAdders="
				+ empAdders + "]";
	}
	
	

}
