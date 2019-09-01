package com.manage.home;

import com.manage.db.MYDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class homeService extends HttpServlet {
    
 /*   @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException 	{ 
        PrintWriter out = response.getWriter();
	try {	
    MYDB db = new MYDB();	              
    java.sql.PreparedStatement st = db.getConn()
    .prepareStatement("select from product (id,user,describtion,name,category,quantity) values(?,?,?,?,?,?)"); 

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
        
 
       response.sendRedirect("home.do");
	}
*/

}
