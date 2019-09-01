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
@WebServlet( urlPatterns = {"/EditProduct.do"})
public class EditProd extends HttpServlet {
     	  /**
		 * 
		 */
private static final long serialVersionUID = 1L;

@Override
 protected void doGet(HttpServletRequest request,HttpServletResponse response) 
	    throws ServletException, IOException {
	
             String key1 = request.getParameter("E");

try {
        MYDB db = new MYDB();
                 
       java.sql.PreparedStatement st = db.getConn()
       .prepareStatement("select  from product where  id =  '" + key1 +"'"); 
        st.executeUpdate();
              String ID = request.getParameter("id");
	      String userx = request.getParameter("user");
                String  desc= request.getParameter("description"); 
               String prodname = request.getParameter("pname");
              String  cat = request.getParameter("Description");
               String  quent =  request.getParameter("Quantity");
	       db.getConn().close();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(deleteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   
       
 request.getRequestDispatcher("/WEB-INF/views/EditProduct.jsp").forward(
					request, response);
  	
	}
	
                
                
	

 
 
@Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
