package com.manage.product;

import com.manage.db.MYDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductService{

    private ArrayList<productGS> list;

     public ArrayList<productGS> getAllProduct() {
         
            MYDB db = new MYDB();
        ArrayList<productGS> list = new ArrayList<productGS>();
         String sql = "Select * From product";
        try {
            PreparedStatement stmt = db.getConn().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String user = rs.getString("user");
                String describtion = rs.getString("describtion");
                String name = rs.getString("name");
                String category = rs.getString("category");
                String quantity = rs.getString("quantity");
                productGS b = new productGS(id, user, describtion,name,category,quantity);
                list.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
public ArrayList<productGS> retrieves(){

         return list;
}
    

 

}
