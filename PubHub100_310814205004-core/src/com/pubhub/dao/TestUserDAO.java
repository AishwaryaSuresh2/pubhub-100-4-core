package com.pubhub.dao;

import com.pubhub.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		User user=new User();
		user.setName("diya");
		user.setEmail("diya@gmail.com");
		user.setPassword("d678");
		user.setActive(1);

		System.out.println("inserted");
		
		UserDAO dao=new UserDAO();
		dao.register(user);
	
	
	}

}
