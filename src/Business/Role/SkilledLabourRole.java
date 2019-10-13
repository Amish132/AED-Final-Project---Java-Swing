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
import UserInterface.SkilledLabourRole.SkilledLabourWorkAreaJPanel;
import UserInterface.SupplierRole.SupplierWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nitin
 */
public class SkilledLabourRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new SkilledLabourWorkAreaJPanel(userProcessContainer, account, network);
    }

    @Override
    public String toString() {
        return Role.RoleType.Skilled.getValue();
    }
}
