package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client
{
public static void main(String[] args) 
{
//Debug this program as Debug -> Debug as Java Application
	
StudentService service = new StudentServiceImpl();
Student student = new Student();

// Create Operation
student.setStudentId(115);
student.setName("Namrata");
service.addStudent(student);

//at this breakpoint, we have added one record to table
// Retrieve Operation
student = service.findStudentById(102);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName());

//Update Operation
student = service.findStudentById(111);
student.setName("Sneha");
service.updateStudent(student);


//at this breakpoint, we have updated record added in first section
student = service.findStudentById(111);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName()); 

//at this breakpoint, record is removed from table
//Delete Operation
student = service.findStudentById(114);
service.removeStudent(student);
System.out.println("End of program/Life cycle completed..."); 

}
}