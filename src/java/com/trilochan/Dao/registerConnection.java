
package com.trilochan.Dao;

import java.sql.Connection;
import com.trilochan.model.register;
import com.trilochan.service.MySqlConnection;
import java.sql.PreparedStatement;

public class registerConnection {
    int a;
    public int login(register r){
        Connection con = null;
        try {
           con =MySqlConnection.getInstance().getConnection();
           PreparedStatement ps = con.prepareStatement("insert into register (name,email,phno,city,pass) values(?,?,?,?,?)");
           ps.setString(1, r.getName());
           ps.setString(2, r.getEmail());
           ps.setString(3, r.getPhno());
           ps.setString(4, r.getCity());
           ps.setString(5, r.getPass());
           a = ps.executeUpdate();
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      return a;
    }
    
}
