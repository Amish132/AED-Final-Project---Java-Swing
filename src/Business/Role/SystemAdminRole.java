/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PartyEnterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminRole.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nitin
 */
public class SystemAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, account, (AdminOrganization) organization, (PartyEnterprise)enterprise, network, system);
    }
}
