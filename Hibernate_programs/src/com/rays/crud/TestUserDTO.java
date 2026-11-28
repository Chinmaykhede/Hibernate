package com.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.dto.UserDTO;

public class TestUserDTO {
	public final static SessionFactory sf = new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {

		Testadd();
		// Testupdate();
		// Testdelete();

	}

	private static void Testdelete() {

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		UserDTO dto = new UserDTO();

//		dto.setFirstName("Sita");
//		dto.setLastName("Kumari");
//		dto.setLogin("sita@gmail.com");
//		dto.setPassword("pass123");

		dto.setId(5);
		session.delete(dto);

		tx.commit();
		session.close();

	}

	private static void Testupdate() {

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		UserDTO dto = new UserDTO();

		dto.setFirstName("Rahul");
		dto.setLastName("Sharma");
		dto.setLogin("rahul@gmail.com");
		dto.setPassword("pass12346789");

		dto.setId(3);
		session.update(dto);

		tx.commit();
		session.close();

	}

	private static void Testadd() {

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		UserDTO dto = new UserDTO();

		dto.setFirstName("Rahul");
		dto.setLastName("Sharma");
		dto.setLogin("rahul@gmail.com");
		dto.setPassword("pass1234");

		session.save(dto);

		tx.commit();
		session.close();

	}
}
