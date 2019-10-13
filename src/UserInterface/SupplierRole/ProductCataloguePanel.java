/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.Supplier.Supplier;
import Business.Product.Product;
import Business.WorkQueue.ProductWorkRequest;
import UserInterface.SystemAdminRole.SysAdminWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhair
 */
public class ProductCataloguePanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductCataloguePanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount ua;
    private SupplierOrganization org;
    private Network network;

    ProductCataloguePanel(JPanel userProcessContainer, UserAccount ua, SupplierOrganization org, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.org = (SupplierOrganization) org;
        this.ua = ua;
        this.network = network;
        populate();
    }

    void populate() {
        DefaultTableModel dtm = (DefaultTableModel) tblMngProduct.getModel();
        dtm.setRowCount(0);

        for (Supplier supplier : org.getListOfSupplier()) {
            if (ua.equals(supplier.getUa())) {
                for (Product product : supplier.getListOfProducts().keySet()) {
                    Object row[] = new Object[5];
                    row[0] = product.getCate();
                    row[1] = product;
                    row[2] = product.getName();
                    row[3] = supplier.getListOfProducts().get(product);
                    row[4] = product.getPrice();
                    dtm.addRow(row);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMngProduct = new javax.swing.JTable();
        lblMngProdCat = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        btnViewProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        tblMngProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATEGORY", "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(tblMngProduct);

        lblMngProdCat.setText("MANAGE PRODUCT CATALOGUE");

        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnViewProduct.setText("View Product");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SupplierRole/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        removeButton.setText("Remove Product");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMngProdCat)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnBack)))
                        .addContainerGap(890, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblMngProdCat)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnAddProduct)
                .addGap(18, 18, 18)
                .addComponent(btnViewProduct)
                .addGap(18, 18, 18)
                .addComponent(removeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        int selectedRow = tblMngProduct.getSelectedRow();

        if (selectedRow >= 0) {
            Product product = (Product) tblMngProduct.getValueAt(selectedRow, 1);

            ViewProductPanel viewProductPanel = new ViewProductPanel(userProcessContainer, product);
            userProcessContainer.add("ClinicManageEmployeeJPanel", viewProductPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Product!");
        }
    }//GEN-LAST:event_btnViewProductActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow = tblMngProduct.getSelectedRow();

        if (selectedRow >= 0) {
            Product product = (Product) tblMngProduct.getValueAt(selectedRow, 1);

            for (Supplier supplier : org.getListOfSupplier()) {
                if (ua.equals(supplier.getUa())) {
                    supplier.removeProduct(product);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Product!");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        Supplier supp = null;
        for (Supplier supplier : org.getListOfSupplier()) {
            if (ua.equals(supplier.getUa())) {
                supp = supplier;
            }
        }

        AddProductPanel manageEmployeeJPanel = new AddProductPanel(userProcessContainer, supp, network);
        userProcessContainer.add("ClinicManageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMngProdCat;
    private javax.swing.JButton removeButton;
    private javax.swing.JTable tblMngProduct;
    // End of variables declaration//GEN-END:variables
}