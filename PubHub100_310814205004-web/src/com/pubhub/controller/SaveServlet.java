package com.pubhub.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub.dao.BookDAO;
import com.pubhub.dao.UserDAO;
import com.pubhub.model.Book;
import com.pubhub.model.User;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String book_name=request.getParameter("name");
		String author_name=request.getParameter("author_name");

        Book book=new Book();
		book.setBook_name(book_name);
	   
		book.setAuthor_name(author_name);
		
		
		BookDAO dao=new BookDAO();
		
			try {
				dao.save(book);
				System.out.println("inserted");
			
			} catch (Exception e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
