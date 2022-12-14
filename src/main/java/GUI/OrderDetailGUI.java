/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.OrderBLL;
import BLL.OrderDetailBLL;
import BLL.ProductBLL;
import Entity.Order;
import Entity.OrderDetail;
import Entity.Product;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author duyph
 */
public class OrderDetailGUI extends javax.swing.JFrame {

    /**
     * Creates new form OrderDetailGUI
     */
    private OrderDetailBLL ordBll = new OrderDetailBLL();
    private ProductBLL proBll = new ProductBLL();

    public static int rowIDDetail;
    private int id;

    public OrderDetailGUI() {
        initComponents();
    }

    public OrderDetailGUI(int rowID) {
        initComponents();
        this.id = rowID;
        listOrderDetailByOrderID();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    private void listOrderDetailByOrderID() {
        List list = ordBll.loadOrderDetailByOrderID(id);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrderDetail = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        orderDetail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableOrderDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOrderDetail);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete(evt);
            }
        });

        orderDetail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        orderDetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderDetail.setText("Order Detail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnEdit)
                            .addComponent(jButton1))
                        .addGap(24, 24, 24))
                    .addComponent(orderDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(orderDetail)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd
        // TODO add your handling code here:
        if (id > 0) {
            addOrderDetailGUI ui = new addOrderDetailGUI(id);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Choose Order first", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdd

    private void btnEdit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit
        // TODO add your handling code here:
        if (rowIDDetail > 0) {
            editOrderDetailGUI ui = new editOrderDetailGUI(rowIDDetail);
            ui.setVisible(true);
        }
    }//GEN-LAST:event_btnEdit

    private void btnDelete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete
        // TODO add your handling code here:
        OrderDetail ode = ordBll.getOrderDetail(rowIDDetail);
        Product p = proBll.getProduct(ode.getProductID());

        int result = JOptionPane.showConfirmDialog(null,
                "Confirm delete OrderDetail with Id: " + ode.getOrderDetailID() + " has OrderID: " + ode.getOrderID(),
                "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            ordBll.deleteOrderDetail(ode);
            OrderBLL oBll = new OrderBLL();
            Order ord = oBll.getOrder(ode.getOrderID());

            p.setQuantity(p.getQuantity() + ode.getQuantity());
            proBll.updateProduct(p.getProductID(), p.getStrap(), p.getBrand(), p.getProductName(), p.getPrice(), p.getQuantity(), p.getProductDetail());

            int toquan = ord.getTotalQuantity();
            Float topri = ord.getTotalPrice();
            toquan = toquan - ode.getQuantity();
            topri = topri - ode.getPrice();

            ord.setTotalQuantity(toquan);
            ord.setTotalPrice(topri);
            oBll.updateOrder(ord);

            JOptionPane.showMessageDialog(this, "Complete to delete OrderDetail", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDelete

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        int row = jTableOrderDetail.getSelectedRow();
        TableModel model = jTableOrderDetail.getModel();
        rowIDDetail = Integer.parseInt(model.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrderDetail;
    private javax.swing.JLabel orderDetail;
    // End of variables declaration//GEN-END:variables
}
