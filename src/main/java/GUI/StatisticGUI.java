package GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import BLL.StatisticBLL;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author duyph
 */
public class StatisticGUI extends javax.swing.JFrame {

    private int userID;

    /**
     * Creates new form StatisticGUI
     */
    private StatisticBLL sta = new StatisticBLL();

    public StatisticGUI() {
        initComponents();
    }

    public StatisticGUI(int id) {
        initComponents();
        this.userID = id;
        if (id == 1) {
        } else if (id == 2) {
            setStaff();
        } else if (id == 3) {
            setSale();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSale = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnRole = new javax.swing.JButton();
        btnStrap = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnBrand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Statistic");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        btnSale.setText("Total Sale");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSale(evt);
            }
        });

        btnTop.setText("Top Product");
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home Page");

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnProduct.setText("Product");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnRole.setText("Role");
        btnRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoleActionPerformed(evt);
            }
        });

        btnStrap.setText("Strap");
        btnStrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStrapActionPerformed(evt);
            }
        });

        btnUser.setText("User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnBrand.setText("Brand");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnSale)
                .addGap(36, 36, 36)
                .addComponent(btnTop)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStrap, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnSale)
                    .addComponent(btnTop))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProduct)
                                .addGap(9, 9, 9)
                                .addComponent(btnBrand))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCustomer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRole)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStrap)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSale(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSale
        try {
            // TODO add your handling code here:
            listTotalSale();
        } catch (SQLException ex) {
            Logger.getLogger(StatisticGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSale

    private void btnTop(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop
        try {
            // TODO add your handling code here:
            listTopProduct();
        } catch (SQLException ex) {
            Logger.getLogger(StatisticGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTop

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        new ProductGUI().setVisible(true);
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        // TODO add your handling code here:
        new BrandGUI().setVisible(true);
    }//GEN-LAST:event_btnBrandActionPerformed

    private void btnStrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStrapActionPerformed
        // TODO add your handling code here:
        new StrapGUI().setVisible(true);
    }//GEN-LAST:event_btnStrapActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        new OrderGUI(userID).setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        new UserGUI().setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        new CustomerGUI().setVisible(true);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoleActionPerformed
        // TODO add your handling code here:
        new RoleGUI().setVisible(true);
    }//GEN-LAST:event_btnRoleActionPerformed

    private void listTotalSale() throws SQLException {
        List<Object[]> list = sta.totalSale();
        DefaultTableModel model = convertTotalSale(list);
        jTable1.setModel(model);
    }

    private DefaultTableModel convertTotalSale(List<Object[]> list) {
        String[] colummNames = {"Year", "Month", "Total"};
        Object[][] data = new Object[list.size()][3];

        String a = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < Arrays.toString(list.get(i)).length() - 1; j++) {
                a += Arrays.toString(list.get(i)).charAt(j);
            }
            a += ", ";
        }
        String[] part = a.split(", ");
        int c = 0;
        int count = 0;
        while (count != list.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    for (int j = 0; c < 3; j++) {
                        System.out.println(c);
                        System.out.println(part[c]);
                        data[i][j] = part[c];
                        c++;
                    }
                    count++;
                } else {
                    for (int j = 0; c < 3 * (i + 1); j++) {
                        System.out.println(c);
                        System.out.println(part[c]);
                        data[i][j] = part[c];
                        c++;
                    }
                    count++;
                }
            }
        }
        DefaultTableModel model = new DefaultTableModel(data, colummNames);
        return model;
    }

    private void listTopProduct() throws SQLException {
        List<Object[]> list = sta.topProduct();
        DefaultTableModel model = convertTopProduct(list);
        jTable1.setModel(model);
    }

    private DefaultTableModel convertTopProduct(List<Object[]> list) {
        String[] colummNames = {"Product Name", "Quantity"};
        Object[][] data = new Object[list.size()][2];

        String a = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < Arrays.toString(list.get(i)).length() - 1; j++) {
                a += Arrays.toString(list.get(i)).charAt(j);
            }
            a += ", ";
        }
        String[] part = a.split(", ");
        int c = 0;
        int count = 0;
        while (count != list.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    for (int j = 0; c < 2; j++) {
                        System.out.println(c);
                        System.out.println(part[c]);
                        data[i][j] = part[c];
                        c++;
                    }
                    count++;
                } else {
                    for (int j = 0; c < 2 * (i + 1); j++) {
                        data[i][j] = part[c];
                        c++;
                    }
                    count++;
                }
            }
        }
        DefaultTableModel model = new DefaultTableModel(data, colummNames);
        return model;
    }

    /**
     * @param args the command line arguments
     */
    private void setStaff() {
        btnUser.setVisible(false);
        btnProduct.setVisible(false);
        btnBrand.setVisible(false);
        btnStrap.setVisible(false);
    }

    private void setSale() {
        btnRole.setVisible(false);
        btnProduct.setVisible(false);
        btnBrand.setVisible(false);
        btnStrap.setVisible(false);
        btnUser.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnRole;
    private javax.swing.JButton btnSale;
    private javax.swing.JButton btnStrap;
    private javax.swing.JButton btnTop;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
