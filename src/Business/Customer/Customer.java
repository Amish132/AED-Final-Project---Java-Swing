/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;

/**
 *
 * @author nitin
 */
public class Customer 

{
    private String customerName;
    private int customerId;
    private double contact;
    private String address;
    private String industry;
    private UserAccount ua;

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public UserAccount getUa() {
        return ua;
    }
    
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
     @Override //run time polymorphism 
    public String toString() // to overwrite details with objext address
    {
     return this.customerName; 
    }
    
}
