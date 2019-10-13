/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Labour.SkilledLabourDirectory;
import Business.Role.Role;
import Business.Role.SkilledLabourRole;
import Business.Role.SupplierRole;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class SkilledLabourOrganization extends Organization {

    private SkilledLabourDirectory skilledLabourDirectory;

    public SkilledLabourOrganization() {
        super(Type.Skilled.getValue());
        skilledLabourDirectory = new SkilledLabourDirectory();
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        HashSet<Role> roles = new HashSet<Role>();
        roles.add(new SkilledLabourRole());
        return roles;
    }

    public SkilledLabourDirectory getSkilledLabourDirectory() {
        return skilledLabourDirectory;
    }

}
