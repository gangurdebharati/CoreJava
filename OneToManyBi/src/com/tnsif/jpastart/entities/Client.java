package com.tnsif.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client
{
	public static void main(String[]args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department department=new Department();
		department.setId(2);
		department.setName("IT");
		
		Employee e1=new Employee();
		e1.setId(1003);
		e1.setName("Nick Fernadise");
		e1.setSalary(50000);
		
		Employee e2=new Employee();
		e2.setId(1004);
		e2.setName("Nelson D'souza");
		e2.setSalary(55000);
		
		department.addEmployee(e1);
		department.addEmployee(e2);
		
		em.persist(department);
		
		System.out.println("Addres deaprtment along with employee to database...");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
	}
}