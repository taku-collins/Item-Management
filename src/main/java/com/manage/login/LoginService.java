package com.manage.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.manage.db.MYDB;
import java.sql.SQLException;
 
public class LoginService {
    public String doLogin(String username, String password){
    	 //String statement = "SELECT USER_NAME, PASSWORD FROM USER ";  
           String message = null;
  try {
         MYDB db = new MYDB();
            
        PreparedStatement statement = db.getConn().prepareStatement("select user_name, user_password from users where user_name = ? and user_password = ? ");
         
        statement.setString(1, username);
        statement.setString(2, password);
         ResultSet rs = statement.executeQuery();
        if(rs.next()){
            message = "SUCCESS";
        }else{
            message = "FAILURE";
        }
  }
   catch (SQLException e) {
        message = "FAILURE";
    }
    return message;
        }
    }
