/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Labour;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author nitin
 */
public class SkilledLabour {

    private String name;
    private String city;
    private String state;
    private String add1;
    private String add2;
    private String zip;
    private String phone;
    private WorkQueue workQueue;
    private UserAccount ua;

    public SkilledLabour() {
        workQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public UserAccount getUa() {
        return ua;
    }

    @Override
    public String toString() {
     return name;
    }

     
}
