/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.Product.Product;
import Business.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class Order 
{
    private ArrayList<OrderItem> orderItemList;
    private int orderNo;
    private Customer customer;
    private Supplier sp;
    

    public Supplier getSp() {
        return sp;
    }

    public void setSp(Supplier sp) {
        this.sp = sp;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    private static int count = 0;
    
    public Order()
    {
        count++;
        orderNo = count;
        orderItemList = new ArrayList<OrderItem>();
        
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public OrderItem addOrderItem(Product p , int q)
            
    {
        OrderItem o =new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        orderItemList.add(o);
        return o;
    }
    
    public void removeOrderItem(OrderItem o )
    {
         orderItemList.remove(0);
    }

    @Override
    public String toString() {
        return String.valueOf(orderNo);
    }
        
    
    
}

