/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class CustomerDirectory 

{
         private ArrayList<Customer> customerDirectory ;
    
    public CustomerDirectory()
    {
        customerDirectory = new ArrayList<Customer>() ; 
        
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }
    
    public Customer addCustomerDetails()
    {
        Customer customer = new Customer();
        customerDirectory.add(customer);
        return customer;
    }
    
    public void removePersonDetails ( Customer customer)
    {
        customerDirectory.remove(customer);
    }
    
    public Customer searchPersonDetails(String name) 
    {
        for( Customer customer : customerDirectory)
        {
            if(name.equalsIgnoreCase(customer.getCustomerName()) )
            {
                return customer;
            }
        }
        return null;
    }
    
    
}
