/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trilochan.model;

/**
 *
 * @author dell
 */
public class getpassword {
   private String otp;
   private String password;

    public getpassword(String otp, String password) {
        this.otp = otp;
        this.password = password;
    }

    public getpassword() {
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
}
