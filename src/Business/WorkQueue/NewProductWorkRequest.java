/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Supplier.Supplier;

/**
 *
 * @author Dell-Smart
 */
public class NewProductWorkRequest extends WorkRequest {

    private int requestQuantity;
    private boolean add;
    private String productCategory;
    private String productName;
    private double price;
    private Supplier supplier;
    private String productID;

    public NewProductWorkRequest() {
        add = false;
    }

    public int getQuantity() {
        return requestQuantity;
    }

    public void setQuantity(int quantity) {
        this.requestQuantity = quantity;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
    return productName;
    }
    
    
}
