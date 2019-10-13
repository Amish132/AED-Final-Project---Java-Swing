/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.PartyEnterprise;
import Business.Network.Network;
import Business.Supplier.Supplier;
import Business.Order.OrderItem;
import Business.Order.Order;
import Business.Organization.DeliveryLabourOrganization;
import Business.Organization.SkilledLabourOrganization;
import Business.Organization.SupplierOrganization;
//import Business.Supplier.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.ProductWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.SystemAdminRole.SysAdminWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhair
 */
public class SupplierWorkQueuePanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorkQueuePanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount ua;
    private SupplierOrganization org;
    private SkilledLabourOrganization labOrg;
    private DeliveryLabourOrganization delOrg;
    private Network network;

    SupplierWorkQueuePanel(JPanel userProcessContainer, UserAccount ua, SupplierOrganization org, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.system = system;
        this.ua = ua;
        this.org = org;
        this.network = network;
        this.labOrg = network.getSkilledOrganization();
        this.delOrg = network.getDeliveryOrganization();
        populate();
    }

    void populate() {
        DefaultTableModel dtm = (DefaultTableModel) tblMngCust.getModel();
        dtm.setRowCount(0);

        for (OrderWorkRequest w : org.getWorkQueue().getOrderWorkQueue()) {
            for (OrderItem o : w.getOrder().getOrderItemList()) {

                Object row[] = new Object[7];

                row[0] = w.getOrder();
                row[1] = o;
                row[2] = o.getQuantity();
                row[3] = w.getCustomer();
                row[4] = w.getCustomer().getContact();
                row[5] = w.getCustomer().getAddress();
                row[6] = w.getStatus();
                dtm.addRow(row);

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
        tblMngCust = new javax.swing.JTable();
        btnSkilled = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblMngCust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "CUSTOMER NAME", "PHONE NUMBER", "ADDRESS", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(tblMngCust);

        btnSkilled.setText("Proceed for Skilled Labour");
        btnSkilled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkilledActionPerformed(evt);
            }
        });

        btnDelivery.setText("Proceed for Delivery");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SupplierRole/back.png"))); // NOI18N
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
                        .addGap(311, 311, 311)
                        .addComponent(btnSkilled)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSkilled)
                    .addComponent(btnDelivery))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        int selectedRow = tblMngCust.getSelectedRow();

        if (selectedRow >= 0) {
            Order order = (Order) tblMngCust.getValueAt(selectedRow, 0);
            Customer customer = (Customer) tblMngCust.getValueAt(selectedRow, 3);
            OrderItem oItem= (OrderItem) tblMngCust.getValueAt(selectedRow, 1);

            for (Supplier supplier : org.getListOfSupplier()) {
                if (supplier.getUa().equals(ua)) {
                    for (OrderItem orderItem : order.getOrderItemList()) {
                        int qty = supplier.getListOfProducts().get(orderItem.getProduct());
                        int qtyMod = qty - orderItem.getQuantity();
                        supplier.getListOfProducts().replace(orderItem.getProduct(), qty, qtyMod);
                    }
                }
                break;
            }


            for (OrderWorkRequest w : org.getWorkQueue().getOrderWorkQueue()) {
                for (OrderItem io : w.getOrder().getOrderItemList()) {
                    if(io.equals(oItem)){
                if(!w.getMessage().equals("Complete")){
                                OrderWorkRequest owr = new OrderWorkRequest();
            owr.setCustomer(customer);
            owr.setOrder(order);
            delOrg.getWorkQueue().getOrderWorkQueue().add(owr);

                    w.setStatus("Sent to delivery queue");
                    populate();
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Request already completed!");
                }
                }
            }
            }
            
            populate();
            //JOptionPane.showMessageDialog(null, "Customer Served!");

            //to implement view product details
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Request!");
        }
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnSkilledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkilledActionPerformed
        int selectedRow = tblMngCust.getSelectedRow();

        if (selectedRow >= 0) {
            Order order = (Order) tblMngCust.getValueAt(selectedRow, 0);
            Customer customer = (Customer) tblMngCust.getValueAt(selectedRow, 3);
            OrderItem oItem= (OrderItem) tblMngCust.getValueAt(selectedRow, 1);
            
            for (Supplier supplier : org.getListOfSupplier()) {
                if (supplier.getUa().equals(ua)) {
                    for (OrderItem orderItem : order.getOrderItemList()) {
                        int qty = supplier.getListOfProducts().get(orderItem.getProduct());
                        int qtyMod = qty - orderItem.getQuantity();
                        supplier.getListOfProducts().replace(orderItem.getProduct(), qty, qtyMod);
                    }
                }
                break;
            }

            OrderWorkRequest owr = new OrderWorkRequest();
            owr.setCustomer(customer);
            owr.setOrder(order);
            labOrg.getWorkQueue().getJobWorkQueue().add(owr);

            //ArrayList<OrderItem> temp= new ArrayList<>();
            
            for (OrderWorkRequest w : org.getWorkQueue().getOrderWorkQueue()) {
                for (OrderItem io : w.getOrder().getOrderItemList()) {
                       if(io.equals(oItem)){
                if(!w.getMessage().equals("Complete")){
                    w.setStatus("Sent to delivery queue");
                    populate();
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Request already completed!");
                }
                }
                }
            }
//            
            

            populate();
            
//            for (OrderWorkRequest w : org.getWorkQueue().getOrderWorkQueue()) {
//                for (OrderItem io : w.getOrder().getOrderItemList()) {
//                    if(order.equals(w.getOrder()))
//                    temp.add(io);
//                }
//            }
////                if(w.getOrder().getOrderItemList().isEmpty()){
////                    order =null;
////                    w.setOrder(order);
////                }
//            
//            for (OrderWorkRequest w : org.getWorkQueue().getOrderWorkQueue()) {
//                if(w.getOrder().equals(order))
//                w.getOrder().getOrderItemList().removeAll(temp);
//                break;
//            }
//            populate();
            
            JOptionPane.showMessageDialog(null, "Customer Served!");

            //to implement view product details
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Request!");
        }
    }//GEN-LAST:event_btnSkilledActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnSkilled;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMngCust;
    // End of variables declaration//GEN-END:variables
}