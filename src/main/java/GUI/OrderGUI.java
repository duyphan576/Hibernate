/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.OrderBLL;
import BLL.OrderDetailBLL;
import Entity.Order;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Clock
 */
public class OrderGUI extends javax.swing.JFrame {

    public static int rowID;

    public static String key;
    private OrderBLL oBll;
    private OrderDetailBLL ordBll;
    private int userID;

    /**
     * Creates new form OrderGUI
     */
    public OrderGUI(int userID) {
        initComponents();
        this.userID = userID;
        oBll = new OrderBLL();
        ordBll = new OrderDetailBLL();
        listOrder();

        jTableOrder.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    // your valueChanged overridden method
                    row = jTableOrder.getSelectedRow();
                    TableModel model = jTableOrder.getModel();
                    rowID = Integer.parseInt(model.getValueAt(row, 0).toString());
                    new OrderDetailGUI(rowID).setVisible(true);
                }
            }
        });
    }

    public void listOrder() {
        List list = oBll.loadOrder();
        Object[][] datamodel;
        datamodel = oBll.convertList(list);
        String[] title = {"OrderID", "UserID", "CustomerID", "TotalQuantity", "TotalPrice", "Date", "Status"};
        DefaultTableModel model = new DefaultTableModel(datamodel, title);
        jTableOrder.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButtonAddO = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jButtonEditO = new javax.swing.JButton();
        jButtonDeleteO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelSearch = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableOrder = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddO.setText("Add");
        jButtonAddO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh(evt);
            }
        });

        jButtonEditO.setText("Edit");
        jButtonEditO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit(evt);
            }
        });

        jButtonDeleteO.setText("Delete");
        jButtonDeleteO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Order Management");

        jLabelSearch.setText("Search by OrderID");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch(evt);
            }
        });

        jTableOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableOrder);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRefresh)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditO, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDeleteO))
                        .addGap(24, 24, 24))))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAddO, jButtonDeleteO, jButtonEditO});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSearch)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch)
                        .addComponent(jButtonRefresh)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonAddO)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditO)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteO)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelete(java.awt.event.ActionEvent evt) {
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
    }

    private void btnEdit(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (rowID > 0) {
            editOrderGUI ui = new editOrderGUI(rowID);
            ui.setVisible(true);
        }
    }

    private void btnRefresh(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.listOrder();
    }// GEN-LAST:event_btnRefresh

    private void btnAdd(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        addOrderGUI ui = new addOrderGUI(userID);
        ui.setVisible(true);
    }

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int row = jTableOrder.getSelectedRow();
        TableModel model = jTableOrder.getModel();
        rowID = Integer.parseInt(model.getValueAt(row, 0).toString());

    }

    private void btnSearch(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        key = jTextFieldSearch.getText();
        if (key.isEmpty() == false) {
            Order ord = oBll.getOrder(Integer.parseInt(key));
            List list = new ArrayList();
            list.add(ord);
            Object[][] datamodel;
            datamodel = oBll.convertList(list);
            String[] title = {"OrderID", "UserID", "CustomerID", "TotalQuantity", "TotalPrice", "Date", "Status"};
            DefaultTableModel model = new DefaultTableModel(datamodel, title);
            jTableOrder.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "Id is empty", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddO;
    private javax.swing.JButton jButtonDeleteO;
    private javax.swing.JButton jButtonEditO;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableOrder;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
