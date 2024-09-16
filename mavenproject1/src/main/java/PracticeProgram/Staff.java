/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeProgram;

/**
 *
 * @author utsav
 */
public class Staff extends Person {
    private String school ;
    private double pay; 
    
    Staff(String name,String address,String school,double pay){
        super(name,address);
        this.pay = pay;
        this.school = school;
    }
    
    public String getSchool(){
        return school;
    }
    
    public double getPay(){
        return pay;
    }
    
    public void setPay(double pay){
        this.pay = pay;
    }
    
    public void setSchool(String school){
        this.school = school;
    }
}
