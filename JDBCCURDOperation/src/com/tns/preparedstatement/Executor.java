package com.tns.preparedstatement;

public class Executor {

	public static void main(String[] args) {
		
		System.out.println("Employee details are as follows:");
		PreparedStatementInterface.showEmp();
		
		System.out.println("---Update name of Employee--");
		PreparedStatementInterface.updateEmpName(5, "Neeta");
		PreparedStatementInterface.showEmp();
		
		System.out.println("---Update salary of Employee");
		PreparedStatementInterface.updateEmpSalary(16, 83700);
		PreparedStatementInterface.showEmp();
		
		System.out.println("---Add Employee---");
		PreparedStatementInterface.addEmployee(20, "Kavita", 88000);
		PreparedStatementInterface.showEmp();
		
		System.out.println("---Deleted Employee---");
		if(PreparedStatementInterface.deleteEmp(8)==false)
		
			System.err.println("No such employee found.....");
		
		else
		
			System.out.println("Employee is deleted....");
		
		PreparedStatementInterface.showEmp();
	}
}
