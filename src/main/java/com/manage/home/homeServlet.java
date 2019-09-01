package com.manage.home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.manage.login.loginValidationService;

//import product.ProductService;

@WebServlet(urlPatterns = "/home.do")
public class homeServlet  extends HttpServlet {
	
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(
					request, response);
		
			
		}
		

	/*	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			response.sendRedirect("/HS-Doct/sign.do");	
			

		}*/
		

}



