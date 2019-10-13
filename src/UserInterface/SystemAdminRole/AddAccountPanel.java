/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LabourEnterprise;
import Business.Enterprise.PartyEnterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.DeliveryLabourOrganization;
import Business.Organization.Organization;
import Business.Organization.SkilledLabourOrganization;
import Business.Organization.SupplierOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Dell-Smart
 */
public class AddAccountPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddAccountPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Network network;
    SkilledLabourOrganization skilledLabour;
    DeliveryLabourOrganization deliveryLabour;
    SupplierOrganization supplier;
    CustomerOrganization customer;
    AdminOrganization admin;
    
    
    public AddAccountPanel(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.system = system;
        this.network = network;
//        
        deliveryLabour = network.getDeliveryOrganization();
        customer = network.getCustomerOrganization();
        supplier = network.getSupplierOrganization();
        admin = network.getAdminOrganization();
        skilledLabour = network.getSkilledOrganization();
        
//        for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
//            if(e.getName().equals("Party"))
//                party = (PartyEnterprise)e;
//            else if(e.getName().equals("Labour"))
//                labour = (LabourEnterprise)e;
//            
//        }
//        
//        for(Organization o:labour.getOrganizationDirectory().getOrganizationList()){
//            if(o.getName().equals(Organization.Type.Skilled.getValue()))
//                skilledLabour = (SkilledLabourOrganization)o;
//            else if(o.getName().equals(Organization.Type.Delivery.getValue()))
//                deliveryLabour = (DeliveryLabourOrganization)o;
//        }
//        
//        for(Organization o:party.getOrganizationDirectory().getOrganizationList())
//        {
//            if(o.getName().equals(Organization.Type.Supplier.getValue()))
//                supplier = (SupplierOrganization)o;
//            else if(o.getName().equals(Organization.Type.Customer.getValue()))
//                customer = (CustomerOrganization)o;
//            else if(o.getName().equals(Organization.Type.Admin.getValue()))
//                admin = (AdminOrganization)o;
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddAdmin = new javax.swing.JButton();
        btnAddDeliveryPerson = new javax.swing.JButton();
        btnAddSupplier = new javax.swing.JButton();
        btnAddSkilledLabour = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnAddAdmin.setText("Add New Admin");
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });

        btnAddDeliveryPerson.setText("Add New Delivery Person");
        btnAddDeliveryPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeliveryPersonActionPerformed(evt);
            }
        });

        btnAddSupplier.setText("Add New Supplier");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        btnAddSkilledLabour.setText("Add New Skilled Labour");
        btnAddSkilledLabour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSkilledLabourActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminRole/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAddSkilledLabour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                        .addComponent(btnAddDeliveryPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(487, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(btnAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(491, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btnAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAddDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAddSkilledLabour, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(btnAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(613, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        
        AddAdminPanel addAdminPanel = new AddAdminPanel(userProcessContainer, admin);
        userProcessContainer.add("addAdminPanel", addAdminPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddAdminActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        AddSupplierPanel addSupplierPanel = new AddSupplierPanel(userProcessContainer, supplier, network);
        userProcessContainer.add("addSupplierPanel", addSupplierPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnAddDeliveryPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeliveryPersonActionPerformed
        AddNewDeliveryPersonJPanel addNewDeliveryPersonJPanel = new AddNewDeliveryPersonJPanel(userProcessContainer, deliveryLabour, network);
        userProcessContainer.add("addNewDeliveryPersonJPanel", addNewDeliveryPersonJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddDeliveryPersonActionPerformed

    private void btnAddSkilledLabourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSkilledLabourActionPerformed
        AddNewSkilledPersonJPanel addNewSkilledPersonJPanel = new AddNewSkilledPersonJPanel(userProcessContainer, skilledLabour, network);
        userProcessContainer.add("addNewSkilledPersonJPanel", addNewSkilledPersonJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddSkilledLabourActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnAddDeliveryPerson;
    private javax.swing.JButton btnAddSkilledLabour;
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBack;
    // End of variables declaration//GEN-END:variables
}