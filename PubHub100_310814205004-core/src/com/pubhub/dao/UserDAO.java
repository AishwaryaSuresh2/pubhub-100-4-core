package com.pubhub.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pubhub.model.User;
import com.pubhub.util.ConnectionUtil;

public class UserDAO {

	 public void register(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "INSERT INTO users23(NAME, email,PASSWORD,active)VALUES(?,?,?,?);";

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		pst.setInt(4, 1);
		pst.executeUpdate();
		

	}
	 public boolean login(User user)throws Exception{
		 Connection connection = ConnectionUtil.getConnection();
		 String sql="SELECT NAME FROM users23 WHERE email=? AND PASSWORD=?";
		 PreparedStatement pst=connection.prepareStatement(sql);
		 pst.setString(1,user.getEmail() );
		 pst.setString(2, user.getPassword());
		 ResultSet rs=pst.executeQuery();
		 boolean flag=false;
		 if(rs.next()){
			 flag=true;
			 
		 }
		 return flag;
		 
		 
	 }
}
