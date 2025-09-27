
package tms;
import java.sql.*;
import javax.swing.*;

public class Adminaddpkg {
    Connectclass cons=new Connectclass();
    
    JTable tblp;
    Adminaddpkg(){
    cons.Connect();
   
    }
     ResultSet rs;
    private String Pkgplace;
    private int Noofdays;
    private String Pkgtype;
    private String Hotelname;
    private String Roomtype;
    private String Roomsize;
    private String Foodname;
    private String Foodtype;
    private Double Costofpkg;
    public void dellhr(String hotelname,int noofdays ){
      try{
    this.Hotelname=hotelname;
    this.Noofdays=noofdays;
            
            cons.pst=cons.con.prepareStatement("DELETE FROM `userpkg` WHERE `Hotel Name`=? and `No of Days`=?");
          cons.pst.setString(1, Hotelname);
          cons.pst.setInt(2, Noofdays);
            cons.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    
    }
     public void delisl(String hotelname,int noofdays ){
      try{
    this.Hotelname=hotelname;
    this.Noofdays=noofdays;
            
            cons.pst=cons.con.prepareStatement("DELETE FROM `isluser` WHERE `Hotel Name`=? and `No of Days`=?");
          cons.pst.setString(1, Hotelname);
          cons.pst.setInt(2, Noofdays);
            cons.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    
    }
      public void delmuree(String hotelname,int noofdays ){
      try{
    this.Hotelname=hotelname;
    this.Noofdays=noofdays;
            
            cons.pst=cons.con.prepareStatement("DELETE FROM `userkar` WHERE `Hotel Name`=? and `No of Days`=?");
          cons.pst.setString(1, Hotelname);
          cons.pst.setInt(2, Noofdays);
            cons.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    
    }
    public void adminpkg(String pkgplace,int noofdays,String pkgtype,String hotelname,String roomtype,String roomsize,String foodtype,Double costofpkg){
     try{
          this.Pkgtype=pkgtype;
     this.Noofdays=noofdays;
     costofpkg=costofpkg*noofdays;
     this.Costofpkg=costofpkg;
    this.Pkgplace=pkgplace;
    this.Hotelname=hotelname;
    this.Roomtype=roomtype;
    this.Roomsize=roomsize;
    this.Foodtype=foodtype;
    cons.pst=cons.con.prepareStatement("INSERT INTO `userpkg`(`Package Place`, `No of Days`, `Package Type`, `Hotel Name`, `Room Type`, `Room Size`, `Food Type`, `Cost of Package`) VALUES (?,?,?,?,?,?,?,?)");
  
    cons.pst.setString(1,Pkgplace);
    cons.pst.setInt(2,Noofdays);
    cons.pst.setString(3,Pkgtype);
    cons.pst.setString(4,Hotelname);
    cons.pst.setString(5,Roomtype);
    cons.pst.setString(6,Roomsize);
    cons.pst.setString(7,Foodtype);
    cons.pst.setDouble(8,Costofpkg);
     JOptionPane.showMessageDialog(null, "Package has been added successfully!");
    cons.pst.executeUpdate();
        }
    catch(Exception e){
    
    }
    
    }
     public void adminisl(String pkgplace,int noofdays,String pkgtype,String hotelname,String roomtype,String roomsize,String foodtype,Double costofpkg){
     try{
          this.Pkgtype=pkgtype;
     this.Noofdays=noofdays;
     costofpkg=costofpkg*noofdays;
     this.Costofpkg=costofpkg;
    this.Pkgplace=pkgplace;
    this.Hotelname=hotelname;
    this.Roomtype=roomtype;
    this.Roomsize=roomsize;
    this.Foodtype=foodtype;
    cons.pst=cons.con.prepareStatement("INSERT INTO `isluser`(`Package Place`, `No of Days`, `Package Type`, `Hotel Name`, `Room Type`, `Room Size`, `Food Type`, `Package Cost`) VALUES (?,?,?,?,?,?,?,?)");
  
    cons.pst.setString(1,Pkgplace);
    cons.pst.setInt(2,Noofdays);
    cons.pst.setString(3,Pkgtype);
    cons.pst.setString(4,Hotelname);
    cons.pst.setString(5,Roomtype);
    cons.pst.setString(6,Roomsize);
    cons.pst.setString(7,Foodtype);
    cons.pst.setDouble(8,Costofpkg);
     JOptionPane.showMessageDialog(null, "Package has been added successfully!");
    cons.pst.executeUpdate();
        }
    catch(Exception e){
    
    }
    
    }
      public void adminkar(String pkgplace,int noofdays,String pkgtype,String hotelname,String roomtype,String roomsize,String foodtype,Double costofpkg){
     try{
          this.Pkgtype=pkgtype;
     this.Noofdays=noofdays;
     noofdays=0;
     costofpkg=0.0;
     costofpkg=costofpkg*noofdays;
     this.Costofpkg=costofpkg;
    this.Pkgplace=pkgplace;
    this.Hotelname=hotelname;
    this.Roomtype=roomtype;
    this.Roomsize=roomsize;
    this.Foodtype=foodtype;
    cons.pst=cons.con.prepareStatement("INSERT INTO `userkar`(`Package Place`, `No of Days`, `Package Type`, `Hotel Name`, `Room Type`, `Room Size`, `Food Type`, `Package Cost`) VALUES (?,?,?,?,?,?,?,?)");
    cons.pst.setString(1,Pkgplace);
    cons.pst.setInt(2,Noofdays);
    cons.pst.setString(3,Pkgtype);
    cons.pst.setString(4,Hotelname);
    cons.pst.setString(5,Roomtype);
    cons.pst.setString(6,Roomsize);
    cons.pst.setString(7,Foodtype);
    cons.pst.setDouble(8,Costofpkg);
     JOptionPane.showMessageDialog(null, "your total cost for ");
    cons.pst.executeUpdate();
        }
    catch(Exception e){
    
    }
    
    }
    
}
