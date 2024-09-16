/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeProgram;

/**
 *
 * @author utsav
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    
    Student(String name,String address,String program,int year,double fee){
        super(name,address);
        this.fee = fee;
        this.program = program;
        this.year = year;
    }
    
    public void setProgram(String program){
        this.program = program;
    }
    
    public void setFee(double fee){
        this.fee = fee;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getProgram(){
        return program;
    }
    
    public double getFee(){
        return fee;
    }
}
