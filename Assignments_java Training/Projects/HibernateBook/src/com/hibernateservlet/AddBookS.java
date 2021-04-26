package com.hibernateservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HibernateDao;
import com.sd.Book;

/**
 * Servlet implementation class AddBookS
 */
@WebServlet("/AddBookS")
public class AddBookS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
			//int id=Integer.parseInt(request.getParameter("id"));
		    String title = request.getParameter("title");
	        String author = request.getParameter("author");
	        String price = request.getParameter("price");
	        String genre = request.getParameter("genre");
	        
	        Book book = new Book( title,author,price,genre);

	        
	        HibernateDao.saveBook(book);
	        response.sendRedirect("Home.jsp");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
