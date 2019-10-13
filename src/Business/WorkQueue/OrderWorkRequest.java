/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Customer.Customer;

import Business.Order.Order;

/**
 *
 * @author Dell-Smart
 */
public class OrderWorkRequest extends WorkRequest {
    
    private Order order;
    private boolean add;
    private Customer customer;

    public OrderWorkRequest() {
    add = false;
    super.setMessage("Pending");
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    
}
