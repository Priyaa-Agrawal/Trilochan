
package com.trilochan.service;

import com.trilochan.Dao.adminConnection;
import com.trilochan.model.admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "adminServlet", urlPatterns = {"/adminServlet"})
public class adminServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phno = req.getParameter("phno");
        String city = req.getParameter("city");
        String pass = req.getParameter("pass");
        
        admin ad =new admin(name, email, phno, city, pass);
        
        adminConnection ac = new adminConnection();
        int i = ac.adminCon(ad);
        if (i>=0) {
            req.getRequestDispatcher("adminlogin.html").forward(req, resp);
        } else {
            req.getRequestDispatcher("adminRegister.html").forward(req, resp);
        }
    }
}


