package tms;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author taimo
 */
public class Adminchoice extends javax.swing.JFrame {

    /**
     * Creates new form AdminRoom
     */
    Connectclass cons=new Connectclass();
     Tbladdpkg tabl=new Tbladdpkg();
      DefaultTableModel d;
    public Adminchoice() {
        initComponents();
        cons.Connect();
        tabl.tblchoice(tblcho);
            JOptionPane.showMessageDialog(null, "please hit the refresh button before entering anything!");
    }
    
     public void reset(){
     btncheckcost.setEnabled(true);
        combotranstype.setSelectedItem("Select your transport type");
        combovehicletype.setSelectedItem("Select your vehicle type");
        combovehiclename.setSelectedItem("Select Vehicle brand");
        txtvehiclecost.setText("0.0");
        combohotelname.setSelectedItem("Select your hotel");
        comboroomtype.setSelectedItem("Select your room type");
        comboroomsize.setSelectedItem("Select room size");
        txthotelcost.setText("0.0");
        combofoodtype.setSelectedItem("Select your food type");
        txtfoodcost.setText("0.0");
        txttotalcost.setText("0.0");
    }
  public void refresh(){
  txtvehiclecost.setText("0.0");
txthotelcost.setText("0.0");
txtfoodcost.setText("0.0");
txttotalcost.setText("0.0");
  }
   public void mouse(){
     d=(DefaultTableModel)tblcho.getModel();
        int sIndex=tblcho.getSelectedRow();
        combotranstype.setSelectedItem(d.getValueAt(sIndex,0).toString());
        combovehicletype.setSelectedItem(d.getValueAt(sIndex,1).toString());
        combovehiclename.setSelectedItem(d.getValueAt(sIndex,2).toString());
        txtvehiclecost.setText(d.getValueAt(sIndex,3).toString());
        combohotelname.setSelectedItem(d.getValueAt(sIndex,4).toString());
        comboroomtype.setSelectedItem(d.getValueAt(sIndex,5).toString());
        comboroomsize.setSelectedItem(d.getValueAt(sIndex,6).toString());
        txthotelcost.setText(d.getValueAt(sIndex,7).toString());
        combofoodtype.setSelectedItem(d.getValueAt(sIndex,8).toString());
        txtfoodcost.setText(d.getValueAt(sIndex,9).toString());
        txttotalcost.setText(d.getValueAt(sIndex,10).toString());
        btncheckcost.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblvehiclename = new javax.swing.JLabel();
        lblroomsize = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        btnconfirm = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtfoodcost = new javax.swing.JTextField();
        lblvehicletype = new javax.swing.JLabel();
        txtvehiclecost = new javax.swing.JTextField();
        lblfoodname = new javax.swing.JLabel();
        lblroomtype = new javax.swing.JLabel();
        txttotalcost = new javax.swing.JTextField();
        lbltranstype = new javax.swing.JLabel();
        lblvehiclecost = new javax.swing.JLabel();
        lbltotalcost = new javax.swing.JLabel();
        lblfoodtype = new javax.swing.JLabel();
        combofoodtype = new javax.swing.JComboBox<>();
        combotranstype = new javax.swing.JComboBox<>();
        combovehicletype = new javax.swing.JComboBox<>();
        comboroomtype = new javax.swing.JComboBox<>();
        comboroomsize = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcho = new javax.swing.JTable();
        lblhotelname = new javax.swing.JLabel();
        lblroomsize1 = new javax.swing.JLabel();
        txthotelcost = new javax.swing.JTextField();
        lblfoodtype1 = new javax.swing.JLabel();
        combovehiclename = new javax.swing.JComboBox<>();
        combohotelname = new javax.swing.JComboBox<>();
        combofoodname = new javax.swing.JComboBox<>();
        btncheckcost = new javax.swing.JButton();
        btncancel1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblselectpkg = new javax.swing.JLabel();
        selectyourown = new javax.swing.JLabel();
        lblselecttrans = new javax.swing.JLabel();
        lblselectroom = new javax.swing.JLabel();
        lblselectfood = new javax.swing.JLabel();
        lblselecthotel1 = new javax.swing.JLabel();
        lblselectfood1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

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

        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Available Things");
        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 180, 30));

        lblvehiclename.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblvehiclename.setForeground(new java.awt.Color(255, 255, 255));
        lblvehiclename.setText("Vehicle Name");
        jPanel5.add(lblvehiclename, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, 20));

        lblroomsize.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblroomsize.setForeground(new java.awt.Color(255, 255, 255));
        lblroomsize.setText("Room Size");
        jPanel5.add(lblroomsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 100, 20));

        btncancel.setBackground(new java.awt.Color(0, 0, 0));
        btncancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Refresh");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel5.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 80, -1));

        btnconfirm.setBackground(new java.awt.Color(0, 0, 0));
        btnconfirm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirm.setText("Book");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        jPanel5.add(btnconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 80, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 20));
        jPanel5.add(txtfoodcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 200, 30));

        lblvehicletype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblvehicletype.setForeground(new java.awt.Color(255, 255, 255));
        lblvehicletype.setText("Vehicle Type");
        jPanel5.add(lblvehicletype, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, 20));
        jPanel5.add(txtvehiclecost, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 210, 30));

        lblfoodname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblfoodname.setForeground(new java.awt.Color(255, 255, 255));
        lblfoodname.setText("Food Name");
        jPanel5.add(lblfoodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 80, 20));

        lblroomtype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblroomtype.setForeground(new java.awt.Color(255, 255, 255));
        lblroomtype.setText("Room Type");
        jPanel5.add(lblroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 100, 20));
        jPanel5.add(txttotalcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 200, 30));

        lbltranstype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbltranstype.setForeground(new java.awt.Color(255, 255, 255));
        lbltranstype.setText("Transport Type");
        jPanel5.add(lbltranstype, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, 20));

        lblvehiclecost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblvehiclecost.setForeground(new java.awt.Color(255, 255, 255));
        lblvehiclecost.setText("Vehicle cost");
        jPanel5.add(lblvehiclecost, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 20));

        lbltotalcost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbltotalcost.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalcost.setText("Total Cost");
        jPanel5.add(lbltotalcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 100, 20));

        lblfoodtype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblfoodtype.setForeground(new java.awt.Color(255, 255, 255));
        lblfoodtype.setText("Food Cost");
        jPanel5.add(lblfoodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 100, 20));

        combofoodtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your food type", "Veg", "Non-veg", " " }));
        combofoodtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combofoodtypeActionPerformed(evt);
            }
        });
        jPanel5.add(combofoodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 200, 30));

        combotranstype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your transport type", "Airplane", "Car", "Bus", "Mini-Bus" }));
        jPanel5.add(combotranstype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 210, 30));

        combovehicletype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your vehicle type", "AC", "NON-AC" }));
        jPanel5.add(combovehicletype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 30));

        comboroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your room type", "AC", "NON-AC", " " }));
        jPanel5.add(comboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 210, 30));

        comboroomsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select room size", "Single ", "Double", " " }));
        jPanel5.add(comboroomsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 200, 30));

        tblcho.setBackground(new java.awt.Color(0, 0, 0));
        tblcho.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblcho.setForeground(new java.awt.Color(255, 255, 255));
        tblcho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transport Type", "Vehicle Type", "Vehicle Name", "Vehicle Cost", "Hotel Name", "Room Type", "Room Size", "Hotel Cost", "Food Type", "Food Cost", "Total Cost"
            }
        ));
        tblcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcho);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 950, 270));

        lblhotelname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblhotelname.setForeground(new java.awt.Color(255, 255, 255));
        lblhotelname.setText("Hotel Name");
        jPanel5.add(lblhotelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 20));

        lblroomsize1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblroomsize1.setForeground(new java.awt.Color(255, 255, 255));
        lblroomsize1.setText("Hotel Cost");
        jPanel5.add(lblroomsize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 100, 20));
        jPanel5.add(txthotelcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 200, 30));

        lblfoodtype1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblfoodtype1.setForeground(new java.awt.Color(255, 255, 255));
        lblfoodtype1.setText("Food Type");
        jPanel5.add(lblfoodtype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 100, 20));

        combovehiclename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vehicle brand", "DHL", "UPS", "FedEx" }));
        jPanel5.add(combovehiclename, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 210, 30));

        combohotelname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your hotel", "Luxus Grand Hotel", "Ambiance Botique Arts", "Ramada", "hayat luxury Hotel", "Freddy's Luxury Apartment", "Chalet islamabad", "The Mark", "Hotel One mall road", "Hotel one bhurban", "The smart Hotel", " " }));
        jPanel5.add(combohotelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 210, 30));

        combofoodname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "menu", "Biryani", "Chowmin", "Noodles", "Pasta ", "Eggs Benedict", "Lobster Newburg", "Peach Melba", "Soup", "Ramen", "Potato Chips", "Donuts", "Ice Cream", "Chicken Tenders", "Soft Drinks/Soda", "Pizza", "Oreo Cookies", "French Fries" }));
        jPanel5.add(combofoodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 200, 30));

        btncheckcost.setBackground(new java.awt.Color(0, 0, 0));
        btncheckcost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btncheckcost.setForeground(new java.awt.Color(255, 255, 255));
        btncheckcost.setText("Check cost");
        btncheckcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckcostActionPerformed(evt);
            }
        });
        jPanel5.add(btncheckcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 120, -1));

        btncancel1.setBackground(new java.awt.Color(0, 0, 0));
        btncancel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btncancel1.setForeground(new java.awt.Color(255, 255, 255));
        btncancel1.setText("Cancel");
        btncancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel1ActionPerformed(evt);
            }
        });
        jPanel5.add(btncancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 70, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 950, 580));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_24px.png"))); // NOI18N
        jLabel3.setText("Home");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        lblselectpkg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblselectpkg.setForeground(new java.awt.Color(255, 255, 255));
        lblselectpkg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_property_24px.png"))); // NOI18N
        lblselectpkg.setText("     Select Package");
        lblselectpkg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblselectpkgMouseClicked(evt);
            }
        });
        jPanel2.add(lblselectpkg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 50));

        selectyourown.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        selectyourown.setForeground(new java.awt.Color(255, 255, 255));
        selectyourown.setText("     Select by your own choice");
        selectyourown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectyourownMouseClicked(evt);
            }
        });
        jPanel2.add(selectyourown, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 30));

        lblselecttrans.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblselecttrans.setForeground(new java.awt.Color(255, 255, 255));
        lblselecttrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tiles_26px.png"))); // NOI18N
        lblselecttrans.setText("     Select Transport");
        lblselecttrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblselecttransMouseClicked(evt);
            }
        });
        jPanel2.add(lblselecttrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, 40));

        lblselectroom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblselectroom.setForeground(new java.awt.Color(255, 255, 255));
        lblselectroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grid_24px.png"))); // NOI18N
        lblselectroom.setText("     Select Room");
        lblselectroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblselectroomMouseClicked(evt);
            }
        });
        jPanel2.add(lblselectroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 190, 40));

        lblselectfood.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblselectfood.setForeground(new java.awt.Color(255, 255, 255));
        lblselectfood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        lblselectfood.setText("     Logout");
        lblselectfood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblselectfoodMouseClicked(evt);
            }
        });
        jPanel2.add(lblselectfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 140, 60));

        lblselecthotel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblselecthotel1.setForeground(new java.awt.Color(255, 255, 255));
        lblselecthotel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/template_26px.png"))); // NOI18N
        lblselecthotel1.setText("     Select Hotel");
        lblselecthotel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblselecthotel1MouseClicked(evt);
            }
        });
        jPanel2.add(lblselecthotel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 210, 50));

        lblselectfood1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblselectfood1.setForeground(new java.awt.Color(255, 255, 255));
        lblselectfood1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/categorize_24px.png"))); // NOI18N
        lblselectfood1.setText("     Select Food");
        lblselectfood1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblselectfood1MouseClicked(evt);
            }
        });
        jPanel2.add(lblselectfood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 730));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\taimo\\Downloads\\2s.png")); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1190, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
       reset();
       JOptionPane.showMessageDialog(null, "The Choices has been booked successfully!");
      tabl.tblchoice(tblcho);
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void combofoodtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combofoodtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combofoodtypeActionPerformed

    private void btncheckcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckcostActionPerformed
  Adminchoicee c=new Adminchoicee();
