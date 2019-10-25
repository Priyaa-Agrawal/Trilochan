
package com.trilochan.model;

public class register {
    private String name;
    private String email;
    private String phno;
    private String city;
    private String pass;

    public register(String name, String email, String phno, String city, String pass) {
        this.name = name;
        this.email = email;
        this.phno = phno;
        this.city = city;
        this.pass = pass;
    }

    public register() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
  
    
    
}
