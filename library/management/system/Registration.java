
package library.management.system;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtaddrs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 78, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 192, 68, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 275, -1, -1));

        txtuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseridActionPerformed(evt);
            }
        });
        getContentPane().add(txtuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 192, 166, 30));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 275, 166, 30));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 358, 166, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 358, -1, -1));

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 441, 166, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 441, -1, -1));

        txtaddrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddrsActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 524, 166, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 524, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 645, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close icon.png"))); 
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1129, 17, 30, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login page.jpg"))); 
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 770));

        pack();
    }
    private void txtuseridActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtaddrsActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(txtuserid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all the fields...");
            txtuserid.requestFocus();
        }
        
        else if(txtusername.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all the fields...");
            txtusername.requestFocus();
        }
        
        else if(txtemail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all the fields...");
            txtemail.requestFocus();
        }
        
        else if(txtphone.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all the fields...");
            txtphone.requestFocus();
        }
        
        else if(txtaddrs.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all the fields...");
            txtaddrs.requestFocus();
        }
        
        else
        {
            try {
                Connection con=connect.Connection();
                PreparedStatement pst=con.prepareStatement("INSERT INTO \"user\"(userid,username,email,phone,address)values(?,?,?,?,?)");
                pst.setString(1,txtuserid.getText());
                pst.setString(2,txtusername.getText());
                pst.setString(3,txtemail.getText());
                pst.setString(4,txtphone.getText());
                pst.setString(5,txtaddrs.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Registration Successful...");
                txtuserid.setText("");
                txtusername.setText("");
                txtemail.setText("");
                txtphone.setText("");
                txtaddrs.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
       dispose();
    }


    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtaddrs;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtusername;
 
}
