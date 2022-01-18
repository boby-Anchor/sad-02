package com_jFream;

import com_class.DBClass;
import com_class.path;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        imagei();
        dateTime();
        login_jProgressBar.setVisible(false);
        login_la_masssege.setVisible(false);
        login_tf_uname.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_jProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_la_cloce = new javax.swing.JLabel();
        login_tf_uname = new javax.swing.JTextField();
        login_tf_password = new javax.swing.JPasswordField();
        login_la_masssege = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        login_b_login = new javax.swing.JButton();
        login_la_time = new javax.swing.JLabel();
        login_la_date = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        login_la_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(739, 259));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(login_jProgressBar);
        login_jProgressBar.setBounds(300, 190, 420, 12);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 120, 150, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 70, 150, 30);

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
        login_la_cloce.setBounds(700, 10, 30, 30);

        login_tf_uname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login_tf_uname.setForeground(new java.awt.Color(0, 0, 0));
        login_tf_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_tf_unameKeyPressed(evt);
            }
        });
        getContentPane().add(login_tf_uname);
        login_tf_uname.setBounds(430, 70, 250, 30);

        login_tf_password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login_tf_password.setForeground(new java.awt.Color(0, 0, 0));
        login_tf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_tf_passwordKeyPressed(evt);
            }
        });
        getContentPane().add(login_tf_password);
        login_tf_password.setBounds(430, 120, 250, 30);

        login_la_masssege.setForeground(new java.awt.Color(255, 102, 102));
        login_la_masssege.setText("massege");
        getContentPane().add(login_la_masssege);
        login_la_masssege.setBounds(290, 160, 190, 20);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(460, 241));

        login_b_login.setBackground(new java.awt.Color(102, 255, 255));
        login_b_login.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        login_b_login.setForeground(new java.awt.Color(0, 0, 0));
        login_b_login.setText("Login");
        login_b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_b_loginActionPerformed(evt);
            }
        });

        login_la_time.setForeground(new java.awt.Color(0, 0, 0));
        login_la_time.setText("time");

        login_la_date.setForeground(new java.awt.Color(0, 0, 0));
        login_la_date.setText("date");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(login_b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(login_la_date, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_la_time, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_la_time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_la_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(login_b_login)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(login_b_login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(login_la_time, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(login_la_date, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(270, 10, 460, 240);

        jLayeredPane2.setBackground(new java.awt.Color(57, 192, 174));
        jLayeredPane2.setOpaque(true);

        login_la_logo.setText("jLabel1");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_la_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_la_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(login_la_logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane2);
        jLayeredPane2.setBounds(0, 0, 750, 270);

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

    private void login_tf_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_tf_unameKeyPressed
        TXValidaton(evt, login_tf_uname, 20, "NA");
        if (evt.getKeyCode() == 10 & !login_tf_uname.getText().isEmpty()) {
            login_tf_password.grabFocus();
        } else {
            login_tf_uname.grabFocus();
        }
    }//GEN-LAST:event_login_tf_unameKeyPressed

    private void login_tf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_tf_passwordKeyPressed
        TXValidaton(evt, login_tf_password, 20, "NA");
        if (evt.getKeyCode() == 10 & !String.valueOf(login_tf_password.getPassword()).isEmpty()) {
            login_b_login.doClick();
        } else {
            login_tf_password.grabFocus();
        }
    }//GEN-LAST:event_login_tf_passwordKeyPressed

    private void login_b_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_b_loginActionPerformed
        if (login_tf_uname.getText().isEmpty()) {
            login_tf_uname.grabFocus();
        } else if (String.valueOf(login_tf_password.getPassword()).isEmpty()) {
            login_tf_password.grabFocus();
        } else {
            searchEmployee();
        }


    }//GEN-LAST:event_login_b_loginActionPerformed

    /**
     * @param args the command line arguments
     */
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
////            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton login_b_login;
    private javax.swing.JProgressBar login_jProgressBar;
    private javax.swing.JLabel login_la_cloce;
    private javax.swing.JLabel login_la_date;
    private javax.swing.JLabel login_la_logo;
    private javax.swing.JLabel login_la_masssege;
    private javax.swing.JLabel login_la_time;
    private javax.swing.JPasswordField login_tf_password;
    private javax.swing.JTextField login_tf_uname;
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
            login_la_date.setText("" + sb2);
            while (true) {
                sb = new StringBuffer(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                login_la_time.setText("" + sb);
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
     * *** >>> What ------------>>> lodingProgresBar()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> int x
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> lodingProgresBar start <<<<<<<<<<<        
    synchronized private void lodingProgresBar(int x) {
        login_jProgressBar.setVisible(true);
        login_la_masssege.setVisible(true);
        Thread t = new Thread(new Runnable() {
            home n;

            @Override
            public void run() {
                try {
                    for (int i = 1; i < 101; i++) {
                        login_jProgressBar.setValue(i);
                        if (i == 5) {
                            login_la_masssege.setText("Database checking...!");
                            Connection newConnection = DBClass.con();
                            if (newConnection == null) {
                                break;
                            }
                            insertUser();
                        }
                        if (i >= 20 && i <= 30) {
                            login_la_masssege.setText("DB Connected");
                            Thread.sleep(100);
                            continue;

                        }
                        if (i == 90) {
                            login_la_masssege.setText("Loging in user");
                            n = new home();
                        }
                        if (i == 100) {
                            n.setVisible(true);
                            
                            login.this.dispose();
                            break;
                        }

                        Thread.sleep(20);

                    }
                } catch (Exception e) {
                    login_tf_uname.grabFocus();
                }
            }
        });
        t.start();

    }

         //>>>>>>>>> lodingProgresBar close <<<<<<<<<<<   
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
    //>>>>>>>>> TXValidaton cloce <<<<<<<<<<<   
    private void TXValidaton(KeyEvent evt, JTextField txName, int lenth, String type) {
        int iNumber = evt.getKeyCode();
        if (txName.getText().length() <= lenth) {
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
     * *** >>> What ------------>>> searchEmployee()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>>  searchEmployee start<<<<<<<<<<<   
    public void searchEmployee() {
        try {
            String uname = login_tf_uname.getText();
            String password = String.valueOf(login_tf_password.getPassword());
            ResultSet search = DBClass.getData("select * from employee where uname ='" + uname + "' and password ='" + password + "' ");
            if (search.next()) {
                boolean isActive = search.getBoolean("stat");
                if (isActive) {
                    lodingProgresBar(1);
                } else {
                    JOptionPane.showMessageDialog(this, "This User is Inactive");
                    login_tf_uname.grabFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                login_tf_uname.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Check the all inputs");
            login_tf_uname.grabFocus();
        }

    }
    //>>>>>>>>>  searchEmployee close<<<<<<<<<<<       

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
    private void imagei()  {
        try {
           File f = new File(path.REPORT_BASE_URL+"login_pos_01.jpg");
           Image image2 = ImageIO.read(f);
       // ImageIcon ii = new ImageIcon(getClass().getResource("/img/logo.jpg")); 
          Image image = image2.getScaledInstance(login_la_logo.getWidth(), login_la_logo.getHeight(), Image.SCALE_SMOOTH);
          login_la_logo.setIcon(new ImageIcon(image));
        } catch (Exception e) {
           // e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Image Not Loadded imagei!!!!"+e);
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
     * *** >>> What ------------>>> insertUser()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>>  insertUser start<<<<<<<<<<<   
    public void insertUser() {
        try {
            String uname = login_tf_uname.getText();
            String password = String.valueOf(login_tf_password.getPassword());
            ResultSet search = DBClass.getData("select idemployee from employee where uname ='" + uname + "' and password ='" + password + "' ");
            if (search.next()) {
                int idemployee = search.getInt("idemployee");
                String logaoutdate = "0000-00-00";
                String logaouttime = "00:00:00";
                path.setUserLoginDate(login_la_date.getText());
                path.setUserLogintime(login_la_time.getText());
                path.setUserLoginId(idemployee);
              DBClass.putData("insert into login (date,time,stat,idemployee,logaoutdate,logaouttime)  values('" + login_la_date.getText() + "' ,'" + login_la_time.getText() + "' ,'1','" + idemployee + "','"+logaoutdate+"','"+logaouttime+"' )");  
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Check the all inputs");
        }

    }
    //>>>>>>>>>  insertUser close<<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     

    
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
    private static login log = new login();

    public static login getLoginInstance() {
        return log;
    }
//>>>>>>>>> Get Instance <<<<<<<<<<<         

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
    
    
    
}
