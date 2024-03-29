/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell-Smart
 */
public class NetworkRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkRequestPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;

    public NetworkRequestPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populate();
        populateTemp();
    }

    void populateTemp() {
        DefaultTableModel dtm = (DefaultTableModel) tblNetworkSuggestions.getModel();
        dtm.setRowCount(0);

        for (String t : system.getTempCities()) {
            Object row[] = new Object[1];
            row[0] = t;

            dtm.addRow(row);
        }
    }

    void populate() {
        DefaultTableModel dtm = (DefaultTableModel) tblNetworks.getModel();
        dtm.setRowCount(0);

        for (Network n : system.getNetworkList()) {
            Object row[] = new Object[1];
            row[0] = n;

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
        tblNetworkSuggestions = new javax.swing.JTable();
        txtNetwork = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAddToNetwork = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNetworks = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRemoveSuggestion = new javax.swing.JButton();
        btnRemoveNetwork = new javax.swing.JButton();

        tblNetworkSuggestions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNetworkSuggestions);

        jLabel1.setText("City Name:");

        btnAddToNetwork.setText("Add to Network");
        btnAddToNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToNetworkActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminRole/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblNetworks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNetworks);

        jLabel2.setText("List of Cities in our network:");

        jLabel3.setText("Requested List of Cities:");

        btnRemoveSuggestion.setText("Remove Suggestion");
        btnRemoveSuggestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSuggestionActionPerformed(evt);
            }
        });

        btnRemoveNetwork.setText("Remove Network");
        btnRemoveNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNetwork)
                            .addComponent(btnAddToNetwork))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveSuggestion))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveNetwork)))
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveSuggestion))
                .addGap(25, 25, 25)
                .addComponent(btnAddToNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveNetwork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnBack)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveSuggestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSuggestionActionPerformed
        int selectedRow = tblNetworkSuggestions.getSelectedRow();

        if (selectedRow >= 0) {
            String suggestion = String.valueOf(tblNetworkSuggestions.getValueAt(selectedRow, 0));

            system.removeFromTempNetwork(suggestion);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a City First!");
        }
    }//GEN-LAST:event_btnRemoveSuggestionActionPerformed

    private void btnAddToNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToNetworkActionPerformed
        try {
            String networkName;
            int counter = 0;

            if (txtNetwork.getText().equals("")) {
                throw new Error("Enter Network First!");
            } else {
                networkName = txtNetwork.getText();
            }

            for (Network n : system.getNetworkList()) {
                if (n.toString().equalsIgnoreCase(networkName)) {
                    counter++;
                }
            }

            if (counter == 0) {
                system.createAndAddNetwork(networkName);
            } else {
                JOptionPane.showMessageDialog(null, "Network Already Exists!!");
            }

            populate();

//            for (String s : system.getTempCities()) {
//                for (Network n : system.getNetworkList()) {
//                    if (s.equalsIgnoreCase(n.getCityName())) {
//                        system.removeFromTempNetwork(s);
//                        break;
//                    }
//                }
//            }
            //populateTemp();
        } catch (Error e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter Details Correctly!!");
        }

    }//GEN-LAST:event_btnAddToNetworkActionPerformed

    private void btnRemoveNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNetworkActionPerformed
        int selectedRow = tblNetworks.getSelectedRow();

        if (selectedRow >= 0) {
            Network name = (Network) tblNetworks.getValueAt(selectedRow, 0);

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the network!?", "Delete Network?", dialogButton);
            if (dialogResult == 0) {
                system.removeNetwork(name);
                populate();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Network First!!");
        }
    }//GEN-LAST:event_btnRemoveNetworkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToNetwork;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveNetwork;
    private javax.swing.JButton btnRemoveSuggestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNetworkSuggestions;
    private javax.swing.JTable tblNetworks;
    private javax.swing.JTextField txtNetwork;
    // End of variables declaration//GEN-END:variables
}
