/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Supplier.Supplier;
import Business.Product.Product;
import Business.WorkQueue.NewProductWorkRequest;
import Business.WorkQueue.ProductWorkRequest;
import UserInterface.SystemAdminRole.ManageSkilledPersonJPanel;
import UserInterface.SystemAdminRole.SysAdminWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dhair
 */
public class AddProductPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddProductPanel
     */
    private JPanel userProcessContainer;
    private Supplier supp;
    private AdminOrganization admin;
    
    AddProductPanel(JPanel userProcessContainer, Supplier supp, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supp = supp;
        this.admin = network.getAdminOrganization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priceField = new javax.swing.JTextField();
        prodNameField = new javax.swing.JTextField();
        quanField = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblProductId = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        prodIdField = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();

        lblCategory.setText("Category");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SupplierRole/plus (1).png"))); // NOI18N
        btnAdd.setText("    Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setText("ADD PRODUCTS");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SupplierRole/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProductId.setText("Product Id : ");

        lblProductName.setText("Product Name : ");

        lblQty.setText("Quantity : ");

        lblPrice.setText("Price : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProductId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblProductName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prodIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(priceField)
                            .addComponent(prodNameField)
                            .addComponent(quanField)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnBack)))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductId)
                    .addComponent(prodIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(prodNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQty)
                    .addComponent(quanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(165, 165, 165))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProductCataloguePanel productCataloguePanel = (ProductCataloguePanel) component;
        productCataloguePanel.populate();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            String name = prodNameField.getText();
            String id = prodIdField.getText();
            int quantity = Integer.parseInt(quanField.getText());
            int price = Integer.parseInt(priceField.getText());
            String category = txtCategory.getText();

            if (!((name.equals("") || (id.equals("") || (quantity == 0 || (price == 0) || category.equals("")))))) {
                NewProductWorkRequest pwr  = new NewProductWorkRequest();
                pwr.setPrice(price);
                pwr.setProductCategory(category);
                pwr.setQuantity(quantity);
                pwr.setProductName(name);
                pwr.setSupplier(supp);
                pwr.setProductID(id);
                pwr.setStatus("Pending!");
                admin.getWorkQueue().getNewProductWorkRequest().add(pwr);
                JOptionPane.showMessageDialog(null, "Your product request has been submitted!");
                
                userProcessContainer.remove(this);

                Component[] componentArray = userProcessContainer.getComponents();
                Component component = componentArray[componentArray.length - 1];
                ProductCataloguePanel productCataloguePanel = (ProductCataloguePanel) component;
                productCataloguePanel.populate();
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);

            } else {
                JOptionPane.showMessageDialog(null, "All fields are compulsory", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Error e) {
            JOptionPane.showMessageDialog(null, "Enter details correctly!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQty;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField prodIdField;
    private javax.swing.JTextField prodNameField;
    private javax.swing.JTextField quanField;
    private javax.swing.JTextField txtCategory;
    // End of variables declaration//GEN-END:variables
}
