/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manage.user;

import com.manage.login.LoginServlet;
import com.manage.product.ProductService;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author collins
 */
@WebServlet(urlPatterns = {"/users.do"})
public class userServlet extends HttpServlet {
 ProductService ds = new ProductService();
 @Override
 protected void doGet(HttpServletRequest request, 
	    HttpServletResponse response) 
    	    throws ServletException, IOException { 
     String username = request.getParameter("username");
     try {
     request.setAttribute("username",username);
     request.setAttribute("products",ds.getAllProduct());
     request.getRequestDispatcher("/WEB-INF/views/user.jsp").forward(
     request, response);	
		 } catch (IOException | ServletException ex) {
                    Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                }

    }   
 
 
     @Override
 protected void doPost(HttpServletRequest request, 
	    HttpServletResponse response) 
    	    throws ServletException, IOException { 
     String username = request.getParameter("username");
     try {
     request.setAttribute("username",username);
     request.setAttribute("products",ds.getAllProduct());
		request.getRequestDispatcher("/WEB-INF/views/user.jsp").forward(
					request, response);	
		 } catch (IOException | ServletException ex) {
                    Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
     


    }
 
}




