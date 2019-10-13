/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Labour.DeliveryPersonDirectory;
import Business.Role.CustomerRole;
import Business.Role.DeliveryRole;
import Business.Role.Role;
import Business.Role.SkilledLabourRole;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class DeliveryLabourOrganization extends Organization {

    private DeliveryPersonDirectory dpd;

    public DeliveryLabourOrganization() {
        super(Type.Delivery.getValue());
        dpd = new DeliveryPersonDirectory();
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new DeliveryRole());
        return null;
    }

    public DeliveryPersonDirectory getDpd() {
        return dpd;
    }

}
