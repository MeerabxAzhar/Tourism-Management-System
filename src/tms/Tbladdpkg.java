
package tms;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tbladdpkg {
    Connectclass cons= new Connectclass();
    Tbladdpkg(){
    cons.Connect();
    }
 
      JTable t;
      public void deltbl(JTable tabl){
       
    try {
//        this.t=table;
        cons.pst=cons.con.prepareStatement("SELECT * FROM `userregister`");
       cons.rs=cons.pst.executeQuery();
        ResultSetMetaData rsd=cons.rs.getMetaData();
        cons.dt=(DefaultTableModel)tabl.getModel();
        cons.dt.setRowCount(0);
        while(cons.rs.next()){
            Vector v=new Vector();
             v.add(cons.rs.getString("Name"));
              v.add(cons.rs.getString("Email ID"));
               v.add(cons.rs.getInt("Mobile")); 
                    cons.dt.addRow(v);
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    }   
    
      }
       public void tblchoice(JTable table){
    try {
//        this.t=table;
        cons.pst=cons.con.prepareStatement("SELECT * FROM `admintbl`");
       cons.rs=cons.pst.executeQuery();
        ResultSetMetaData rsd=cons.rs.getMetaData();
        cons.dt=(DefaultTableModel)table.getModel();
        cons.dt.setRowCount(0);
        while(cons.rs.next()){
            Vector v=new Vector();
             v.add(cons.rs.getString("Transport Type"));
              v.add(cons.rs.getString("Vehicle Type"));
               v.add(cons.rs.getString("Vehicle Name"));
                 v.add(cons.rs.getString("Vehicle Cost"));
                  v.add(cons.rs.getString("Hotel Name"));
                   v.add(cons.rs.getString("Room Type"));
                   v.add(cons.rs.getString("Room Size"));
                   v.add(cons.rs.getString("Hotel Price")); 
                    v.add(cons.rs.getString("Food Type")); 
                     v.add(cons.rs.getString("Food Cost")); 
                      v.add(cons.rs.getString("Total Cost")); 
                    cons.dt.addRow(v);
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    }   }
    public void tbl(JTable table){
    try {
//        this.t=table;
        cons.pst=cons.con.prepareStatement("SELECT * FROM `userpkg`");
       cons.rs=cons.pst.executeQuery();
        ResultSetMetaData rsd=cons.rs.getMetaData();
        cons.dt=(DefaultTableModel)table.getModel();
        cons.dt.setRowCount(0);
        while(cons.rs.next()){
            Vector v=new Vector();
             v.add(cons.rs.getString("Package Place"));
              v.add(cons.rs.getString("No of Days"));
               v.add(cons.rs.getString("Package Type"));
                 v.add(cons.rs.getString("Hotel Name"));
                  v.add(cons.rs.getString("Room Type"));
                   v.add(cons.rs.getString("Room Size"));
                   v.add(cons.rs.getString("Food Type"));
                   v.add(cons.rs.getString("Cost of Package")); 
                    cons.dt.addRow(v);
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    }   
    }
      public void tbli(JTable tisl){
    try {
        cons.pst=cons.con.prepareStatement("SELECT * FROM `isluser`");
       cons.rs=cons.pst.executeQuery();
        ResultSetMetaData rsd=cons.rs.getMetaData();
        cons.dt=(DefaultTableModel)tisl.getModel();
        cons.dt.setRowCount(0);
        while(cons.rs.next()){
            Vector v=new Vector();
             v.add(cons.rs.getString("Package Place"));
              v.add(cons.rs.getString("No of Days"));
               v.add(cons.rs.getString("Package Type"));
                 v.add(cons.rs.getString("Hotel Name"));
                  v.add(cons.rs.getString("Room Type"));
                   v.add(cons.rs.getString("Room Size"));
                   v.add(cons.rs.getString("Food Type"));
                   v.add(cons.rs.getString("Package Cost")); 
                    cons.dt.addRow(v);
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    }   
    }
        public void tblkar(JTable tmur){
    try {
        cons.pst=cons.con.prepareStatement("SELECT * FROM `userkar`");
       cons.rs=cons.pst.executeQuery();
        ResultSetMetaData rsd=cons.rs.getMetaData();
        cons.dt=(DefaultTableModel)tmur.getModel();
        cons.dt.setRowCount(0);
        while(cons.rs.next()){
            Vector v=new Vector();
             v.add(cons.rs.getString("Package Place"));
              v.add(cons.rs.getString("No of Days"));
               v.add(cons.rs.getString("Package Type"));
                 v.add(cons.rs.getString("Hotel Name"));
                  v.add(cons.rs.getString("Room Type"));
                   v.add(cons.rs.getString("Room Size"));
                   v.add(cons.rs.getString("Food Type"));
                   v.add(cons.rs.getString("Package Cost")); 
                    cons.dt.addRow(v);
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    }   
    }
}
