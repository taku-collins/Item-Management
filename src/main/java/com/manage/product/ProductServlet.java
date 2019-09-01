package com.manage.product;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/user.do")
public class ProductServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProductService productservice = new ProductService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		//request.getSession().setAttribute("prods", productservice.getproductGS());
		request.getRequestDispatcher("/WEB-INF/views/user.jsp").forward(
				request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String newproducts =request.getParameter("prod");
	
		
		//request.getSession().setAttribute("prods", productservice.getproductGS());
		request.getRequestDispatcher("/WEB-INF/views/user.jsp").forward(
				request, response);
	}	
	
	

	

}