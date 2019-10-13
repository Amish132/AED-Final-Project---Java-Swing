/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Admin.AdminDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class AdminOrganization extends Organization {

    AdminDirectory AD;
    
    public AdminOrganization() {
        super(Organization.Type.Admin.getValue());
        AD = new AdminDirectory();
    }

    public AdminDirectory getAD() {
        return AD;
    }

    
    @Override
    public HashSet<Role> getSupportedRole() {
        HashSet<Role> roles = new HashSet<>();
        roles.add(new AdminRole());
        roles.add(new SystemAdminRole());
        return roles;
    }

}