c.adminchoic((String)combotranstype.getSelectedItem(),(String)combovehicletype.getSelectedItem(),(String)combovehiclename.getSelectedItem(),Double.parseDouble(txtvehiclecost.getText()), (String)combohotelname.getSelectedItem(),(String)comboroomtype.getSelectedItem(), (String)comboroomsize.getSelectedItem(),Double.parseDouble(txthotelcost.getText()), (String)combofoodtype.getSelectedItem(),Double.parseDouble(txtfoodcost.getText()),Double.parseDouble(txttotalcost.getText()));

//        String trans=(String) combotranstype.getSelectedItem();
//Double t=0.0;
//if(trans.equals("Airplane")){
//t+=20000.0;
//}else if(trans.equals("Car")){
//t+=10000.0;
//}else if(trans.equals("Bus")){
//t+=7000.0;
//}else if(trans.equals("Mini-Bus")){
//t+=5000.0;
//}else
//    JOptionPane.showMessageDialog(null, "Please choose an apropriate transport");
//String hot=(String) comboroomtype.getSelectedItem();
//Double h=0.0;
//if(hot.equals("AC")){
//h+=9000.0;
//}else if(hot.equals("NON-AC")){
//h+=18000.0;
//}else
//    JOptionPane.showMessageDialog(null, "Please choose an apropriate room type");
//String food=(String) combofoodtype.getSelectedItem();
//Double f=0.0;
//if(food.equals("Veg")){
//f+=3000.0;
//}else if(food.equals("Non-veg")){
//f+=5000.0;
//}else 
//    JOptionPane.showMessageDialog(null, "Please choose an apropriate food type");
//Double total=t+h+f;
//String to=String.valueOf(t);
//txtvehiclecost.setText(to);
//String ho=String.valueOf(h);
//txthotelcost.setText(ho);
//String fo=String.valueOf(f);
//txtfoodcost.setText(fo);
//String tot=String.valueOf(total);
//txttotalcost.setText(tot);
       

    }//GEN-LAST:event_btncheckcostActionPerformed

    private void btncancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel1ActionPerformed
 Adminhome h=new Adminhome();
        h.show();        // TODO add your handling code here:
    }//GEN-LAST:event_btncancel1ActionPerformed

    private void tblchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchoMouseClicked
        // TODO add your handling code here:
        mouse();
    }//GEN-LAST:event_tblchoMouseClicked

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved

    }//GEN-LAST:event_jPanel5MouseMoved

    private void lblselectpkgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblselectpkgMouseClicked
        // TODO add your handling code here:
        Userv desti=new Userv();
        desti.show();
    }//GEN-LAST:event_lblselectpkgMouseClicked

    private void selectyourownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectyourownMouseClicked
        // TODO add your handling code here:
        Adminchoice choice= new Adminchoice();
        choice.show();
    }//GEN-LAST:event_selectyourownMouseClicked

    private void lblselecttransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblselecttransMouseClicked
        // TODO add your handling code here:
        Adminchoice choice= new Adminchoice();
        choice.show();
    }//GEN-LAST:event_lblselecttransMouseClicked

    private void lblselectroomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblselectroomMouseClicked
        // TODO add your handling code here:
        Adminchoice choice= new Adminchoice();
        choice.show();
    }//GEN-LAST:event_lblselectroomMouseClicked

    private void lblselectfoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblselectfoodMouseClicked
        // TODO add your handling code here:
        Homescreen screen=new Homescreen();
        screen.show();
    }//GEN-LAST:event_lblselectfoodMouseClicked

    private void lblselecthotel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblselecthotel1MouseClicked
        // TODO add your handling code here:
        Adminchoice choice= new Adminchoice();
        choice.show();
    }//GEN-LAST:event_lblselecthotel1MouseClicked

    private void lblselectfood1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblselectfood1MouseClicked
        // TODO add your handling code here:
        Adminchoice choice= new Adminchoice();
        choice.show();
    }//GEN-LAST:event_lblselectfood1MouseClicked

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
            java.util.logging.Logger.getLogger(Adminchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminchoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncancel1;
    private javax.swing.JButton btncheckcost;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JComboBox<String> combofoodname;
    private javax.swing.JComboBox<String> combofoodtype;
    private javax.swing.JComboBox<String> combohotelname;
    private javax.swing.JComboBox<String> comboroomsize;
    private javax.swing.JComboBox<String> comboroomtype;
    private javax.swing.JComboBox<String> combotranstype;
    private javax.swing.JComboBox<String> combovehiclename;
    private javax.swing.JComboBox<String> combovehicletype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfoodname;
    private javax.swing.JLabel lblfoodtype;
    private javax.swing.JLabel lblfoodtype1;
    private javax.swing.JLabel lblhotelname;
    private javax.swing.JLabel lblroomsize;
    private javax.swing.JLabel lblroomsize1;
    private javax.swing.JLabel lblroomtype;
    private javax.swing.JLabel lblselectfood;
    private javax.swing.JLabel lblselectfood1;
    private javax.swing.JLabel lblselecthotel1;
    private javax.swing.JLabel lblselectpkg;
    private javax.swing.JLabel lblselectroom;
    private javax.swing.JLabel lblselecttrans;
    private javax.swing.JLabel lbltotalcost;
    private javax.swing.JLabel lbltranstype;
    private javax.swing.JLabel lblvehiclecost;
    private javax.swing.JLabel lblvehiclename;
    private javax.swing.JLabel lblvehicletype;
    private javax.swing.JLabel selectyourown;
    private javax.swing.JTable tblcho;
    private javax.swing.JTextField txtfoodcost;
    private javax.swing.JTextField txthotelcost;
    private javax.swing.JTextField txttotalcost;
    private javax.swing.JTextField txtvehiclecost;
    // End of variables declaration//GEN-END:variables
}
