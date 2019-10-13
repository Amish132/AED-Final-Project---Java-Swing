/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;

/**
 *
 * @author Dell-Smart
 */
public class CustomerSupplierWorkRequest extends WorkRequest{
    
    //private int requestQuantity;
    private boolean add;
    private Customer customer;
    private String username;
    private String password;
    
    public CustomerSupplierWorkRequest() {
        add = false;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
   
    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    
    
}
