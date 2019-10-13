/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminRole.AddSupplierPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nitin
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNotification = new javax.swing.JButton();
        btnBecomeSup = new javax.swing.JButton();
        btnGoShopping = new javax.swing.JButton();
        btnPrivShopDtl = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 500));

        btnNotification.setBackground(new java.awt.Color(255, 255, 255));
        btnNotification.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/if_megaphone_1296371.png"))); // NOI18N
        btnNotification.setText("       Notification");
        btnNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificationActionPerformed(evt);
            }
        });

        btnBecomeSup.setBackground(new java.awt.Color(255, 255, 255));
        btnBecomeSup.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBecomeSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/if_Shop_379396.png"))); // NOI18N
        btnBecomeSup.setText("   Become Supplier");
        btnBecomeSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBecomeSupActionPerformed(evt);
            }
        });

        btnGoShopping.setBackground(new java.awt.Color(255, 255, 255));
        btnGoShopping.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGoShopping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/if_cart_1055098.png"))); // NOI18N
        btnGoShopping.setText("    Go Shopping");
        btnGoShopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoShoppingActionPerformed(evt);
            }
        });

        btnPrivShopDtl.setBackground(new java.awt.Color(255, 255, 255));
        btnPrivShopDtl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPrivShopDtl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/clinic-history.png"))); // NOI18N
        btnPrivShopDtl.setText(" Previous Shopping Details");
        btnPrivShopDtl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrivShopDtlActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBecomeSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGoShopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrivShopDtl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnNotification)
                .addGap(18, 18, 18)
                .addComponent(btnBecomeSup)
                .addGap(18, 18, 18)
                .addComponent(btnGoShopping)
                .addGap(18, 18, 18)
                .addComponent(btnPrivShopDtl)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNotificationActionPerformed

    private void btnGoShoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoShoppingActionPerformed
        CustomerShoppingPanel customerShoppingPanel = new CustomerShoppingPanel(userProcessContainer, account, network);
        userProcessContainer.add("addSupplierPanel", customerShoppingPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnGoShoppingActionPerformed

    private void btnPrivShopDtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivShopDtlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrivShopDtlActionPerformed

    private void btnBecomeSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBecomeSupActionPerformed
        CustomerSupplierPanel customerSupplierPanel = new CustomerSupplierPanel(userProcessContainer, account, network);
        userProcessContainer.add("customerSupplierPanel", customerSupplierPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnBecomeSupActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBecomeSup;
    private javax.swing.JButton btnGoShopping;
    private javax.swing.JButton btnNotification;
    private javax.swing.JButton btnPrivShopDtl;
    // End of variables declaration//GEN-END:variables
}
