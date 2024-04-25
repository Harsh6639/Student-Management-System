/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectivity;
import java.sql.*;
public class DB {
    
   public static Connection getCon(){
   try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc://mysql://localhost/student","root","Harshg66-");
        return con;
      }
   catch(Exception e){
   System.out.print(e);
   return null;
   }
   
}
}