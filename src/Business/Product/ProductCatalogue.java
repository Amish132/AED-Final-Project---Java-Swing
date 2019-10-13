/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Labour.DeliveryPerson;
import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class ProductCatalogue 

{
    
     private ArrayList<Product> prodCatalogue;
    
    public ProductCatalogue(){
        prodCatalogue= new ArrayList<>();
    }

    public ArrayList<Product> getProductCatalogue() {
        return prodCatalogue;
    }

    public void setProductCatalogue(ArrayList<Product> prodCatalogue) {
        this.prodCatalogue = prodCatalogue;
    }
     public Product addProduct() {
        Product product = new Product();
        prodCatalogue.add(product);
        return product;
    }
    
    //Removing an Employee from the Directory
    public void removeProduct(Product product) {
        prodCatalogue.remove(product);
    }
    
}
