package com_jFream;

import com_class.DBClass;
import com_class.path;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class home extends javax.swing.JFrame {

    public static int idemployee = 0;

    public home() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        imagei("user2.png",home_la_uesr_image); 
        imagei("clipartfinal2.jpg",home_la_main_image); 
        searchUser();
        dateTime();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_la_cloce = new javax.swing.JLabel();
        login_la_mini = new javax.swing.JLabel();
        home_la_main_image = new javax.swing.JLabel();
        home_la_login_use_name = new javax.swing.JLabel();
        home_la_invoice = new javax.swing.JLabel();
        home_la_return = new javax.swing.JLabel();
        home_la_grn = new javax.swing.JLabel();
        home_la_stock = new javax.swing.JLabel();
        home_la_employee = new javax.swing.JLabel();
        home_la_supplier = new javax.swing.JLabel();
        home_la_date = new javax.swing.JLabel();
        home_la_uesr_image = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        home_la_time = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        home_la_user = new javax.swing.JLabel();
        home_la_home1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 780));
        setUndecorated(true);
        getContentPane().setLayout(null);

        login_la_cloce.setBackground(new java.awt.Color(255, 255, 255));
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
        login_la_cloce.setBounds(1332, 0, 30, 30);

        login_la_mini.setBackground(new java.awt.Color(255, 255, 255));
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
        login_la_mini.setBounds(1300, 0, 30, 30);

        home_la_main_image.setText("jLabel1");
        getContentPane().add(home_la_main_image);
        home_la_main_image.setBounds(200, 50, 1160, 730);

        home_la_login_use_name.setBackground(new java.awt.Color(255, 255, 255));
        home_la_login_use_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_login_use_name.setForeground(new java.awt.Color(0, 0, 0));
        home_la_login_use_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home_la_login_use_name.setText("LoginUser");
        home_la_login_use_name.setOpaque(true);
        getContentPane().add(home_la_login_use_name);
        home_la_login_use_name.setBounds(330, 10, 240, 30);

        home_la_invoice.setBackground(new java.awt.Color(0, 204, 204));
        home_la_invoice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_invoice.setForeground(new java.awt.Color(0, 0, 0));
        home_la_invoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_invoice.setText("Invoice");
        home_la_invoice.setOpaque(true);
        home_la_invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_invoiceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_invoiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_invoiceMouseExited(evt);
            }
        });
        getContentPane().add(home_la_invoice);
        home_la_invoice.setBounds(10, 140, 170, 40);

        home_la_return.setBackground(new java.awt.Color(0, 204, 204));
        home_la_return.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_return.setForeground(new java.awt.Color(0, 0, 0));
        home_la_return.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_return.setText("Return");
        home_la_return.setOpaque(true);
        home_la_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_returnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_returnMouseExited(evt);
            }
        });
        getContentPane().add(home_la_return);
        home_la_return.setBounds(10, 210, 170, 40);

        home_la_grn.setBackground(new java.awt.Color(0, 204, 204));
        home_la_grn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_grn.setForeground(new java.awt.Color(0, 0, 0));
        home_la_grn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_grn.setText("GRN");
        home_la_grn.setOpaque(true);
        home_la_grn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_grnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_grnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_grnMouseExited(evt);
            }
        });
        getContentPane().add(home_la_grn);
        home_la_grn.setBounds(10, 280, 170, 40);

        home_la_stock.setBackground(new java.awt.Color(0, 204, 204));
        home_la_stock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_stock.setForeground(new java.awt.Color(0, 0, 0));
        home_la_stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_stock.setText("Stock");
        home_la_stock.setOpaque(true);
        home_la_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_stockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_stockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_stockMouseExited(evt);
            }
        });
        getContentPane().add(home_la_stock);
        home_la_stock.setBounds(10, 350, 170, 40);

        home_la_employee.setBackground(new java.awt.Color(0, 204, 204));
        home_la_employee.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_employee.setForeground(new java.awt.Color(0, 0, 0));
        home_la_employee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_employee.setText("Employee");
        home_la_employee.setOpaque(true);
        home_la_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_employeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_employeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_employeeMouseExited(evt);
            }
        });
        getContentPane().add(home_la_employee);
        home_la_employee.setBounds(10, 420, 170, 40);

        home_la_supplier.setBackground(new java.awt.Color(0, 204, 204));
        home_la_supplier.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_supplier.setForeground(new java.awt.Color(0, 0, 0));
        home_la_supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_supplier.setText("Supplier");
        home_la_supplier.setOpaque(true);
        home_la_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_supplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_supplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_supplierMouseExited(evt);
            }
        });
        getContentPane().add(home_la_supplier);
        home_la_supplier.setBounds(10, 490, 170, 40);

        home_la_date.setBackground(new java.awt.Color(255, 255, 255));
        home_la_date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_date.setForeground(new java.awt.Color(0, 0, 0));
        home_la_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_date.setText("Date");
        home_la_date.setOpaque(true);
        getContentPane().add(home_la_date);
        home_la_date.setBounds(10, 10, 120, 30);

        home_la_uesr_image.setText("userlogo");
        getContentPane().add(home_la_uesr_image);
        home_la_uesr_image.setBounds(290, 10, 30, 30);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.add(jSeparator1);
        jSeparator1.setBounds(0, 43, 1370, 2);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator2);
        jSeparator2.setBounds(580, 5, 10, 30);

        home_la_time.setBackground(new java.awt.Color(255, 255, 255));
        home_la_time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_time.setForeground(new java.awt.Color(0, 0, 0));
        home_la_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_time.setText("Time");
        home_la_time.setOpaque(true);
        jLayeredPane1.add(home_la_time);
        home_la_time.setBounds(150, 10, 120, 30);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator3);
        jSeparator3.setBounds(140, 5, 10, 30);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator4);
        jSeparator4.setBounds(280, 5, 10, 30);

        home_la_user.setBackground(new java.awt.Color(0, 204, 204));
        home_la_user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_user.setForeground(new java.awt.Color(0, 0, 0));
        home_la_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_user.setText("User");
        home_la_user.setOpaque(true);
        home_la_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_userMouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_user);
        home_la_user.setBounds(10, 560, 170, 40);

        home_la_home1.setBackground(new java.awt.Color(0, 204, 204));
        home_la_home1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_home1.setForeground(new java.awt.Color(0, 0, 0));
        home_la_home1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_home1.setText("Home");
        home_la_home1.setOpaque(true);
        home_la_home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_home1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_home1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_home1MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_home1);
        home_la_home1.setBounds(10, 80, 170, 40);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 1370, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_la_cloceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseClicked
        SystemClose();
    }//GEN-LAST:event_login_la_cloceMouseClicked

    private void login_la_cloceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseEntered
        login_la_cloce.setBackground(Color.red);
    }//GEN-LAST:event_login_la_cloceMouseEntered

    private void login_la_cloceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseExited
        login_la_cloce.setBackground(Color.white);
    }//GEN-LAST:event_login_la_cloceMouseExited

    private void login_la_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_login_la_miniMouseClicked

    private void login_la_miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseEntered
        login_la_mini.setBackground(Color.gray);
    }//GEN-LAST:event_login_la_miniMouseEntered

    private void login_la_miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseExited
        login_la_mini.setBackground(Color.white);
    }//GEN-LAST:event_login_la_miniMouseExited

    private void home_la_invoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_invoiceMouseEntered
        home_la_invoice.setBackground(Color.gray);
    }//GEN-LAST:event_home_la_invoiceMouseEntered

    private void home_la_invoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_invoiceMouseExited
        home_la_invoice.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_home_la_invoiceMouseExited

    private void home_la_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_returnMouseEntered
        home_la_return.setBackground(Color.gray);
    }//GEN-LAST:event_home_la_returnMouseEntered

    private void home_la_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_returnMouseExited
         home_la_return.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_home_la_returnMouseExited

    private void home_la_grnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_grnMouseEntered
        home_la_grn.setBackground(Color.gray);
    }//GEN-LAST:event_home_la_grnMouseEntered

    private void home_la_grnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_grnMouseExited
         home_la_grn.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_home_la_grnMouseExited

    private void home_la_stockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_stockMouseEntered
         home_la_stock.setBackground(Color.gray);
    }//GEN-LAST:event_home_la_stockMouseEntered

    private void home_la_stockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_stockMouseExited
        home_la_stock.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_home_la_stockMouseExited

    private void home_la_employeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_employeeMouseEntered
        home_la_employee.setBackground(Color.gray);
    }//GEN-LAST:event_home_la_employeeMouseEntered

    private void home_la_employeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_employeeMouseExited
        home_la_employee.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_home_la_employeeMouseExited

    private void home_la_supplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_supplierMouseEntered
        home_la_supplier.setBackground(Color.gray);
    }//GEN-LAST:event_home_la_supplierMouseEntered

    private void home_la_supplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_supplierMouseExited
        home_la_supplier.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_home_la_supplierMouseExited

    private void home_la_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_userMouseEntered
         home_la_user.setBackground(Color.gray);
    }//GEN-LAST:event_home_la_userMouseEntered

    private void home_la_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_userMouseExited
         home_la_user.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_home_la_userMouseExited

    private void home_la_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_employeeMouseClicked
       int x = JOptionPane.showConfirmDialog(this, "Do you want to open Employee Interface ?", "Open Interface", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            employee.getLoginInstance().setVisible(true);
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            home_la_employee.setBackground(new Color(0,204,204));
        }
    }//GEN-LAST:event_home_la_employeeMouseClicked

    private void home_la_invoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_invoiceMouseClicked
       int x = JOptionPane.showConfirmDialog(this, "Do you want to open Invoice Interface ?", "Open Interface", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            invoice.getLoginInstance().setVisible(true);
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            home_la_invoice.setBackground(new Color(0,204,204));
        }
    }//GEN-LAST:event_home_la_invoiceMouseClicked

    private void home_la_returnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_returnMouseClicked
      int x = JOptionPane.showConfirmDialog(this, "Do you want to open Return Interface ?", "Open Interface", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            invoice.getLoginInstance().setVisible(true);
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            home_la_return.setBackground(new Color(0,204,204));
        }
    }//GEN-LAST:event_home_la_returnMouseClicked

    private void home_la_grnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_grnMouseClicked
        int x = JOptionPane.showConfirmDialog(this, "Do you want to open Grn Interface ?", "Open Interface", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            invoice.getLoginInstance().setVisible(true);
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            home_la_grn.setBackground(new Color(0,204,204));
        }
    }//GEN-LAST:event_home_la_grnMouseClicked

    private void home_la_stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_stockMouseClicked
        int x = JOptionPane.showConfirmDialog(this, "Do you want to open Stock Interface ?", "Open Interface", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            invoice.getLoginInstance().setVisible(true);
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            home_la_stock.setBackground(new Color(0,204,204));
        }
    }//GEN-LAST:event_home_la_stockMouseClicked

    private void home_la_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_supplierMouseClicked
       int x = JOptionPane.showConfirmDialog(this, "Do you want to open Supplier Interface ?", "Open Interface", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            invoice.getLoginInstance().setVisible(true);
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            home_la_supplier.setBackground(new Color(0,204,204));
        }
    }//GEN-LAST:event_home_la_supplierMouseClicked

    private void home_la_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_userMouseClicked
        
    }//GEN-LAST:event_home_la_userMouseClicked

    private void home_la_home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_home1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home_la_home1MouseClicked

    private void home_la_home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_home1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_home_la_home1MouseEntered

    private void home_la_home1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_home1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_home_la_home1MouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home_la_date;
    private javax.swing.JLabel home_la_employee;
    private javax.swing.JLabel home_la_grn;
    private javax.swing.JLabel home_la_home1;
    private javax.swing.JLabel home_la_invoice;
    private javax.swing.JLabel home_la_login_use_name;
    private javax.swing.JLabel home_la_main_image;
    private javax.swing.JLabel home_la_return;
    private javax.swing.JLabel home_la_stock;
    private javax.swing.JLabel home_la_supplier;
    private javax.swing.JLabel home_la_time;
    private javax.swing.JLabel home_la_uesr_image;
    private javax.swing.JLabel home_la_user;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel login_la_cloce;
    private javax.swing.JLabel login_la_mini;
    // End of variables declaration//GEN-END:variables

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> SystemClose()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> System cloce <<<<<<<<<<<   
    void SystemClose() {
        int x = JOptionPane.showConfirmDialog(this, "Do you sure close the System ?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            logAoutUser();
            System.exit(0);
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
     * *** >>> What ------------>>> image()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>> image ek load wenn
     */
//>>>>>>>>> set image <<<<<<<<<<<
    private void imagei(String imageName,JLabel lableName) {   
        try {
            File f = new File(path.REPORT_BASE_URL + imageName);
            Image image2 = ImageIO.read(f);
            // ImageIcon ii = new ImageIcon(getClass().getResource("/img/logo.jpg")); 
            Image image = image2.getScaledInstance(lableName.getWidth(), lableName.getHeight(), Image.SCALE_SMOOTH);
            lableName.setIcon(new ImageIcon(image));
        } catch (Exception e) {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Image Not Loadded imagei!!!!" + e);
        }

    }
//>>>>>>>>> set image <<<<<<<<<<<

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> dateTime()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> dateTime start <<<<<<<<<<<   
    private void dateTime() {
        new Thread(() -> {
            StringBuffer sb, sb2;
            sb2 = new StringBuffer(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            home_la_date.setText("" + sb2);
            while (true) {
                sb = new StringBuffer(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                home_la_time.setText("" + sb);
            }
        }).start();
    }
    //>>>>>>>>> dateTime close <<<<<<<<<<<   
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
   /* *** >>> Date ------------>>>
     * *** >>> What ------------>>> searchUser()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>>  searchUser start<<<<<<<<<<<   
    public void searchUser() {
        try {
            ResultSet searchDetails = DBClass.getData("select fname,lname from employee where idemployee='" + path.getUserLoginId() + "' ");
            if(searchDetails.next()) {
                String fname = searchDetails.getString("fname");
                String lname = searchDetails.getString("lname");
                home_la_login_use_name.setText("User Name:- "+fname + " " + lname);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "search user" + e);
        }

    }
    //>>>>>>>>>  searchUser close<<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
   /* *** >>> Date ------------>>>
     * *** >>> What ------------>>> logAoutUser()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>>  logAoutUser start<<<<<<<<<<<   
    public void logAoutUser() {
        try {
            ResultSet search = DBClass.getData("select idemployee from login where stat ='1'");
            if (search.next()) {
                idemployee = search.getInt("idemployee");
                DBClass.putData("update login set stat='0',logaoutdate='" + home_la_date.getText() + "',logaouttime='" + home_la_time.getText() + "' where  idemployee ='" + idemployee + "' and date='" + path.getUserLoginDate() + "' and time='" + path.getUserLogintime() + "'");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "not update user" + e);
        }

    }
    //>>>>>>>>>  logAoutUser close<<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
}
