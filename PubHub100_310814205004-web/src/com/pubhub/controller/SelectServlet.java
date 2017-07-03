package com.pubhub.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub.dao.BookDAO;
import com.pubhub.model.Book;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return 
	 * @return 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected  void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		// TODO Auto-generated method stub
		
		BookDAO dao = new BookDAO();
		List<Book> books = dao.findAll();
		
	try{
		
	if (books.size() > 0) {
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("select.jsp");
			request.setAttribute("books", books);
				requestdispatcher.forward(request, response);
			} 
	
		else {
			response.sendRedirect("home.jsp");

		}}
		catch(Exception e){
			
		}
	
	
	
		}

	

}
