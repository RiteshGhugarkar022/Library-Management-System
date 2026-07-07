
package library.management.system;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class ReturnBook extends javax.swing.JFrame {
    
    Connection con=connect.Connection();
    PreparedStatement pst=null;
    ResultSet rs=null;

   
    public ReturnBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtuid = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        txtbid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtissuedate = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setText("Return Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel3.setText("Book Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel6.setText("User Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel7.setText("Due Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, -1, -1));
        getContentPane().add(txtuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 167, 30));
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 167, 30));
        getContentPane().add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 167, 30));
        getContentPane().add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 167, 30));
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 167, 30));
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 167, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 22)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirm Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close icon.png"))); 
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 30, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All Page Backgraound.jpg"))); 
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 770));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(txtuid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter User id and then search...");
            txtuid.requestFocus();
        }
        else
        {
            try {
                pst=con.prepareStatement("UPDATE \"Book\" SET userid=?,issuedate=?,duedate=? WHERE \"Book\".book_id=?");
                pst.setString(1,"");
                pst.setString(2,"");
                pst.setString(3,"");
                pst.setString(4,txtbid.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Book Returned Successfully...");
                txtuid.setText("");
                txtuname.setText("");
                txtbid.setText("");
                txtbname.setText("");
                txtissuedate.setText("");
                txtduedate.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(txtuid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter User id and then search...");
            txtuid.requestFocus();
        }
        else
        {
            try {
                pst=con.prepareStatement("SELECT \"user\".username, \"Book\".book_id, \"Book\".book_name, \"Book\".issuedate, \"Book\".duedate FROM \"Book\" INNER JOIN \"user\" ON \"user\".userid = \"Book\".userid WHERE \"Book\".book_id=?");
                pst.setString(1,txtuid.getText());
                rs=pst.executeQuery();
                
                if(rs.next())
                {
                    txtuname.setText(rs.getString(1));
                    txtbid.setText(rs.getString(2));
                    txtbname.setText(rs.getString(3));
                    txtissuedate.setText(rs.getString(4));
                    txtduedate.setText(rs.getString(5));
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Please Enter Valid User Id");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtuid;
    private javax.swing.JTextField txtuname;
   
}
