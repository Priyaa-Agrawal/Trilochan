/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trilochan.Dao;

import com.trilochan.service.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class checkemail {
 int a=0;
    public int check(String email){
        Connection con = null;
        try {
           con =MySqlConnection.getInstance().getConnection();
           PreparedStatement ps = con.prepareStatement("select email from register where email=? ");
           ps.setString(1,email);           
            ResultSet rs = ps.executeQuery();
           if(rs.next()){
               System.out.println("Succesful");
               a=1;
           }
           else{
               System.out.println("UnSuccesful");
               a=0;
           }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      return a;
    }
   
    
}
