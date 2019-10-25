
package com.trilochan.Dao;

import java.sql.Connection;
import com.trilochan.model.admin;
import com.trilochan.service.MySqlConnection;
import java.sql.PreparedStatement;

public class adminConnection {
    int a;
    public int adminCon(admin ad){
        Connection con = null;
        try {
           con =MySqlConnection.getInstance().getConnection();
           PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
           ps.setString(1, ad.getName());
           ps.setString(2, ad.getEmail());
           ps.setString(3, ad.getPhno());
           ps.setString(4, ad.getCity());
           ps.setString(5, ad.getPass());
           a = ps.executeUpdate();
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      return a;
    }
}

 
