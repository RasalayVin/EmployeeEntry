package com.ees.entity;

import java.io.Serializable;

public class EmployeeDetails implements Serializable{
	protected int employeeNo;
	protected String employeeName;
	protected double salaray;
	protected String address;
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalaray() {
		return salaray;
	}
	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public EmployeeDetails() {
	}
	public EmployeeDetails(int employeeNo, String employeeName, double salaray, String address) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salaray = salaray;
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", salaray=" + salaray
				+ ", address=" + address + "]";
	}
	
}
