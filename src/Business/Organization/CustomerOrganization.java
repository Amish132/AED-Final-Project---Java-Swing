/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class CustomerOrganization extends Organization {

    CustomerDirectory cd;
    
    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
        cd = new CustomerDirectory();
    }

    public CustomerDirectory getCd() {
        return cd;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        HashSet<Role> roles = new HashSet<>();
        roles.add(new CustomerRole());
        return roles;
    }

}
