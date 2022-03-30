package com.te.hibernatedummy.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateInsert {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.setEmpId(19);
	employee.setEname("Sanjana");
	employee.setAddress("Bangalore");
	employee.setPassword("Good");
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employee");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(employee);
	entityTransaction.commit();
}
}
