package com.manage.login;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet<PrinterWriter> extends HttpServlet {
	// ProductService ds = new ProductService();
	
	/**
	 * 
	 */
    
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
    	//added
    	request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
				request, response);
		
	}
	
	
	
private LoginService service = null;

public void init(ServletConfig config) throws ServletException {
        System.out.println("initialized");
        service = new LoginService();
    }
 
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        RequestDispatcher rd = null;
        if((username == null || username.isEmpty()) || (password == null || password.isEmpty())){
            rd = request.getRequestDispatcher("/WEB-INF/views/staticV/failure.jsp");
            rd.forward(request, response);
        }else{
            String message = service.doLogin(username, password);
            if(message.equals("SUCCESS")){
                try {
                    request.setAttribute("username",username);

                   response.sendRedirect("users.do");
                } catch (Exception ex) {
                    Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
            }else if(message.equals("FAILURE")){
                rd = request.getRequestDispatcher("/WEB-INF/views/staticV/failure.jsp");
                rd.forward(request, response);
            }
                  }

    		
        }
    	

 }
    








