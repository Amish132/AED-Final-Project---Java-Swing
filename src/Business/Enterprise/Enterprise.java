/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.AdminOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.DeliveryLabourOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SkilledLabourOrganization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author nitin
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
private UserAccountDirectory UAD;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        if(type.equals(EnterpriseType.Party)){
            organizationDirectory.createOrganization(Type.Admin);
            organizationDirectory.createOrganization(Type.Customer);
            organizationDirectory.createOrganization(Type.Supplier);
            
        }
        if(type.equals(EnterpriseType.Labour)){
            organizationDirectory.createOrganization(Type.Skilled);
            organizationDirectory.createOrganization(Type.Delivery);
        }
         UAD = new UserAccountDirectory();
    }

    public enum EnterpriseType {
        Party("Party"), Labour("Labour");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public UserAccountDirectory getUAD() {
        return UAD;
    }
    
    
    public SupplierOrganization getSupplierOrganization(){
            for(Organization o:organizationDirectory.getOrganizationList())
            {    if(o.getName().equals("Supplier Organization")){
                return (SupplierOrganization)o;
                }
            }
            return null;
        }
    public AdminOrganization getAdminOrganization(){
            for(Organization o:organizationDirectory.getOrganizationList())
            {   if(o.getName().equals("Admin Organization"))
            {   return (AdminOrganization)o;}
            }
            return null;
        }
    public CustomerOrganization getCustomerOrganization(){
            for(Organization o:organizationDirectory.getOrganizationList())
            {   if(o.getName().equals("Customer Organization"))
            {   return (CustomerOrganization)o;}
            }
            return null;
        }
    public SkilledLabourOrganization getSkilledOrganization(){
            for(Organization o:organizationDirectory.getOrganizationList())
            {   if(o.getName().equals("Skilled Labour Organization"))
            {   return (SkilledLabourOrganization)o;
            }}
            return null;
        }
    public DeliveryLabourOrganization getDeliveryOrganization(){
            for(Organization o:organizationDirectory.getOrganizationList())
            {   
                if(o.getName().equals("Delivery Organization"))
            {   
                return (DeliveryLabourOrganization)o;
            }
            }
            return null;
        }

}
