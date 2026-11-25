package com.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.dto.UserDTO;

public class TestInsert {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		UserDTO dto = new UserDTO();

		dto.setFirstName("Sita");
		dto.setLastName("Kumari");
		dto.setLogin("sita@gmail.com");
		dto.setPassword("pass1234");
		
		dto.setId(2);
		session.update(dto);
		
      // session.save(dto);
		//session.delete(dto);
	
		tx.commit();
	session.close();

	}
}
