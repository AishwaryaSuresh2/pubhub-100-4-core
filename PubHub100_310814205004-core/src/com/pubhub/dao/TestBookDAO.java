package com.pubhub.dao;

import com.pubhub.model.Book;
import com.pubhub.model.User;

public class TestBookDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	Book book=new Book();
		book.setBook_name("Two States");
		book.setPrice(300);
		book.setAuthor_name("bhagat");
	

		System.out.println("inserted");
		
		BookDAO dao=new BookDAO();
		dao.save(book);

	}

}
