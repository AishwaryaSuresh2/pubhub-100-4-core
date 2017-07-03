package com.pubhub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pubhub.model.Book;
import com.pubhub.util.ConnectionUtil;

public class BookDAO {	

	public void save(Book book){
		Connection connection = ConnectionUtil.getConnection();
		String sql = "INSERT INTO books(book_name,price,author_name)VALUES(?,?,?);";

		PreparedStatement pst=null;
		try {
			pst = connection.prepareStatement(sql);pst.setString(1, book.getBook_name());
			pst.setInt(2, book.getPrice());
			pst.setString(3, book.getAuthor_name());
			pst.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void update(Book book) {

		Connection connection = ConnectionUtil.getConnection();
		String sql = "UPDATE books SET author_name=? WHERE book_name=?;";

		PreparedStatement pst=null;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, book.getAuthor_name());
			pst.setString(2, book.getBook_name());
			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

	public void Remove(Book book) {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "DELETE FROM books WHERE book_name=?;";

		PreparedStatement pst=null;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, book.getBook_name());
			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Book> findAll(){
		Connection connection = ConnectionUtil.getConnection();
		String sql = "SELECT id,book_name,price,author_name FROM books;";

		PreparedStatement pst=null;
		try {
			pst = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs;
		try {
			rs = (ResultSet) pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List<Book> books=new ArrayList<>();
        return books;
	}
	public List<Book> findByName(Book book) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "SELECT id,book_name,price,author_name FROM books where book_name=?;";

		PreparedStatement pst = (PreparedStatement)connection.prepareStatement(sql);
		pst.setString(1,book.getBook_name());
		ResultSet rs =(ResultSet) pst.executeQuery();
        List<Book> books=new ArrayList<>();
        while(rs.next())
        {
        	Book b=new Book();
        	b.setId(rs.getInt(1));
        	b.setBook_name(rs.getString(2));
        	b.setPrice(rs.getInt(3));
        	b.setAuthor_name(rs.getString(4));
        	books.add(b);
        	
        }
        return books;
	}
}
