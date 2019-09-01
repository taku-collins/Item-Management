package com.manage.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manage.db.MYDB;
import java.sql.SQLException;



@WebServlet(urlPatterns = "/register.do")
public class regServlet extends HttpServlet{

	/**
	 * 
	 */
	
private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
    	//added
    request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(
				request, response);	
	}
 
protected void doPost(HttpServletRequest request,  
			  HttpServletResponse response) 
			          throws ServletException, IOException 
	{ 
		 try { 
			    
// Initialize the database 			    
// Create a SQL query to insert data into demo table 
                  MYDB db = new MYDB();	              
		java.sql.PreparedStatement st = db.getConn()
		.prepareStatement("insert into users(user_name, user_password,name) values(?,?, ?)"); 
		// get the data using request object 
		st.setString(1, request.getParameter("user_name"));
		st.setString(2, request.getParameter("password"));
		st.setString(3, request.getParameter("uname")); 
		// Execute the insert command using executeUpdate() 
		st.executeUpdate(); 
		st.close(); 
		db.getConn().close(); 
		// to display the succesful result 
		PrintWriter out = response.getWriter(); 
		out.println("<html><body><b>Successfully SignUp"
			                          + "</b></body></html>"); 
	 } 
	 catch ( IOException | SQLException e) { 
			} 
		 
		 response.sendRedirect("/HS-Doct/home.do");
		} 
	} 
