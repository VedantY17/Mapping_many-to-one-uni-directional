package com.jsp.account.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveAcoountPerson {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("vedant");
		person.setEmail("veda@mail");
		person.setCno(8104880818l);

		Account account1 = new Account();
		account1.setBank_name("PNB");
		account1.setAccount_no(123456789);
		account1.setIfsc("PNBC12345");

		Account account2 = new Account();
		account2.setBank_name("MAHB");
		account2.setAccount_no(4567891);
		account2.setIfsc("MAHB12345");

		Account account3 = new Account();
		account3.setBank_name("BOI");
		account3.setAccount_no(363533937);
		account3.setIfsc("BOI1234455");

		account1.setPerson(person);
		account2.setPerson(person);
		account3.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account3);
		entityManager.persist(account2);
		entityManager.persist(account1);
		entityTransaction.commit();

	}

}
