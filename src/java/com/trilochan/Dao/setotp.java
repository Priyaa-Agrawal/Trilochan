/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trilochan.Dao;

import com.trilochan.service.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class setotp {
int r=0;
    public int otp (String o,String email){
        
        Connection con = null;
        try {
           con =MySqlConnection.getInstance().getConnection();
           PreparedStatement ps = con.prepareStatement("update register set otp=? where email=?");
           ps.setString(1,o);
           ps.setString(2,email);
           
            int r = ps.executeUpdate();
           
            if(r!=0){
               System.out.println("Succesful");
           }
           else{
               System.out.println("UnSuccesful");
           }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      return r;
    }    

}
