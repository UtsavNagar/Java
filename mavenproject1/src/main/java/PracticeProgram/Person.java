/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeProgram;

/**
 *
 * @author utsav
 */
public class Person {
    private String name ;
    private String address;
    
    Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getName(){
        return name;
    }
}
