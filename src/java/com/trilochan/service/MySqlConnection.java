
package com.trilochan.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
    private static MySqlConnection instance;
    private static Connection con;
    
    public static MySqlConnection getInstance(){
        if(instance == null){
        instance = new MySqlConnection();
        }
    return instance;
    }
    
    public static Connection getConnection(){
            if(con == null){
            try {
                String driver = "jdbc:mysql://localhost:3306/";
                String database ="trilochan";
                String username ="root";
                String pass ="1234";
                
                Class.forName("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection(driver+database,username,pass);
      
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    return con;
    }
}
