/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.CustomerBLL;
import Entity.Customer;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI VN
 */
public class CustomerGUI extends javax.swing.JFrame {

    private DefaultTableModel model;
    private CustomerBLL cusbll;
    private int id;

    public CustomerGUI() {
        initComponents();
        cusbll = new CustomerBLL();
        showTable();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                new StatisticGUI().setVisible(true);
            }
        });
    }

    public void showTable() {
        List listCate = cusbll.loadCustomer();
        Object[][] datamodel;
        datamodel = cusbll.convertCustomer(listCate);
        String[] title = { "CustomerId", "Account", "FullName", "Address" };
        DefaultTableModel model = new DefaultTableModel(datamodel, title);
        Customer_JTA.setModel(model);
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

        BG_Detail = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_JTA = new javax.swing.JTable();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        Title_JLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Customer_JTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CustomerID", "FullName", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Customer_JTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customer_JTA);
        if (Customer_JTA.getColumnModel().getColumnCount() > 0) {
            Customer_JTA.getColumnModel().getColumn(0).setResizable(false);
            Customer_JTA.getColumnModel().getColumn(1).setResizable(false);
            Customer_JTA.getColumnModel().getColumn(2).setResizable(false);
        }

        searchText.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd(evt);
            }
        });

        delButton.setText("Delete");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh(evt);
            }
        });

        javax.swing.GroupLayout BG_DetailLayout = new javax.swing.GroupLayout(BG_Detail);
        BG_Detail.setLayout(BG_DetailLayout);
        BG_DetailLayout.setHorizontalGroup(
            BG_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_DetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BG_DetailLayout.createSequentialGroup()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BG_DetailLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(BG_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        BG_DetailLayout.setVerticalGroup(
            BG_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_DetailLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(editButton)
                .addGap(48, 48, 48)
                .addComponent(addButton)
                .addGap(50, 50, 50)
                .addComponent(delButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG_DetailLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(BG_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchText)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Title_JLabel.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        Title_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_JLabel.setText("Customer Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Title_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BG_Detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title_JLabel)
                .addGap(1, 1, 1)
                .addComponent(BG_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAdd
        new addCustomerGUI().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnAdd

    private void btnEdit(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEdit
        if (this.getId() == -1) {
            JOptionPane.showMessageDialog(this, "Vui long chon Customer muon sua thong tin!");
        } else {
            new editCustomerGUI(this.getId()).setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_btnEdit

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblMouseClicked
        int i = Customer_JTA.getSelectedRow();
        this.setId(Integer.parseInt(Customer_JTA.getValueAt(i, 0).toString()));
    }// GEN-LAST:event_tblMouseClicked

    private void btnDelete(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDelete
        int result = JOptionPane.showConfirmDialog(this,
                "Ban co chac muon xoa Customer nay?",
                "Xac nhan",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            int err = 0;
            try {
                cusbll.delCustomer(id);
                loadAllCustomer();
            } catch (Exception e) {
                err = 1;
            }
            if (err == 0) {
                JOptionPane.showMessageDialog(this, "Xoa Customer thanh cong!");
            }
            if (err == 1) {
                JOptionPane.showMessageDialog(this, "Xoa Customer khong thanh cong!");
            }
        }
    }// GEN-LAST:event_btnDelete

    private void btnRefresh(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRefresh
        loadAllCustomer();
        this.searchText.setText("");
        this.setId(-1);
    }// GEN-LAST:event_btnRefresh

    private void btnSearch(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSearch
        Customer cus = cusbll.getCustomer(this.getId());
        DefaultTableModel models = (DefaultTableModel) Customer_JTA.getModel();
        models.setRowCount(0);
        models.addRow(new Object[] {
                cus.getCustomerID(), cus.getFullName(), cus.getAddress()
        });
    }// GEN-LAST:event_btnSearch

    private void loadAllCustomer() {
        List cusList = cusbll.loadCustomer();
        Object[][] data = cusbll.convertCustomer(cusList);
        String[] title = { "CustomerID", "Account","FullName", "Address" };
        DefaultTableModel model = new DefaultTableModel(data, title);
        Customer_JTA.setModel(model);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_Detail;
    private javax.swing.JTable Customer_JTA;
    private javax.swing.JLabel Title_JLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}
