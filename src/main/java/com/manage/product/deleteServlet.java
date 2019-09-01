/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manage.product;

import com.manage.db.MYDB;

import java.io.IOException;
import java.sql.SQLException;
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
@WebServlet(urlPatterns = {"/deleteproduct.do"})
public class deleteServlet extends HttpServlet {

    
    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
       
   String key = request.getParameter("p");

try {
        MYDB db = new MYDB();
                 
       java.sql.PreparedStatement st = db.getConn()
       .prepareStatement("delete  from product where  id =  '" + key +"'"); 
        st.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(deleteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   
       
    response.sendRedirect("users.do");   
  	
	}


}
   
