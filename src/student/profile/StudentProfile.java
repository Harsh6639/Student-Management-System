/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.profile;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    
    private int id;
    private String name;
    private String domain;
    private String address;
    
    public StudentProfile(){
    
    }
    public StudentProfile(int id, String name, String domain,String address){
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.address = address;   
    }
    
    public StudentProfile(String name, String domain,String address){
        this.name = name;
        this.domain = domain;
        this.address = address;   
    }
    public int getid(){
    return id;
    }
    
    public void setid(int id){
        this.id=id;
    }
    public String getname(){
    return name;
    }
    
    public void setname(String name){
        this.name=name;
    }
    public String getdomain(){
    return domain;
    }
    
    public void setdomain(String domain){
        this.domain=domain;
    }
    public String getaddress(){
    return address;
    }
    
    public void setaddress(String address){
        this.address=address;
    }
    
    @Override
    public String toString(){
        
        return "Student ID ->       "+id+ "\n"+ 
               "Student Name ->     "+name+ "\n"+
               "Student Domain ->   "+domain+ "\n"+
               "Student Address ->  "+address+ "\n";
        
    }
    
    public static void main(String[] args) throws SQLException {
     
        
        Scanner sc = new Scanner(System.in);
        System.out.println("The Student Profile Portal");
         Addaction aa = new Addaction();
        while(true){
        
                 System.out.println(
                 "\n Preaa 1 for Adding Profile \n"+
                 "\n Preaa 2 for Displaying Profile \n"+
                 "\n Preaa 3 for Displaying Profile ID \n"+
                 "\n Preaa 4 for Deleting Profile \n"+
                 "\n Preaa 5 for Updating Profile \n"+
                 "\n Preaa 6 for Exiting the Profile \n"
                 );
                 
                 System.out.println("Please Provide Input - ");
                 int i = sc.nextInt();
                 
                 switch(i){
                     case 1:
                         System.out.println("Add Profile");
                    System.out.println("Enter Name");
                    String name = sc.next();
                    System.out.println("Enter Domain");
                    String domain = sc.next();
                    System.out.println("Enter Address");
                    String address = sc.next();
                    
                    StudentProfile sp = new StudentProfile(name, domain, address);
                    
                    boolean valid = aa.add(sp);
                    
                    if(valid==true)
                        System.out.println("** Profile Added **");
                    else
                        System.out.println("** Problem Occured **");
                    break;
                             
                     case 2:
                         System.out.println("Display");
                         aa.display();
                         break;
                     case 3:
                         System.out.println("Display");
                         int in = sc.nextInt();
                         System.out.println("Enter ID ->");
                         boolean validID =aa.displayID(in);
                         if(validID==false)
                             
                             System.out.println("Profile with this ID not available");
                         break;
                     case 4:
                         System.out.println("Delete");
                         int de = sc.nextInt();
                         System.out.println("Enter ID to delete ->");
                         boolean validDID = aa.delete(de);
                         if(validDID==true)
                             System.out.println("Deleted Successfully");
                         else
                             System.out.println("******Problem Occured*****");
                         break;
                     case 5:
                         System.out.println("Update");
                          
                         break;
                     case 6:
                         System.out.println("Exit");
                         System.exit(0);
                         break;
                     default:
                         System.out.println("Invalid");
                         
                 }
        }
    }
    
}
