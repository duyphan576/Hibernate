/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.OrderBLL;
import BLL.OrderDetailBLL;
import Entity.Order;
import Entity.OrderDetail;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Clock
 */
public class OrderGUI extends javax.swing.JFrame {

    public static int rowID;
    public static int rowIDDetail;
    public static String key;
    private OrderBLL oBll;
    private OrderDetailBLL ordBll;

    /**
     * Creates new form OrderGUI
     */
    public OrderGUI() {

        initComponents();
        oBll = new OrderBLL();
        ordBll = new OrderDetailBLL();
        listOrder();
        listOrderDetail();

    }

    public void listOrder() {
        List list = oBll.loadOrder();
        Object[][] datamodel;
        datamodel = oBll.convertList(list);
        String[] title = {"OrderID", "UserID", "CustomerID", "TotalQuantity", "TotalPrice", "Date", "Status", "Count"};
        DefaultTableModel model = new DefaultTableModel(datamodel, title);
        jTableOrder.setModel(model);
    }

    public void listOrderDetail() {
        List list = ordBll.loadOrderDetail();
        Object[][] datamodel;
        datamodel = ordBll.convertList(list);
        String[] title = {"OrderDetailID", "OrderID", "ProductID", "Quantity", "Price"};
        DefaultTableModel model = new DefaultTableModel(datamodel, title);
        jTableOrderDetail.setModel(model);
    }

    public void listOrderDetailByOrderID() {
        List list = ordBll.loadOrderDetailByOrderID(rowID);
        Object[][] datamodel;
        datamodel = ordBll.convertList(list);
        String[] title = {"OrderDetailID", "OrderID", "ProductID", "Quantity", "Price"};
        DefaultTableModel model = new DefaultTableModel(datamodel, title);
        jTableOrderDetail.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableOrder = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOrderDetail = new javax.swing.JTable();
        jButtonAddO = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jButtonEditO = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelSearch = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonAddDetail = new javax.swing.JButton();
        jButtonEditDetail = new javax.swing.JButton();
        jButtonDeleteDetail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableOrder);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableOrderDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrderDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableOrderDetail);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAddO.setText("Add");
        jButtonAddO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddOActionPerformed(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonEditO.setText("Edit");
        jButtonEditO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditOActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Order");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Detail");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Data Order");

        jLabelSearch.setText("Search by OrderID");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonAddDetail.setText("Add Detail");
        jButtonAddDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDetailActionPerformed(evt);
            }
        });

        jButtonEditDetail.setText("Edit Detail");
        jButtonEditDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDetailActionPerformed(evt);
            }
        });

        jButtonDeleteDetail.setText("Delete Detail");
        jButtonDeleteDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(447, 447, 447))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonAddO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSearch)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEditO, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefresh)
                .addGap(43, 43, 43)
                .addComponent(jButtonAddDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButtonEditDetail)
                .addGap(63, 63, 63)
                .addComponent(jButtonDeleteDetail)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSearch)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddO)
                    .addComponent(jButtonRefresh)
                    .addComponent(jButtonEditO)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonAddDetail)
                    .addComponent(jButtonEditDetail)
                    .addComponent(jButtonDeleteDetail))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        Order ord = new Order();
        ord = oBll.getOrder(rowID);

        List list = ordBll.loadOrderDetailByOrderID(rowID);
        int countDetail = list.size();

        int result = JOptionPane.showConfirmDialog(null, "Confirm delete Order with Id: " + ord.getOrderID(), "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (countDetail == 0) {
                oBll.deleteOrder(ord);
                JOptionPane.showMessageDialog(this, "Complete to delete Order", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Delete detail first", "Message",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        listOrder();
        listOrderDetail();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditOActionPerformed
        // TODO add your handling code here:
        if (rowID > 0) {
            EditOrderGUI ui = new EditOrderGUI(rowID);
            ui.setVisible(true);
        }
    }//GEN-LAST:event_jButtonEditOActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        this.listOrder();
        this.listOrderDetail();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonAddOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddOActionPerformed
        // TODO add your handling code here:
        AddOrderGUI ui = new AddOrderGUI();
        ui.setVisible(true);
    }//GEN-LAST:event_jButtonAddOActionPerformed

    private void jTableOrderDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrderDetailMouseClicked
        // TODO add your handling code here:
        int row2 = jTableOrderDetail.getSelectedRow();
        TableModel model = jTableOrderDetail.getModel();
        rowIDDetail = Integer.parseInt(model.getValueAt(row2, 0).toString());


    }//GEN-LAST:event_jTableOrderDetailMouseClicked
    //bảng Order
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTableOrder.getSelectedRow();
        TableModel model = jTableOrder.getModel();
        rowID = Integer.parseInt(model.getValueAt(row, 0).toString());

        listOrderDetailByOrderID();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:

        key = jTextFieldSearch.getText();
        if (key.isEmpty() == false) {

            Order ord = oBll.getOrder(Integer.parseInt(key));

            List list = new ArrayList();
            list.add(ord);
            Object[][] datamodel;
            datamodel = oBll.convertList(list);
            String[] title = {"OrderID", "UserID", "CustomerID", "TotalQuantity", "TotalPrice", "Date", "Status", "Count"};
            DefaultTableModel model = new DefaultTableModel(datamodel, title);
            jTableOrder.setModel(model);

        } else {
            JOptionPane.showMessageDialog(this, "Id is empty", "Message", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonAddDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDetailActionPerformed
        // TODO add your handling code here:
        if (rowID > 0) {
            AddOrderDetailGUI ui = new AddOrderDetailGUI(rowID);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Choose Order first", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddDetailActionPerformed

    private void jButtonEditDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDetailActionPerformed
        // TODO add your handling code here:
        if (rowIDDetail > 0) {
            EditOrderDetailGUI ui = new EditOrderDetailGUI(rowIDDetail);
            ui.setVisible(true);
        }
    }//GEN-LAST:event_jButtonEditDetailActionPerformed

    private void jButtonDeleteDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteDetailActionPerformed

        // TODO add your handling code here:
        OrderDetail ode = ordBll.getOrderDetail(rowIDDetail);

        int result = JOptionPane.showConfirmDialog(null, "Confirm delete OrderDetail with Id: " + ode.getOrderDetailID() + " has OrderID: " + ode.getOrderID(), "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            ordBll.deleteOrderDetail(ode);

            Order ord = oBll.getOrder(ode.getOrderID());

            int toquan = ord.getTotalQuantity();
            Float topri = ord.getTotalPrice();
            toquan = toquan - ode.getQuantity();
            topri = topri - ode.getPrice();

            ord.setTotalQuantity(toquan);
            ord.setTotalPrice(topri);
            oBll.updateOrder(ord);

            JOptionPane.showMessageDialog(this, "Complete to delete Order", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        listOrder();
        listOrderDetail();
    }//GEN-LAST:event_jButtonDeleteDetailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddDetail;
    private javax.swing.JButton jButtonAddO;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDeleteDetail;
    private javax.swing.JButton jButtonEditDetail;
    private javax.swing.JButton jButtonEditO;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableOrder;
    private javax.swing.JTable jTableOrderDetail;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
