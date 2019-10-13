/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierRole;
//import Business.Supplier.Product;
import Business.Supplier.Supplier;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class SupplierOrganization extends Organization {

    private ArrayList<Supplier> listOfSupplier;

    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
        listOfSupplier = new ArrayList<>();
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        HashSet<Role> roles = new HashSet<Role>();
        roles.add(new SupplierRole());
        return roles;
    }

    public ArrayList<Supplier> getListOfSupplier() {
        return listOfSupplier;
    }

    public Supplier addSupplier(String name) {
        Supplier newSupplier = new Supplier(name);
        listOfSupplier.add(newSupplier);
        return newSupplier;
    }

    public void removeSupplier(Supplier supplier) {
        listOfSupplier.remove(supplier);
    }

}
