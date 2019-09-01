/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manage.product;

import java.util.Objects;
    
/**
 *
 * @author collins
 */
public class productGS {

    public productGS(String id, String productName, String userName, String Description, String Category, String Quantity) {
        this.id = id;
        this.productName = productName;
        this.userName = userName;
        this.Description = Description;
        this.Category = Category;
        this.Quantity = Quantity;
    }



    
    private String id;
    private String productName;
    private String userName;
    private String Description;
    private String Category;
    private String Quantity;

    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.productName);
        hash = 83 * hash + Objects.hashCode(this.userName);
        hash = 83 * hash + Objects.hashCode(this.Description);
        hash = 83 * hash + Objects.hashCode(this.Category);
        hash = 83 * hash + Objects.hashCode(this.Quantity);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final productGS other = (productGS) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Category, other.Category)) {
            return false;
        }
        if (!Objects.equals(this.Quantity, other.Quantity)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    

    
    public String getId    () {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    
    
    
    
    @Override
    public String toString() {
        return "productGS{" + "id=" + id + ", productName=" + productName + ", userName=" + userName + ", Description=" + Description + ", Category=" + Category + ", Quantity=" + Quantity + '}';
    }

 



}
