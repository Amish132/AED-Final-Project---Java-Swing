/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Dell-Smart
 */
public class ProductWorkRequest extends WorkRequest {

    private String productCategory;
    private String productID;
    private int productQty;
    private String productName;
    private double price;

    public ProductWorkRequest(String name) {
        productName = name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    
    
}
