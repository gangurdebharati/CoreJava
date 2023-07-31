package com.tnsif.jpastart.entities;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Jerry Rio");
		Address homeAddress = new Address();
		homeAddress.setStreet("120,Ashok Nagar");
		homeAddress.setCity("Bhavnagar");
		homeAddress.setState("Gujrat");
		homeAddress.setZipCode("411 068");
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	}
}