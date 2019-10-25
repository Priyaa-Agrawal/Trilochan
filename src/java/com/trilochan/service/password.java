/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trilochan.service;

import com.trilochan.Dao.setpassword;
import com.trilochan.model.getpassword;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "password", urlPatterns = {"/password"})
public class password extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String otp = request.getParameter("otp");
        String newpassword = request.getParameter("pass");
        
        getpassword gp = new getpassword(otp, newpassword);
        setpassword sp = new setpassword();
        
        int result = sp.set(gp);
        
            if(result==0){
            request.getRequestDispatcher("register.jsp").forward(request, response);
            }
            else{
            request.getRequestDispatcher("userlogin.jsp").forward(request, response);
            }
    
    }
}
