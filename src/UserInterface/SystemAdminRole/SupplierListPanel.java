/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PartyEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SkilledLabourOrganization;
import Business.Organization.SupplierOrganization;
import Business.Product.Product;
import Business.Supplier.Supplier;
import UserInterface.SupplierRole.ViewProductPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhair
 */
public class SupplierListPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierListPanel
     */
    private JPanel userProcessContainer;
    private SupplierOrganization organization;
    private Network network;

    SupplierListPanel(JPanel userProcessContainer, SupplierOrganization so, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = so;
        this.network = network;
        populate();
    }

    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) tblSupplierName.getModel();
        dtm.setRowCount(0);

        for (Supplier s : organization.getListOfSupplier()) {

            Object row[] = new Object[1];
            row[0] = s;

            dtm.addRow(row);

        }
    }

    public void populate(Supplier supplier) {
        DefaultTableModel dtm = (DefaultTableModel) tblSupplierList.getModel();
        dtm.setRowCount(0);

        for (Product p : supplier.getListOfProducts().keySet()) {

            Object row[] = new Object[5];
            row[0] = p.getCate();
            row[1] = p;
            row[2] = supplier.getListOfProducts().get(p);
            row[3] = p.getPrice();
            row[4] = supplier;
            dtm.addRow(row);

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
        tblSupplierName = new javax.swing.JTable();
        btnProducts = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplierList = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblSupList = new javax.swing.JLabel();
        btnProductDetails = new javax.swing.JButton();
        btnAddSupplier = new javax.swing.JButton();

        tblSupplierName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         SUPPLIER NAME"
            }
        ));
        jScrollPane1.setViewportView(tblSupplierName);

        btnProducts.setText("Show Products");
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });

        tblSupplierList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATEGORY", "PRODUCT NAME", "QUANTITY", "PRICE", "SUPPLIER"
            }
        ));
        jScrollPane2.setViewportView(tblSupplierList);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminRole/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSupList.setText("SUPPLIER LIST");

        btnProductDetails.setText("Show Product Details");
        btnProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductDetailsActionPerformed(evt);
            }
        });

        btnAddSupplier.setText("Add New Supplier");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
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
                        .addComponent(lblSupList)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(btnProducts))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddSupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProductDetails, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(198, 198, 198))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSupList)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProducts)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnProductDetails)
                .addGap(42, 42, 42)
                .addComponent(btnAddSupplier)
                .addGap(120, 120, 120)
                .addComponent(btnBack)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminWorkAreaJPanel sysAdminwjp = (SysAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        int selectedRow = tblSupplierName.getSelectedRow();

        if (selectedRow >= 0) {
            Supplier supplier = (Supplier) tblSupplierName.getValueAt(selectedRow, 0);

            populate(supplier);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Supplier!");
        }
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductDetailsActionPerformed
        int selectedRow = tblSupplierList.getSelectedRow();

        if (selectedRow >= 0) {
            Product product = (Product) tblSupplierList.getValueAt(selectedRow, 1);

            ViewProductPanel viewProductPanel = new ViewProductPanel(userProcessContainer, product);
            userProcessContainer.add("viewProductPanel", viewProductPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Product!");
        }
    }//GEN-LAST:event_btnProductDetailsActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        AddSupplierPanel addSupplierPanel = new AddSupplierPanel(userProcessContainer, organization,network);
        userProcessContainer.add("ClinicManageEmployeeJPanel", addSupplierPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProductDetails;
    private javax.swing.JButton btnProducts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSupList;
    private javax.swing.JTable tblSupplierList;
    private javax.swing.JTable tblSupplierName;
    // End of variables declaration//GEN-END:variables
}
