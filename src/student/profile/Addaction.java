/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.profile;

import Connectivity.DB;
//import java.beans.Statement;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Addaction {

    public boolean add(StudentProfile sp){
       boolean check = false;
        try {
            Connection con = (Connection) DB.getCon();
            String query = "insert into profile(name,domain,address) value(?,?,?)";

            PreparedStatement p = con.prepareStatement(query);

            p.setString(1, sp.getname());
            p.setString(2, sp.getdomain());
            p.setString(3, sp.getaddress());
            p.executeUpdate();

            check = true;
        } catch (Exception e) {
            System.out.print(e);
        }

        return check;
    }

    public void display() throws SQLException, SQLException, SQLException {
        try{
        Connection con = DB.getCon();
        String query = "select * from profile";
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(query);
        
        while(rs.next()){
            System.out.println(
            "ID          ->"+ rs.getInt(1)+"\n"+
            "Name        ->"+ rs.getString(2)+"\n"+
            "Domain      ->"+ rs.getString(3)+"\n"+
            "Address     ->"+ rs.getString(4)
            );
            System.out.println("*****************");
            
            
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public boolean displayID(int id){
         boolean check = false;   
        try{
        Connection con = DB.getCon();
        String query = "select * from profile where id=" +id;
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(query);
        
        while(rs.next()){
            System.out.println(
            "ID          ->"+ rs.getInt(1)+"\n"+
            "Name        ->"+ rs.getString(2)+"\n"+
            "Domain      ->"+ rs.getString(3)+"\n"+
            "Address     ->"+ rs.getString(4)
            );
            System.out.println("*****************");   
        }
        check = true;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return check;
        }
    public boolean delete(int de){
       boolean check = false;
       
       try{
           Connection con = DB.getCon();
           String query = "delete from profile where id="+de;
           PreparedStatement p = con.prepareStatement(query);
           p.executeUpdate();           
           check = true;
       }
       catch(Exception e){
           System.out.println(e);
       }
       return check;
    }
}
