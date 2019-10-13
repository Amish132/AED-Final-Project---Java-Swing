/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliveryRole;
import Business.Role.Role;
import Business.Role.SkilledLabourRole;
import Business.Role.SupplierRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/**
 *
 * @author nitin
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private Set<String> tempCities;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
            
        }
        return business;
    }

    public EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        tempCities = new HashSet<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Set<String> getTempCities() {
        return tempCities;
    }

    public void addToTempNetwork(String name) {

        if (!tempCities.contains(name.toUpperCase())) {
            tempCities.add(name.toUpperCase());
        }

    }

    public void removeFromTempNetwork(String name) {

        if (!tempCities.contains(name.toUpperCase())) {
            tempCities.remove(name);
        }

    }

    public static void setInstance(EcoSystem system) {
        business = getInstance();
    }

    public Network createAndAddNetwork(String name) {
        Network network = new Network(name);
        networkList.add(network);
        return network;
    }

    public void removeNetwork(Network name) {

        networkList.remove(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new AdminRole());
        roles.add(new CustomerRole());
        roles.add(new SupplierRole());
        roles.add(new SkilledLabourRole());
        roles.add(new DeliveryRole());
        roles.add(new SystemAdminRole());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

        //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        //System.out.println("Size_0 "+business.getNetworkList().size());
        for (Network network : business.getNetworkList()) {
          //  System.out.println("Size_1 "+business.getNetworkList().size());
           // System.out.println("Size_1 "+network);
        //if(network.getUAD().checkIfUsernameIsUnique(username))
        //return false;

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUAD().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        return false;
                    }
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }

        //  }
        return true;
    }
}
