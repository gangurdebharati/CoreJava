package com.tns.curdoperation;

import com.tns.curdoperation.StatementInterfaceDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Executor {

	public static void main(String[] args) 
	{
		StatementInterfaceDemo.showEmp();
		
		StatementInterfaceDemo.addEmployee(16, "Roger", 25000);
		
		System.out.println(StatementInterfaceDemo.updateEmpName(15, "Peter"));
		
		StatementInterfaceDemo.updateEmpSalary(14, 40000);
		System.out.println("---After Updating Name and Salary---");
		StatementInterfaceDemo.showEmp();
		
		StatementInterfaceDemo.deleteEmp(13);
		System.out.println("---After Deleting---");
		StatementInterfaceDemo.showEmp();

	}

}