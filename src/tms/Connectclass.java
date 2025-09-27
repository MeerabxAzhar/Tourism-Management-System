
package tms;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Connectclass {
      Connection con;
    PreparedStatement pst;
    DefaultTableModel dt;
    ResultSet rs;
    public void Connect(){
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        
                            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "");
                       
                    } catch (Exception ex) {
                      
                    }
                }
    
}
