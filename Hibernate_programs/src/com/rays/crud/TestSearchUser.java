package com.rays.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.rays.dto.UserDTO;

public class TestSearchUser {
	public static void main(String[] args) {

		SearchUser search = new SearchUser();

		UserDTO dto = new UserDTO();

		List<UserDTO> list = search.search(dto, 1, 5);

		Iterator<UserDTO> it = list.iterator();

		while (it.hasNext()) {

			UserDTO user = it.next();

			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getLogin());
			System.out.println(user.getPassword());
			System.out.println("==============================");

		}
	}

}
