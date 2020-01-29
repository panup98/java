package com.anup.classes;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		System.out.println("---Employee Application---");
		
		Employee anup= new Employee();
		anup.setEmpName("Anup Patel");
		//anup.setEmpId(123);
		anup.setEmpDept("Engg");
		anup.setProjectName("Sales Microservices");
		
		System.out.println(anup.toString());
		
		EmployeeOps crud = new EmployeeOps();
		int empId = crud.createEmployee(anup);
		System.out.println("Generate Emp Id: " + empId);
		
		anup.setEmpId(empId);
		System.out.println(anup);
	}

}
