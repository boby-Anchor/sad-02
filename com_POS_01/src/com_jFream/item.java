/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_jFream;

import com_class.DBClass;
import com_class.Universal;
import static com_jFream.supplier.supId;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHETHANA
 */
public class item extends javax.swing.JFrame {

    static Universal u = new Universal();
    public static int itemId;
    public static int idsup;

    public item() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jScrollPane_item_name.setVisible(false);
        addTotableSearItem();
        addComboSearSupplierSearchName();
        jcheckbox_item.setVisible(true);
        u.imageMethod("/img/2222.jpg", jLabel1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item_b_new = new javax.swing.JButton();
        login_la_cloce = new javax.swing.JLabel();
        login_la_mini = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        item_b_enter = new javax.swing.JButton();
        jScrollPane_item_name = new javax.swing.JScrollPane();
        jList_item_name = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        item_b_delete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_item = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tx_item_name = new javax.swing.JTextField();
        item_b_update = new javax.swing.JButton();
        jcheckbox_item = new javax.swing.JCheckBox();
        item_b_search = new javax.swing.JButton();
        combo_supplier_name = new javax.swing.JComboBox();
        jScrollPane_discription = new javax.swing.JScrollPane();
        tx_discription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1370, 768));
        getContentPane().setLayout(null);

        item_b_new.setBackground(new java.awt.Color(255, 255, 255));
        item_b_new.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        item_b_new.setForeground(new java.awt.Color(0, 0, 0));
        item_b_new.setText("New");
        item_b_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_b_newMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_b_newMouseExited(evt);
            }
        });
        item_b_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_b_newActionPerformed(evt);
            }
        });
        getContentPane().add(item_b_new);
        item_b_new.setBounds(1100, 390, 180, 45);

        login_la_cloce.setBackground(new java.awt.Color(102, 204, 255));
        login_la_cloce.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login_la_cloce.setForeground(new java.awt.Color(0, 0, 0));
        login_la_cloce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_la_cloce.setText("X");
        login_la_cloce.setOpaque(true);
        login_la_cloce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_la_cloceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_la_cloceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_la_cloceMouseExited(evt);
            }
        });
        getContentPane().add(login_la_cloce);
        login_la_cloce.setBounds(1330, 5, 30, 30);

        login_la_mini.setBackground(new java.awt.Color(102, 204, 255));
        login_la_mini.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login_la_mini.setForeground(new java.awt.Color(0, 0, 0));
        login_la_mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_la_mini.setText("-");
        login_la_mini.setOpaque(true);
        login_la_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_la_miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_la_miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_la_miniMouseExited(evt);
            }
        });
        getContentPane().add(login_la_mini);
        login_la_mini.setBounds(1300, 5, 30, 30);

        jLabel2.setBackground(new java.awt.Color(102, 204, 255));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ITEM");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 40);

        item_b_enter.setBackground(new java.awt.Color(255, 255, 255));
        item_b_enter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        item_b_enter.setForeground(new java.awt.Color(0, 0, 0));
        item_b_enter.setText("Enter");
        item_b_enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_b_enterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_b_enterMouseExited(evt);
            }
        });
        item_b_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_b_enterActionPerformed(evt);
            }
        });
        getContentPane().add(item_b_enter);
        item_b_enter.setBounds(840, 390, 180, 45);

        jList_item_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList_item_nameKeyPressed(evt);
            }
        });
        jScrollPane_item_name.setViewportView(jList_item_name);

        getContentPane().add(jScrollPane_item_name);
        jScrollPane_item_name.setBounds(180, 110, 620, 131);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Discription");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 140, 140, 25);

        item_b_delete.setBackground(new java.awt.Color(255, 255, 255));
        item_b_delete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        item_b_delete.setForeground(new java.awt.Color(0, 0, 0));
        item_b_delete.setText("Delete");
        item_b_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_b_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_b_deleteMouseExited(evt);
            }
        });
        item_b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_b_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(item_b_delete);
        item_b_delete.setBounds(580, 390, 180, 45);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 370, 1360, 10);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(280, 390, 10, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 40, 1360, 10);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Active OR Inactive");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 320, 140, 25);

        jtable_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Name", "Discription", "Supplier Name", "Is Active"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_itemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_item);
        if (jtable_item.getColumnModel().getColumnCount() > 0) {
            jtable_item.getColumnModel().getColumn(0).setMinWidth(50);
            jtable_item.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtable_item.getColumnModel().getColumn(0).setMaxWidth(50);
            jtable_item.getColumnModel().getColumn(1).setMinWidth(200);
            jtable_item.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtable_item.getColumnModel().getColumn(1).setMaxWidth(200);
            jtable_item.getColumnModel().getColumn(2).setMinWidth(500);
            jtable_item.getColumnModel().getColumn(2).setPreferredWidth(500);
            jtable_item.getColumnModel().getColumn(2).setMaxWidth(500);
            jtable_item.getColumnModel().getColumn(3).setMinWidth(250);
            jtable_item.getColumnModel().getColumn(3).setPreferredWidth(250);
            jtable_item.getColumnModel().getColumn(3).setMaxWidth(250);
            jtable_item.getColumnModel().getColumn(4).setMinWidth(100);
            jtable_item.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtable_item.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 470, 1110, 270);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(540, 390, 10, 30);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(800, 390, 10, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Item Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 80, 140, 25);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(1060, 390, 10, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Supplier Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 260, 140, 25);

        tx_item_name.setBackground(new java.awt.Color(255, 255, 255));
        tx_item_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tx_item_name.setForeground(new java.awt.Color(0, 0, 0));
        tx_item_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_item_nameActionPerformed(evt);
            }
        });
        tx_item_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_item_nameKeyPressed(evt);
            }
        });
        getContentPane().add(tx_item_name);
        tx_item_name.setBounds(180, 78, 620, 35);

        item_b_update.setBackground(new java.awt.Color(255, 255, 255));
        item_b_update.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        item_b_update.setForeground(new java.awt.Color(0, 0, 0));
        item_b_update.setText("Update");
        item_b_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_b_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_b_updateMouseExited(evt);
            }
        });
        item_b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_b_updateActionPerformed(evt);
            }
        });
        getContentPane().add(item_b_update);
        item_b_update.setBounds(320, 390, 180, 45);

        jcheckbox_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcheckbox_itemKeyPressed(evt);
            }
        });
        getContentPane().add(jcheckbox_item);
        jcheckbox_item.setBounds(180, 320, 40, 24);

        item_b_search.setBackground(new java.awt.Color(255, 255, 255));
        item_b_search.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        item_b_search.setForeground(new java.awt.Color(0, 0, 0));
        item_b_search.setText("Search");
        item_b_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_b_searchMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_b_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_b_searchMouseEntered(evt);
            }
        });
        item_b_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_b_searchActionPerformed(evt);
            }
        });
        getContentPane().add(item_b_search);
        item_b_search.setBounds(60, 390, 180, 45);

        getContentPane().add(combo_supplier_name);
        combo_supplier_name.setBounds(180, 260, 620, 40);

        tx_discription.setBackground(new java.awt.Color(255, 255, 255));
        tx_discription.setColumns(20);
        tx_discription.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tx_discription.setForeground(new java.awt.Color(0, 0, 0));
        tx_discription.setRows(5);
        jScrollPane_discription.setViewportView(tx_discription);

        getContentPane().add(jScrollPane_discription);
        jScrollPane_discription.setBounds(180, 140, 620, 100);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 40, 1380, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_b_newMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_newMouseEntered
        buttonMouseEnEx(item_b_new, 0);
    }//GEN-LAST:event_item_b_newMouseEntered

    private void item_b_newMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_newMouseExited
        buttonMouseEnEx(item_b_new, 1);
    }//GEN-LAST:event_item_b_newMouseExited

    private void item_b_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_b_newActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "Do you want add new Supplier ?", "Add New One", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            clearemployeeFields();
            addTotableSearItem();
            tx_item_name.grabFocus();
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
        item_b_new.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_item_b_newActionPerformed

    private void login_la_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_login_la_miniMouseClicked

    private void login_la_miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseEntered
        login_la_mini.setBackground(Color.gray);
    }//GEN-LAST:event_login_la_miniMouseEntered

    private void login_la_miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseExited
        login_la_mini.setBackground(new Color(102, 204, 255));
    }//GEN-LAST:event_login_la_miniMouseExited

    private void item_b_enterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_enterMouseEntered
        buttonMouseEnEx(item_b_enter, 0);
    }//GEN-LAST:event_item_b_enterMouseEntered

    private void item_b_enterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_enterMouseExited
        buttonMouseEnEx(item_b_enter, 1);
    }//GEN-LAST:event_item_b_enterMouseExited

    private void item_b_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_b_enterActionPerformed
        if (tx_item_name.getText().trim().isEmpty()) {
            tx_item_name.grabFocus();
        } else if (tx_discription.getText().trim().isEmpty()) {
            tx_discription.grabFocus();
        } else if (!(tx_discription.getText().trim().isEmpty() & tx_item_name.getText().trim().isEmpty())) {
            addToTable();
        }
        item_b_enter.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_item_b_enterActionPerformed

    private void jList_item_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList_item_nameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!jList_item_name.isSelectionEmpty()) {
                tx_item_name.setText(jList_item_name.getSelectedValue().toString());
                jScrollPane_item_name.setVisible(false);
                tx_discription.grabFocus();
            }
        }
    }//GEN-LAST:event_jList_item_nameKeyPressed

    private void item_b_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_deleteMouseEntered
        buttonMouseEnEx(item_b_delete, 0);
    }//GEN-LAST:event_item_b_deleteMouseEntered

    private void item_b_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_deleteMouseExited
        buttonMouseEnEx(item_b_delete, 1);
    }//GEN-LAST:event_item_b_deleteMouseExited

    private void item_b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_b_deleteActionPerformed

        if (!(tx_discription.getText().trim().isEmpty() & tx_item_name.getText().trim().isEmpty())) {
            int x = JOptionPane.showConfirmDialog(this, "Do you sure Delete this supplier ?", "Exit Interface", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == x) {
                jcheckbox_item.setSelected(false);
                updateItem("delete");
                JOptionPane.showConfirmDialog(this, "Supplier Deleted ?", "Delete", JOptionPane.OK_OPTION);
                addTotableSearItem();
                clearemployeeFields();
            } else if (JOptionPane.NO_OPTION == x) {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Fill the details ?", "NOT Complet", JOptionPane.OK_OPTION);
        }
        item_b_delete.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_item_b_deleteActionPerformed

    private void jtable_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_itemMouseClicked
        DefaultTableModel tlModel = (DefaultTableModel) jtable_item.getModel();
        itemId = Integer.parseInt(tlModel.getValueAt(jtable_item.getSelectedRow(), 0).toString());
        String t_name = tlModel.getValueAt(jtable_item.getSelectedRow(), 1).toString();
        String t_tel = tlModel.getValueAt(jtable_item.getSelectedRow(), 2).toString();
        String t_supplier_name = tlModel.getValueAt(jtable_item.getSelectedRow(), 3).toString();
        String t_isactive = tlModel.getValueAt(jtable_item.getSelectedRow(), 4).toString();
        SearSupplierSearchName(t_supplier_name);
        tx_item_name.setText(t_name);
        tx_discription.setText(t_tel);
        combo_supplier_name.setSelectedItem(t_supplier_name);
        if (t_isactive.equals("Active")) {
            jcheckbox_item.setSelected(true);
        } else {
            jcheckbox_item.setSelected(false);
        }
    }//GEN-LAST:event_jtable_itemMouseClicked

    private void tx_item_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_item_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_item_nameActionPerformed

    private void tx_item_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_item_nameKeyPressed
        if (tx_item_name.getText().isEmpty()) {
            addTotableSearItem();
        } else {
            TXValidaton(evt, tx_item_name, 50, "A");

            if (evt.getKeyCode() == 10) {
                if (!tx_item_name.getText().isEmpty()) {
                    tx_discription.grabFocus();
                } else {
                    tx_item_name.grabFocus();
                }
            }

            if (evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP) {
                jList_item_name.grabFocus();
                jList_item_name.setSelectedIndex(0);
                jScrollPane_item_name.setVisible(true);
            } else if (!(tx_item_name.getText().trim().isEmpty())) {
                searchANDListItem("item", "name", tx_item_name.getText(), jList_item_name);
            }
        }
    }//GEN-LAST:event_tx_item_nameKeyPressed

    private void item_b_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_updateMouseEntered
        buttonMouseEnEx(item_b_update, 0);
    }//GEN-LAST:event_item_b_updateMouseEntered

    private void item_b_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_updateMouseExited
        buttonMouseEnEx(item_b_update, 1);
    }//GEN-LAST:event_item_b_updateMouseExited

    private void item_b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_b_updateActionPerformed
        if (tx_item_name.getText().trim().isEmpty()) {
            tx_item_name.grabFocus();
        } else if (tx_discription.getText().trim().isEmpty()) {
            tx_discription.grabFocus();
        } else if (!(tx_discription.getText().trim().isEmpty() & tx_item_name.getText().trim().isEmpty())) {
            updateItem("update");
        }
        item_b_update.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_item_b_updateActionPerformed

    private void login_la_cloceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseClicked
        SystemClose();
    }//GEN-LAST:event_login_la_cloceMouseClicked

    private void login_la_cloceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseEntered
        login_la_cloce.setBackground(Color.red);
    }//GEN-LAST:event_login_la_cloceMouseEntered

    private void login_la_cloceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseExited
        login_la_cloce.setBackground(new Color(102, 204, 255));
    }//GEN-LAST:event_login_la_cloceMouseExited

    private void jcheckbox_itemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcheckbox_itemKeyPressed
        if (evt.getKeyCode() == 10) {
            item_b_enter.doClick();
            buttonMouseEnEx(item_b_enter, 0);
        }
    }//GEN-LAST:event_jcheckbox_itemKeyPressed

    private void item_b_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_item_b_searchMouseClicked

    private void item_b_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_searchMouseEntered
        buttonMouseEnEx(item_b_search, 0);
    }//GEN-LAST:event_item_b_searchMouseEntered

    private void item_b_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_b_searchMouseExited
        buttonMouseEnEx(item_b_search, 1);
    }//GEN-LAST:event_item_b_searchMouseExited

    private void item_b_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_b_searchActionPerformed
        if (!tx_item_name.getText().trim().isEmpty()) {
            addTotableSearItemSearchName(tx_item_name.getText());
        } else {
            tx_item_name.grabFocus();
        }
        item_b_search.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_item_b_searchActionPerformed

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
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_supplier_name;
    private javax.swing.JButton item_b_delete;
    private javax.swing.JButton item_b_enter;
    private javax.swing.JButton item_b_new;
    private javax.swing.JButton item_b_search;
    private javax.swing.JButton item_b_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList_item_name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_discription;
    private javax.swing.JScrollPane jScrollPane_item_name;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JCheckBox jcheckbox_item;
    private javax.swing.JTable jtable_item;
    private javax.swing.JLabel login_la_cloce;
    private javax.swing.JLabel login_la_mini;
    private javax.swing.JTextArea tx_discription;
    private javax.swing.JTextField tx_item_name;
    // End of variables declaration//GEN-END:variables

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> Singltan class 
     * *** >>> Why ------------->>> ek object ekk hdnn
     * *** >>> Parameters ------>>>
     * *** >>> Status ---------->>>
     */
