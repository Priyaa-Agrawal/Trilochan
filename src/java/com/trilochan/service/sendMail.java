/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trilochan.service;


import com.trilochan.Dao.checkemail;
import com.trilochan.Dao.setotp;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import jdk.nashorn.internal.ir.RuntimeNode;


@WebServlet(name = "sendMail", urlPatterns = {"/sendMail"})
public class sendMail extends HttpServlet {
    
    static String a = link(5);
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email;     
        try {
            email = request.getParameter("user");            
            checkemail c = new checkemail();
            int result = c.check(email);
            
            if(result!=0){
            Email(email);
            setotp o = new setotp();
            o.otp(a,email);
            request.getRequestDispatcher("alert.jsp").forward(request, response);
            }
            else{
            request.getRequestDispatcher("check.jsp").forward(request, response);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  public static void Email(String to){
        final String username = "trilochanngo@gmail.com";
        final String password = "shivshakti";
        
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465"); 
          Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(username,password);  
           }});             

          System.out.println("try");
          try {
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject("Trilochan");    
           message.setText("Set Your New Password"+ "\n\n CLick the link below!!\n\n " +"http://localhost:8080/TrilochanNgo/setpassword.jsp?otp="+a);    
           Transport.send(message);           
        } catch (Exception e) {
            e.printStackTrace();
        }
         
  }    
          public static String link(int n){
            String AlphaNumericString = "abcdefghijklmnopqrstuvxyz"+ "0123456789"; 
            StringBuilder sb = new StringBuilder(n); 
		for (int i = 0; i <n; i++) { 
			int index = (int)(AlphaNumericString.length()* Math.random()); 
			sb.append(AlphaNumericString.charAt(index)); 
		} 
		return sb.toString(); 
    }
}
