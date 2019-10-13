/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Admin;

import Business.Labour.DeliveryPerson;
import java.util.ArrayList;

/**
 *
 * @author Dell-Smart
 */
public class AdminDirectory {
    
    private ArrayList<Admin> adminList;

    public AdminDirectory() {
        adminList = new ArrayList<>();
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }

    public Admin addAdmin() {
        Admin admin = new Admin();
        adminList.add(admin);
        return admin;
    }

    //Removing an Employee from the Directory
    public void removeAdmin(Admin admin) {
        adminList.remove(admin);
    }
    
}
