
package tms;
import com.mysql.cj.Query;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hom {
    Hom(){
    cons.Connect();
    }
    Connectclass cons=new Connectclass();
     ResultSet rs;
  private  String Email;
    private String Password;
    public void adminlogin(String email, String password){
    try{
    this.Email=email;
    this.Password=password;
    cons.pst=cons.con.prepareStatement("SELECT * FROM `adminlogin` WHERE `Email`=? and`Password`=?");
    cons.pst.setString(1,Email);
    cons.pst.setString(2,Password);
    rs=cons.pst.executeQuery();
//cons.pst.executeUpdate();
    if(rs.next())
    {
           Adminhome ahome= new Adminhome();
        ahome.show();
    }
      else
                    JOptionPane.showMessageDialog(null, "Invalid Input!");
    }
    catch(Exception e){
    
    }
    
    }
}
