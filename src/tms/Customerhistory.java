/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tms;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author taimo
 */
public class Customerhistory extends javax.swing.JFrame {
Connectclass cons=new Connectclass();
Tbladdpkg tabls=new Tbladdpkg();
DefaultTableModel d;
    public Customerhistory() {
        initComponents();
        cons.Connect();
        tabls.deltbl(tbldel);
    }
    public void mouse(){
     d=(DefaultTableModel)tbldel.getModel();
        int sIndex=tbldel.getSelectedRow();
//        String id=d.getValueAt(sIndex,0).toString();
        txtname.setText(d.getValueAt(sIndex,0).toString());
        txtemail.setText(d.getValueAt(sIndex,1).toString());
        txtmobile.setText(d.getValueAt(sIndex,2).toString());
        btndeletecustomer.setEnabled(true);
    }
    public void reset(){
     btndeletecustomer.setEnabled(true);
            txtname.setText("");
            txtemail.setText("");
            txtmobile.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btndeletecustomer = new java.awt.Button();
        email = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldel = new javax.swing.JTable();
        mobile1 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        jPanel4.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Name");
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 52, 29));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Customer's History");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 150, 38));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel4.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 210, 30));

        btndeletecustomer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btndeletecustomer.setLabel("Delete");
        btndeletecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletecustomerActionPerformed(evt);
            }
        });
        jPanel4.add(btndeletecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 116, -1));

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email ID");
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 62, 20));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel4.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 30));

        tbldel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email ID", "Mobile"
            }
        ));
        tbldel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldel);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 560, -1));

        mobile1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mobile1.setForeground(new java.awt.Color(255, 255, 255));
        mobile1.setText("Mobile");
        jPanel4.add(mobile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 62, 20));

        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        jPanel4.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 1010, 460));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\taimo\\Downloads\\2s.png")); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1190, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btndeletecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletecustomerActionPerformed
        // TODO add your handling code here:
        Userreg d=new Userreg();
        d.del(txtemail.getText());
        tabls.deltbl(tbldel);
        reset();
    }//GEN-LAST:event_btndeletecustomerActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void tbldelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldelMouseClicked
        // TODO add your handling code here:
        mouse();
    }//GEN-LAST:event_tbldelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Adminhome view=new Adminhome();
        view.show();
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
            java.util.logging.Logger.getLogger(Customerhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customerhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customerhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customerhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerhistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btndeletecustomer;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobile1;
    private javax.swing.JTable tbldel;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
