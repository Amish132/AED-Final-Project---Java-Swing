/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class MasterOrderCatalogue 
{
    private ArrayList<Order> orderCatalogue;
    
    public MasterOrderCatalogue()
    {
        orderCatalogue = new ArrayList<Order>();
    }
    
    public ArrayList<Order> getOrderCatalogue()
    {
        return orderCatalogue;
    }
    
    public void SetOrderCatalogue(ArrayList<Order> orderCatalogue)
    {
        this.orderCatalogue = orderCatalogue ;
        
    }
    
    public Order addOrder(Order o)
    {
//        Order o = new Order();
        orderCatalogue.add(o);
        return o;
    }
}

