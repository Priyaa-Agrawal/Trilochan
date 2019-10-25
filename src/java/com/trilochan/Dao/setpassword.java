
package com.trilochan.Dao;

import com.trilochan.model.getpassword;
import com.trilochan.model.login;
import java.sql.Connection;
import com.trilochan.model.register;
import com.trilochan.service.MySqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class setpassword {
    int a=0;
    public int set(getpassword gp){
        Connection con = null;
        String o = gp.getOtp();
        if(o == null) {
            a = 0;
        } else {
            try {
                con =MySqlConnection.getInstance().getConnection();
                PreparedStatement psemail = con.prepareStatement("select email from register where otp=?");
                psemail.setString(1, o);
                ResultSet rs = psemail.executeQuery();
                String e = rs.getString(1);
                PreparedStatement ps = con.prepareStatement("update register set pass=? and otp='null' where email=?");
                ps.setString(1, gp.getPassword());
//                ps.setString(2, o);
                ps.setString(2, e);
                a = ps.executeUpdate();
                
                if(a!=0){
                    System.out.println("Succesful");
                }
                else{
                    System.out.println("UnSuccesful");
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
      return a;
    }
}
