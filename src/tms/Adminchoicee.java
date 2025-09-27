
package tms;
import java.sql.*;
import javax.swing.*;
public class Adminchoicee {
    Connectclass cons= new Connectclass();
    Adminchoicee(){
    cons.Connect();
    }
    ResultSet rs;
  private  String Transtype;
    private String Vehicletype;
    private String Vehiclename;
    private Double Vehiclecost;
    private String Hotelname;
    private String Roomtype;
    private String Roomsize;
    private Double Hotelcost;
    private String Foodtype;
    private Double Foodcost;
    private Double Costofpkg;
    public void adminchoic(String transtype,String vehicletype,String vehiclename,Double vehiclecost,String hotelname,String roomtype,String roomsize,Double hotelcost,String foodtype,Double foodcost,Double costofpkg){
     try{
vehiclecost=0.0;
if(transtype.equals("Airplane")){
vehiclecost+=20000.0;
}else if(transtype.equals("Car")){
vehiclecost+=10000.0;
}else if(transtype.equals("Bus")){
vehiclecost+=7000.0;
}else if(transtype.equals("Mini-Bus")){
vehiclecost+=5000.0;
}else
    JOptionPane.showMessageDialog(null, "Please choose an apropriate transport");
//String hot=(String) comboroomtype.getSelectedItem();
hotelcost=0.0;
if(roomtype.equals("AC")){
hotelcost+=9000.0;
}else if(roomtype.equals("NON-AC")){
hotelcost+=18000.0;
}else
    JOptionPane.showMessageDialog(null, "Please choose an apropriate room type");
//String food=(String) combofoodtype.getSelectedItem();
foodcost=0.0;
if(foodtype.equals("Veg")){
foodcost+=3000.0;
}else if(foodtype.equals("Non-veg")){
foodcost+=5000.0;
}else 
    JOptionPane.showMessageDialog(null, "Please choose an apropriate food type");
costofpkg=vehiclecost+hotelcost+foodcost;
this.Transtype=transtype;
    this.Vehicletype=vehicletype;
    this.Vehiclename=vehiclename;
    this.Vehiclecost=vehiclecost;
    this.Hotelname=hotelname;
    this.Roomtype=roomtype;
    this.Roomsize=roomsize;
    this.Hotelcost=hotelcost;
    this.Foodtype=foodtype;
    this.Foodcost=foodcost;
    this.Costofpkg=costofpkg;
   cons.pst=cons.con.prepareStatement("INSERT INTO `admintbl`(`Transport Type`, `Vehicle Type`, `Vehicle Name`, `Vehicle Cost`, `Hotel Name`, `Room Type`, `Room Size`, `Hotel Price`, `Food Type`, `Food Cost`, `Total Cost`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
    cons.pst.setString(1,Transtype);
    cons.pst.setString(2,Vehicletype);
    cons.pst.setString(3,Vehiclename);
    cons.pst.setDouble(4,Vehiclecost);
    cons.pst.setString(5,Hotelname);
    cons.pst.setString(6,Roomtype);
    cons.pst.setString(7,Roomsize);
    cons.pst.setDouble(8,Hotelcost);
    cons.pst.setString(9,Foodtype);
    cons.pst.setDouble(10, Foodcost);
    cons.pst.setDouble(11,Costofpkg);
    cons.pst.executeUpdate();
 JOptionPane.showMessageDialog(null, "The price of your transport is "+Vehiclecost+", the price of your Hotel is "+Hotelcost+", the price of your Food is "+Foodcost+" and the total price is "+Costofpkg);
     costofpkg=0.0;   
     }
    catch(Exception e){
          
    }}

}
