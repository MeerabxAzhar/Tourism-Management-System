
package tms;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Userreg {
    Connectclass cons=new Connectclass();
    Userreg(){
    cons.Connect();
    }
    ResultSet rs;
   private String Name;
   private String Email;
   private String Password;
   private int Mobile;
    
    public void del(String email){
      try{
    this.Email=email;
            
            cons.pst=cons.con.prepareStatement("DELETE FROM `userregister` WHERE `Email ID`=?");
          cons.pst.setString(1, Email);
            cons.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    
    }
    
    public void reg(String name, String email, String password, int mobile){
          try{
    this.Name=name;
    this.Email=email;
    this.Password=password;
    this.Mobile=mobile;
     cons.pst=cons.con.prepareStatement("INSERT INTO `userregister`(`Name`, `Email ID`, `Password`, `Mobile`) VALUES (?,?,?,?)");
          cons.pst.setString(1, Name);
          cons.pst.setString(2, Email);
          cons.pst.setString(3, Password);
          cons.pst.setInt(4, Mobile);
           cons.pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Customer has been added successfully!");
           Userview profile= new Userview();
        profile.setVisible(true);
          }
           catch(Exception e){
    
    }
    }
}
