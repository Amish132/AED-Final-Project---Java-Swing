/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Admin;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Dell-Smart
 */
public class Admin {
    
    private String name;
    private UserAccount ua;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public UserAccount getUa() {
        return ua;
    }
    
    
           
    
}