//>>>>>>>>> Get Instance <<<<<<<<<<<  
    private static supplier log = new supplier();

    public static supplier getLoginInstance() {
        return log;
    }
//>>>>>>>>> Get Instance <<<<<<<<<<<         

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> TXValidaton()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> KeyEvent evt//JTextField txName//int lenth//String type
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> TXValidaton open <<<<<<<<<<<   
    private void TXValidaton(KeyEvent evt, JTextField txName, int lenth, String type) {
        int iNumber = evt.getKeyCode();
        if (txName.getText().length() <= lenth) {
            if (type.equals("N")) {

                if ((iNumber >= 96 & iNumber <= 105) | (iNumber >= 48 & iNumber <= 57) | (iNumber == 8) | (iNumber == 17) | (iNumber == 86)) {
                    txName.setEditable(true);
                } else {
                    txName.setEditable(false);
                }

            }
            if (type.equals("A")) {

                if ((iNumber >= 65 & iNumber <= 90) | (iNumber == 8) | (iNumber == 32) | (iNumber == 46) | (iNumber == 17)) {
                    txName.setEditable(true);
                } else {
                    txName.setEditable(false);
                }

            }
            if (type.equals("NA")) {

                if ((iNumber >= 96 & iNumber <= 105) | (iNumber >= 48 & iNumber <= 57) | (iNumber >= 65 & iNumber <= 90) | (iNumber == 8) | (iNumber == 45) | (iNumber == 32) | (iNumber == 44) | (iNumber == 46) | (iNumber == 47)) {
                    txName.setEditable(true);
                } else {
                    txName.setEditable(false);
                }

            }

        } else if ((iNumber == 8)) {
            txName.setEditable(true);
        } else {
            txName.setEditable(false);
        }
    }
    //>>>>>>>>> TXValidaton close <<<<<<<<<<<       
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> clearemployeeFields()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> 
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> clearemployeeFields cloce <<<<<<<<<<<        
    private void clearemployeeFields() {
        tx_item_name.setText(null);
        combo_supplier_name.setSelectedIndex(0);
        tx_discription.setText(null);
        jcheckbox_item.setSelected(false);
        supId = 0;
        idsup = 0;
        tx_item_name.grabFocus();
        addComboSearSupplierSearchName();
    }
    //>>>>>>>>> clearemployeeFields close <<<<<<<<<<<       
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> SystemClose()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> System open <<<<<<<<<<<   
    void SystemClose() {
        int x = JOptionPane.showConfirmDialog(this, "Do you sure close Employee Interface ?", "Exit Interface", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            this.dispose();
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            login_la_cloce.setBackground(new Color(255, 255, 255));
        }
    }
    //>>>>>>>>> System close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> buttonMouseEnEx()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> JButton buttonName, int x
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> buttonMouseEnEx open <<<<<<<<<<<    
    private void buttonMouseEnEx(JButton buttonName, int x) {
        if (x == 0) {
            buttonName.setBackground(new Color(84, 245, 214));
        } else {
            buttonName.setBackground(new Color(225, 225, 225));
        }
    }
    //>>>>>>>>> buttonMouseEnEx close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> addToTable()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> 
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> addToTable open <<<<<<<<<<<        
    private void addToTable() {
        try {
            String name = tx_item_name.getText();
            String description = tx_discription.getText();
            String supplierName = combo_supplier_name.getSelectedItem().toString();
            SearSupplierSearchName(supplierName);
            DBClass.putData("insert into item (idsupplier,name,description,status) values('" + idsup + "' , '" + name + "' , '" + description + "' ,'1')");
    
        ResultSet rs = DBClass.getData("select iditem from item");
           if(rs.last()){
               int iditem = rs.getInt("iditem");
               DBClass.putData("insert into stock (iditem,buying_price,sell_price,qty) values('" + iditem + "' , '0' , '0' ,'0')");
           }
            clearemployeeFields();
            addTotableSearItem();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Bug Error ItemTableInsert !!! \n" + ex, "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
    }
    //>>>>>>>>> addToTable close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> addTotableSearItem()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> 
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> addTotableSearItem open <<<<<<<<<<<        
    private void addTotableSearItem() {
        try {
            ResultSet rs = DBClass.getData("select i.iditem,i.name as itemName,i.description,i.status,s.* from item i inner join supplier s on s.idsupplier = i.idsupplier  order by iditem ");
            DefaultTableModel dm = (DefaultTableModel) jtable_item.getModel();
            dm.setRowCount(0);
            if (DBClass.r.isBeforeFirst() == true) {
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("iditem"));
                    v.add(rs.getString("itemName"));
                    v.add(rs.getString("description"));
                    v.add(rs.getString("name"));
                    if (rs.getInt("status") == 1) {
                        v.add("Active");
                        dm.addRow(v);
                    } else if (rs.getInt("status") == 0) {
                        v.add("Inactive");
                        dm.addRow(v);
                    }

                }
            }

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, "\n Item Table Error ::\n " + sqle, "Error Massage", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "\n Item Table Error ::\n " + e, "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
    }
    //>>>>>>>>> addTotableSearItem close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> searchANDListItem()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> String item, String name, String text, JList jList_name
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> searchANDListItem open <<<<<<<<<<<        
    private void searchANDListItem(String item, String name, String text, JList jList_name) {
        try {
            DBClass.getData("select " + name + " from " + item + " where " + name + " like '" + text + "%' order by " + name);
            Vector v = new Vector();
            jList_name.removeAll();
            if (DBClass.r.isBeforeFirst() == true) {
                while (DBClass.r.next()) {
                    v.add(DBClass.r.getString(name));
                    jList_name.setListData(v);
                }
            } else {
                jList_name.setListData(v);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Bug Error searchANDList!!! \n " + sqle, "Error Massage", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bug Error searchANDList!!! \n " + e, "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
    }
    //>>>>>>>>> searchANDListItem close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> addTotableSearItemSearchName()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> String name
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> addTotableSearItemSearchName open <<<<<<<<<<<        
    private void addTotableSearItemSearchName(String name) {
        try {
          //  ResultSet rs = DBClass.getData("select * from item where name='" + name + "' order by name");
            ResultSet rs = DBClass.getData("select i.iditem,i.name as itemName,i.description,i.status,s.* from item i inner join supplier s on s.idsupplier = i.idsupplier where i.name='" + name + "' order by name ");
            DefaultTableModel dm = (DefaultTableModel) jtable_item.getModel();
            dm.setRowCount(0);
            if (DBClass.r.isBeforeFirst() == true) {
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("iditem"));
                    v.add(rs.getString("itemName"));
                    v.add(rs.getString("description"));
                    v.add(rs.getString("name"));
                    if (rs.getInt("status") == 1) {
                        v.add("Active");
                        dm.addRow(v);
                    } else if (rs.getInt("status") == 0) {
                        v.add("Inactive");
                        dm.addRow(v);
                    }

                }
            }

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, "Item Table Error ::\n  " + sqle, "Error Massage", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Item Table Error ::\n " + e, "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
    }
    //>>>>>>>>> addTotableSearItemSearchName close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> updateItem()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> 
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> updateItem open <<<<<<<<<<<        
    private void updateItem(String qurName) {
        String name = tx_item_name.getText();
        String description = tx_discription.getText();
        String suppplier = combo_supplier_name.getSelectedItem().toString();
        SearSupplierSearchName(suppplier);
        boolean b = jcheckbox_item.isSelected();
        int bb = 1;
        if (b == false) {
            bb = 0;
        }
        try {
            if (qurName.equals("update")) {
                DBClass.putData("update item set iditem='" + itemId + "',  name='" + name + "',description='" + description + "',status ='" + bb + "' where  iditem ='" + itemId + "' ");
            } else if (qurName.equals("delete")) {
                DBClass.putData("update item set iditem='" + itemId + "',  name='" + name + "',description='" + description + "',status ='2' where  iditem ='" + itemId + "' ");
            }
            clearemployeeFields();
            addTotableSearItem();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "\n Bug Error itemTableUpdate !!! \n " + ex, "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
    }
    //>>>>>>>>> updateItem close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> addTotableSearSupplierSearchName()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> String name
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> addTotableSearSupplierSearchName open <<<<<<<<<<<        
    private void SearSupplierSearchName(String name) {
        try {
            ResultSet rs = DBClass.getData("select * from supplier where name='" + name + "' order by name");
            if (DBClass.r.isBeforeFirst() == true) {
                while (rs.next()) {

                    if (rs.getInt("status") == 1) {
                        idsup = (rs.getInt("idsupplier"));
                    }

                }
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, "Supplier Table Error ::\n" + sqle, "Error Massage", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Supplier Table Error ::\n " + e, "Error Massage", JOptionPane.ERROR_MESSAGE);
        }

    }
    //>>>>>>>>> addTotableSearSupplierSearchName close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> addComboSearSupplierSearchName()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> 
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> addComboSearSupplierSearchName open <<<<<<<<<<<        
    private void addComboSearSupplierSearchName() {
        try {
            ResultSet rs = DBClass.getData("select * from supplier order by idsupplier");
            combo_supplier_name.removeAllItems();
            if (DBClass.r.isBeforeFirst() == true) {
                while (rs.next()) {
                    //  Vector v = new Vector();
                    if (rs.getInt("status") == 1) {
                        //  v.add(rs.getString("name"));
                        combo_supplier_name.addItem(rs.getString("name"));
                    }
                    // combo_supplier_name.addItem(v);
                }
            }

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, "Supplier Table Error ::\n addTotableSearSupplier() \n" + sqle, "Error Massage", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Supplier Table Error ::\n addTotableSearSupplier() \n" + e, "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
    }
    //>>>>>>>>> addComboSearSupplierSearchName close <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
}
