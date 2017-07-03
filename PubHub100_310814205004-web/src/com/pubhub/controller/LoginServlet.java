package com.pubhub.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub.dao.UserDAO;
import com.pubhub.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		UserDAO dao=new UserDAO();
	
		try
		{
		
			boolean flag=dao.login(user);
		if(flag){
			response.sendRedirect("success.jsp");

			
		}
		else
			{
			response.sendRedirect("login.jsp");
			System.out.println("Error has occured,kindly login again");
			}
			}catch(Exception e)
			
		{
			response.sendRedirect("login.jsp");
			System.out.println(" Error has occured,kindly login again");
	
		}
		
	}

}
