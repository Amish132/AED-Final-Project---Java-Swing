/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.LabourEnterprise;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.equals(Type.Supplier)) {
            organization = new SupplierOrganization();
            organizationList.add(organization);
        } else if (type.equals(Type.Customer)) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        } else if (type.equals(Type.Delivery)) {
            organization = new DeliveryLabourOrganization();
            organizationList.add(organization);
        } else if (type.equals(Type.Skilled)) {
            organization = new SkilledLabourOrganization();
            organizationList.add(organization);
        } else if (type.equals(Type.Admin)) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
