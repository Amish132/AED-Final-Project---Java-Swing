/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import UserInterface.SystemAdminRole.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Dell-Smart
 */
public class CustomerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account, network);
    }

    @Override
    public String toString() {
        return Role.RoleType.Customer.getValue();
    }

}
