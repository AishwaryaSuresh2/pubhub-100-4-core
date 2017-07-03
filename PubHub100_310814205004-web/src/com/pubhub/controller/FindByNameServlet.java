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
 * Servlet implementation class FindByNameServlet
 */
@WebServlet("/FindByNameServlet")
public class FindByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindByNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("name");
		Book book=new Book();
		book.setBook_name(name);
				
				BookDAO dao = new BookDAO();
			try{
				List<Book> books = dao.findByName(book);
			
				
			
			
				if (books.size() > 0) {
					RequestDispatcher requestdispatcher = request.getRequestDispatcher("search.jsp");
					request.setAttribute("books", books);
						requestdispatcher.forward(request, response);
					} 
				else {
					response.sendRedirect("home.jsp");

				}}
				catch(Exception e){
					e.printStackTrace();
				}
				
	}

}
