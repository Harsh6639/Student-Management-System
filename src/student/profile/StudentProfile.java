/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.profile;

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
    
    public static void main(String[] args) {
     
        
        Scanner sc = new Scanner(System.in);
        System.out.println("The Student Profile Portal");
        
        while(true){
        
                 System.out.println(
                 "\n Preaa 1 for Adding Profile \n"+
                 "\n Preaa 2 for Displaying Profile \n"+
                 "\n Preaa 3 for Displaying Profile ID \n"+
                 "\n Preaa 4 for Deleting Profile \n"+
                 "\n Preaa 5 for Updating Profile \n"+
                 "\n Preaa 6 for Exiting the Profile \n"
                 );
        }
    }
    
}
