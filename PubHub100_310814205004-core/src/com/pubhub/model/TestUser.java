package com.pubhub.model;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(1);
		user.setName("rani");
		user.setEmail("rani@gmail.com");
		user.setPassword("r123");
		user.setActive(1);
		System.out.println(user);

	}

}
