/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Role.AdminRole;
import Business.Admin.Admin;
import Business.Network.Network;
import Business.UserAccount.UserAccount;

/**
 *
 * @author nitin
 */
public class ConfigureABusiness {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Network n = new Network("Boston");
        system.getNetworkList().add(n);
//
//        Enterprise partyEnterprise = n.getEnterpriseDirectory().createAndAddEnterprise("Party", Enterprise.EnterpriseType.Party);
//        Enterprise labourEnterprise = n.getEnterpriseDirectory().createAndAddEnterprise("Labour", Enterprise.EnterpriseType.Labour);
//
//        Organization adminOrganization = partyEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
//        SupplierOrganization supplierOrganization = (SupplierOrganization)partyEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        Organization customerOrganization = partyEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
//        Organization skilledLabourOrganization = labourEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Skilled);
//        Organization deliveryOrganization = labourEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Delivery);
//
//        supplierOrganization.addSupplier("Party Balloons");
//        supplierOrganization.addSupplier("DJ Equipments");
//        supplierOrganization.addSupplier("Decoration");
//        
        
        
        Admin admin = n.getAdminOrganization().getAD().addAdmin();
//        Employee sysAdmin = system.getEmployeeDirectory().createEmployee("SystemAdmin");
//        Employee customer = system.getEmployeeDirectory().createEmployee("Customer");
//        Employee supplier = system.getEmployeeDirectory().createEmployee("Supplier");
//        Employee skilledLabour = system.getEmployeeDirectory().createEmployee("skilledLabour");
//        Employee deliveryPerson = system.getEmployeeDirectory().createEmployee("deliveryPerson");

        UserAccount ua = n.getAdminOrganization().getUserAccountDirectory().createUserAccount("admin", "admin", new AdminRole());
        admin.setUa(ua);
//        system.getUserAccountDirectory().createUserAccount("sysAdmin", "sysAdmin", sysAdmin, new SystemAdminRole());
//        system.getUserAccountDirectory().createUserAccount("customer", "customer", customer, new CustomerRole());
//        system.getUserAccountDirectory().createUserAccount("supplier", "supplier", supplier, new SupplierRole());
//        system.getUserAccountDirectory().createUserAccount("skilled", "skilled", skilledLabour, new SkilledLabourRole());
//        system.getUserAccountDirectory().createUserAccount("delivery", "delivery", deliveryPerson, new DeliveryRole());

        return system;
    }

}
