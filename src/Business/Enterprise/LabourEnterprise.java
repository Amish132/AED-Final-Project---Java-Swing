/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Labour.SkilledLabour;
import Business.Role.DeliveryRole;
import Business.Role.Role;
import Business.Role.SkilledLabourRole;
import Business.Role.SystemAdminRole;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class LabourEnterprise extends Enterprise {

    public LabourEnterprise(String name) {
        super(name, EnterpriseType.Labour);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        //roles.add(new AdminRole());
        roles.add(new SystemAdminRole());
        return roles;
    }

}
