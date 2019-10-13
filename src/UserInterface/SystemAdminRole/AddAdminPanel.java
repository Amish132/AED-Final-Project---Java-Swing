/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Labour.DeliveryPerson;
import Business.Admin.Admin;

import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.DeliveryLabourOrganization;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.DeliveryRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell-Smart
 */
public class AddAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddAdminPanel
     */
    JPanel userProcessContainer;
    AdminOrganization adminOrganization;
    
    
    public AddAdminPanel(JPanel userProcessContainer, AdminOrganization admin) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.adminOrganization = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordField = new javax.swing.JPasswordField();
        uNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Name:");

        jLabel2.setText("User Name:");

        jLabel3.setText("Password:");

        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/newAccount/people.png"))); // NOI18N
        createButton.setText("   Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnBack)
                .addGap(549, 549, 549)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(uNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(passwordField))
                    .addContainerGap(528, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(599, 599, 599)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(221, 221, 221)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(445, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

         
        String userName = nameField.getText();
        String password = passwordField.getText();
        String name = nameField.getText();
        
        if (!((userName.equals("") || (password.equals("") || (name.equals("")))))) {
            if (EcoSystem.checkIfUsernameIsUnique(userName)) {
                Admin admin = adminOrganization.getAD().addAdmin();
                admin.setName(name);
                
                UserAccount ua = adminOrganization.getUserAccountDirectory().createUserAccount(userName, password, new AdminRole());

                admin.setUa(ua);
                
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "The fields marked in '*' are compulsory and can not be left blank", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField uNameField;
    // End of variables declaration//GEN-END:variables
}
