/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.profile;

import Connectivity.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LENOVO
 */
public class Addaction {
    public boolean add(StudentProfile sp){
        boolean check = false;
        
        try{
            Connection con = (Connection) DB.getCon();
            String query = "insert into profile(name,domian.address) value(?,?,?)";
            
            PreparedStatement p = con.prepareStatement(query);
            
            p.setString(1, sp.getname());
            p.setString(2, sp.getdomain());
            p.setString(3, sp.getname());
            p.executeUpdate();
            
            check = true;
        }
        catch(Exception e){
            System.out.print(e);
        }
        
        return check;
    }
}
