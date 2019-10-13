/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Product.Product;
//import Business.Product.ProductCatalogue;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Dell-Smart
 */
public class Supplier {

    private String name;
    private HashMap<Product, Integer> listOfProducts;
    private UserAccount ua;
    private String city;
    private String state;
    private String add1;
    private String add2;
    private String zip;
    private String phone;
    private WorkQueue workQueue;
    
    
    
    public Supplier(String name) {
        this.name = name;
        listOfProducts = new HashMap<>();
    }


    public String getAdd1() {
        return add1;
    }

    public String getAdd2() {
        return add2;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setListOfProducts(HashMap<Product, Integer> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    
    
    public HashMap<Product, Integer> getListOfProducts() {
        return listOfProducts;
    }

    public String getName() {
        return name;
    }

    public Product addProduct(String name, int qty) {
        Product newProduct = new Product(name);
        listOfProducts.put(newProduct, qty);
        return newProduct;
    }

    public void removeProduct(Product product) {
        listOfProducts.remove(product);
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

}
