/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.LabourEnterprise;
import Business.Enterprise.PartyEnterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.DeliveryLabourOrganization;
import Business.Organization.Organization;
import Business.Organization.SkilledLabourOrganization;
import Business.Organization.SupplierOrganization;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author nitin
 */
public class Network {

    private String cityName;
    private EnterpriseDirectory enterpriseDirectory;
    private UserAccountDirectory UAD;

    public Network(String name) {
        cityName = name;
        enterpriseDirectory = new EnterpriseDirectory();
        enterpriseDirectory.createAndAddEnterprise("Party", Enterprise.EnterpriseType.Party);
        enterpriseDirectory.createAndAddEnterprise("Labour", Enterprise.EnterpriseType.Labour);
        
        UAD = new UserAccountDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public PartyEnterprise getPartyEnterprise(){
        for(Enterprise e:enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals("Party"))
                return (PartyEnterprise)e;
        }
        return null;
    }
    
    public LabourEnterprise getLabourEnterprise(){
        for(Enterprise e:enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals("Labour"))
                return (LabourEnterprise)e;
        }
        return null;
    }
    
    
    public SupplierOrganization getSupplierOrganization(){
            for(Enterprise e:enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals("Party")){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList())
            {    if(o.getName().equals("Supplier Organization")){
                return (SupplierOrganization)o;
                }
            }
            }
        }
            return null;
        }
    
    public CustomerOrganization getCustomerOrganization(){
            for(Enterprise e:enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals("Party")){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList())
            {    if(o.getName().equals("Customer Organization")){
                return (CustomerOrganization)o;
                }
            }
            }
        }
            return null;
        }
    
    public AdminOrganization getAdminOrganization(){
            for(Enterprise e:enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals("Party")){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList())
            {    if(o.getName().equals("Admin Organization")){
                return (AdminOrganization)o;
                }
            }
            }
        }
            return null;
        }
    
    public SkilledLabourOrganization getSkilledOrganization(){
            for(Enterprise e:enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals("Labour")){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList())
            {    if(o.getName().equals("Skilled Labour Organization")){
                return (SkilledLabourOrganization)o;
                }
            }
            }
        }
            return null;
        }
    
    public DeliveryLabourOrganization getDeliveryOrganization(){
            for(Enterprise e:enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals("Labour")){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList())
            {    if(o.getName().equals("Delivery Organization")){
                return (DeliveryLabourOrganization)o;
                }
            }
            }
        }
            return null;
        }
   
    
    
    public String getCityName() {
        return cityName;
    }
//
//    public void setCityName(String cityName) {
//        this.cityName = cityName;
//    }

    public UserAccountDirectory getUAD() {
        return UAD;
    }

    @Override
    public String toString() {
        return cityName;
    }

}
