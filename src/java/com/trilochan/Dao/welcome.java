/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trilochan.Dao;

import com.trilochan.model.login;
import com.trilochan.service.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dell
 */
public class welcome {
    String a=null;
    public String welcome(login l){
        Connection con = null;
        try {
           con =MySqlConnection.getInstance().getConnection();
           PreparedStatement ps = con.prepareStatement("select name from register where email=?");
           ps.setString(1,l.getEmail());
            ResultSet rs = ps.executeQuery();
           if(rs.next()){
               
               System.out.println("Succesful");
               a=rs.getString(1);
           }
           else{
               System.out.println("UnSuccesful");
              
           }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      return a;
    }
    
}
