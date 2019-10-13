/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

/**
 *
 * @author Dell-Smart
 */
public class Product {

    private String productCategory;
    private String productName;
    private double price;

    public Product(String name) {
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }

}
