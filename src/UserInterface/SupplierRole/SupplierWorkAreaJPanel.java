/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PartyEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nitin
 */



public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorkAreaJPanel
     */
private    JPanel userProcessContainer;
private EcoSystem system;
private SupplierOrganization org;
private Network network;
private PartyEnterprise enterprise;
private UserAccount ua;

    public SupplierWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua,Organization organization,Enterprise enterprise,Network network, EcoSystem system) 
    {
          initComponents();
            this.userProcessContainer = userProcessContainer;
         this.system = system;
     this.org = (SupplierOrganization)organization;
     this.enterprise = (PartyEnterprise)enterprise;
     this.network = network;
     this.ua = ua;
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productCatalogueButton = new javax.swing.JButton();
        companyProfitButton = new javax.swing.JButton();
        workQueueButton = new javax.swing.JButton();

        productCatalogueButton.setBackground(new java.awt.Color(255, 255, 255));
        productCatalogueButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        productCatalogueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SupplierRole/list (1).png"))); // NOI18N
        productCatalogueButton.setText("    Product Catalogue");
        productCatalogueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCatalogueButtonActionPerformed(evt);
            }
        });

        companyProfitButton.setBackground(new java.awt.Color(255, 255, 255));
        companyProfitButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        companyProfitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminRole/if_hand-coins_532625.png"))); // NOI18N
        companyProfitButton.setText("  Check Company Profit");
        companyProfitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyProfitButtonActionPerformed(evt);
            }
        });

        workQueueButton.setBackground(new java.awt.Color(255, 255, 255));
        workQueueButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        workQueueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminRole/if_briefcase_1296365.png"))); // NOI18N
        workQueueButton.setText("    Check Work Queue");
        workQueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workQueueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(workQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyProfitButton)
                    .addComponent(productCatalogueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(workQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(productCatalogueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(companyProfitButton)
                .addContainerGap(277, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChkWrkQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkWrkQueueActionPerformed
       
    }//GEN-LAST:event_btnChkWrkQueueActionPerformed

    private void productCatalogueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCatalogueButtonActionPerformed
        // TODO add your handling code here:
         ProductCataloguePanel productCataloguePanel = new ProductCataloguePanel(userProcessContainer, ua, org, network);
        userProcessContainer.add("productCataloguePanel", productCataloguePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_productCatalogueButtonActionPerformed

    private void companyProfitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyProfitButtonActionPerformed
        // TODO add your handling code here:
         SupplierEarningsPanel manageEmployeeJPanel = new SupplierEarningsPanel(userProcessContainer, system);
        userProcessContainer.add("ClinicManageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_companyProfitButtonActionPerformed

    private void workQueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workQueueButtonActionPerformed
        // TODO add your handling code here:
         SupplierWorkQueuePanel manageEmployeeJPanel = new SupplierWorkQueuePanel(userProcessContainer, ua,org, network);
        userProcessContainer.add("ClinicManageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_workQueueButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton companyProfitButton;
    private javax.swing.JButton productCatalogueButton;
    private javax.swing.JButton workQueueButton;
    // End of variables declaration//GEN-END:variables
}