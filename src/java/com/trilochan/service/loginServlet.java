
package com.trilochan.service;

import com.trilochan.Dao.loginConnection;
import com.trilochan.Dao.welcome;
import com.trilochan.model.login;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(true);
        
        String email = req.getParameter("user");
        String pass = req.getParameter("password");
        session.setAttribute("email",email);

        login log = new login(email, pass);
        loginConnection lc = new loginConnection();
        int result = lc.loginCon(log);
        
        if (result >0) {
            
            welcome wc = new welcome();
            String name = wc.welcome(log);
            session.setAttribute("name", name);    
            req.getRequestDispatcher("donation.jsp").forward(req, resp);
        } 
        
        else {
            req.getRequestDispatcher("userlogin.jsp").forward(req, resp);
        }
    }

    
}
