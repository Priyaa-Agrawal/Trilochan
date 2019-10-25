
package com.trilochan.service;

import com.trilochan.Dao.checkemail;
import com.trilochan.Dao.registerConnection;
import com.trilochan.model.register;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "registerServlet", urlPatterns = {"/registerServlet"})
public class registerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phno = req.getParameter("phno");
        String city = req.getParameter("city");
        String pass = req.getParameter("pass");
        
        checkemail c = new checkemail();
        int result = c.check(email);
        
            if(result!=0){
            req.getRequestDispatcher("check1.jsp").forward(req, resp);
            }
            
            else{
        register r =new register(name, email, phno, city, pass);
        
        
        registerConnection rc = new registerConnection();
        int i = rc.login(r);
        
        if (i>=0) {
            req.getRequestDispatcher("userlogin.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
    }
    }
    
   

}
