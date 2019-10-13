/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliveryRole;
import Business.Role.Role;
import Business.Role.SkilledLabourRole;
import Business.Role.SupplierRole;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class PartyEnterprise extends Enterprise {

    public PartyEnterprise(String name) {
        super(name, EnterpriseType.Party);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new AdminRole());
        roles.add(new SystemAdminRole());
        return roles;
    }

}
