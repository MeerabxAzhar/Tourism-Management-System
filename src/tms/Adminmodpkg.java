
package tms;
import java.sql.*;
import javax.swing.*;
public class Adminmodpkg {
     Connectclass cons=new Connectclass();
   
    Adminmodpkg(){
    cons.Connect();
    }
     ResultSet rs;
    
   private String Pkgplace;
   private int Noofdays;
   private String Pkgtype;
   private String Hoteltype;
   private String Hotelname;
   private String Roomtype;
   private String Roomsize;
   private String Foodname;
   private String Foodtype;

   private Double Costofpkg;
    public void adminmodpkg(String pkgplace,int noofdays,String pkgtype,String hotelname,String roomtype,String roomsize,String foodtype,Double costofpkg){
     try{
       
    this.Pkgplace=pkgplace;
    this.Noofdays=noofdays;
    this.Pkgtype=pkgtype;

    this.Hotelname=hotelname;
    this.Roomtype=roomtype;
    this.Roomsize=roomsize;

    this.Foodtype=foodtype;
    this.Costofpkg=costofpkg;
    cons.pst=cons.con.prepareStatement("UPDATE `userpkg` SET `Package Place`=?,`Hotel Type`=?,`Room Type`=?,`Room Size`=?,`Food Type`=?,`Package Cost`=? WHERE `Package Type`=? and  `No of Days`=?");
    cons.pst.setString(1,Pkgplace);
    cons.pst.setInt(2,Noofdays);
    cons.pst.setString(3,Pkgtype);
    cons.pst.setString(4,Hotelname);
    cons.pst.setString(5,Roomtype);
    cons.pst.setString(6,Roomsize);
    cons.pst.setString(7,Foodtype);
    cons.pst.setDouble(8,Costofpkg);
    cons.pst.executeUpdate();
//    rs=cons.pst.executeQuery();
    JOptionPane.showMessageDialog(null, "Package has been updated successfully!");
        }
    catch(Exception e){
    
    }
    
    }
    
    
}
