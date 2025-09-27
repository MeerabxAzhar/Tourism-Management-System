package tms;
import tms.Adminhome;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Home extends javax.swing.JFrame {
    Connectclass cons=new Connectclass(); 
//    Hom h=new Hom();
     ResultSet rs;
    public Home() {
        initComponents();
        cons.Connect();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbladminemail = new javax.swing.JLabel();
        lbladminpassword = new javax.swing.JLabel();
        txtadminemail = new javax.swing.JTextField();
        txtadminpassword = new javax.swing.JTextField();
        btnadminlog = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tourism Management System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 320, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/male_user_50px.png"))); // NOI18N
        jLabel6.setText(" Admin Login");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        jPanel3.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Login");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 107, 38));

        lbladminemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbladminemail.setForeground(new java.awt.Color(255, 255, 255));
        lbladminemail.setText("Email");
        jPanel3.add(lbladminemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 86, 52, 29));

        lbladminpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbladminpassword.setForeground(new java.awt.Color(255, 255, 255));
        lbladminpassword.setText("Password");
        jPanel3.add(lbladminpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 121, 62, 29));

        txtadminemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadminemailActionPerformed(evt);
            }
        });
        jPanel3.add(txtadminemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 89, 156, -1));

        txtadminpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadminpasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txtadminpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 124, 156, -1));

        btnadminlog.setText("Enter");
        btnadminlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminlogActionPerformed(evt);
            }
        });
        jPanel3.add(btnadminlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 310, 250));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\taimo\\Downloads\\2s.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtadminemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadminemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadminemailActionPerformed

    private void txtadminpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadminpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadminpasswordActionPerformed

    private void btnadminlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminlogActionPerformed
        // TODO add your handling code here:
        Hom log=new Hom();
       log.adminlogin(txtadminemail.getText(), txtadminpassword.getText());
    }//GEN-LAST:event_btnadminlogActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Homescreen screen=new Homescreen();
screen.show();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadminlog;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbladminemail;
    private javax.swing.JLabel lbladminpassword;
    private javax.swing.JTextField txtadminemail;
    private javax.swing.JTextField txtadminpassword;
    // End of variables declaration//GEN-END:variables
}
