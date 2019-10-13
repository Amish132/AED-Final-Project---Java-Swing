/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class WorkQueue {

    private ArrayList<ProductWorkRequest> productWorkQueue;
    private ArrayList<WorkRequest> jobWorkQueue;
    private ArrayList<CustomerSupplierWorkRequest> customerSupplierWorkQueue;
    private ArrayList<OrderWorkRequest> orderWorkQueue;
    private ArrayList<NewProductWorkRequest> newProductWorkRequest; 

    public WorkQueue() {
        jobWorkQueue = new ArrayList<>();
        productWorkQueue = new ArrayList<>();
        customerSupplierWorkQueue = new ArrayList<>();
        orderWorkQueue = new ArrayList<>();
        newProductWorkRequest = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getJobWorkQueue() {
        return jobWorkQueue;
    }

    public ArrayList<ProductWorkRequest> getProductWorkQueue() {
        return productWorkQueue;
    }

    public ArrayList<CustomerSupplierWorkRequest> getCustomerSupplierWorkQueue() {
        return customerSupplierWorkQueue;
    }

    public ArrayList<OrderWorkRequest> getOrderWorkQueue() {
        return orderWorkQueue;
    }

    public ArrayList<NewProductWorkRequest> getNewProductWorkRequest() {
        return newProductWorkRequest;
    }

    

}
