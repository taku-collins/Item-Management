package com.manage.product;


import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manage.db.MYDB; 
import java.io.PrintWriter;
import java.sql.SQLException;



@WebServlet(urlPatterns = "/addproduct.do")

public class addProductServlet  extends HttpServlet { 
	  /**
		 * 
		 */
private static final long serialVersionUID = 1L;

 protected void doGet(HttpServletRequest request, 
	    HttpServletResponse response) 
	    throws ServletException, IOException { 
		request.getRequestDispatcher("/WEB-INF/views/addproduct.jsp").forward(
					request, response);	
		}

 
 
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException 	{ 
        PrintWriter out = response.getWriter();
	try {

    MYDB db = new MYDB();	              
    java.sql.PreparedStatement st = db.getConn()
    .prepareStatement("insert into product (id,user,describtion,name,category,quantity) values(?,?,?,?,?,?)"); 
                st.setString(1, request.getParameter("id"));
	       st.setString(2, request.getParameter("uname"));
	       st.setString(3, request.getParameter("category")); 
                st.setString(4, request.getParameter("pname"));
                st.setString(5, request.getParameter("Description"));
                st.setString(6, request.getParameter("Quantity"));
	       db.getConn().close();
	st.executeUpdate();
	} catch (SQLException ex) {
            out.println("error" + ex);
		}

       response.sendRedirect("users.do");
	}

	
}
