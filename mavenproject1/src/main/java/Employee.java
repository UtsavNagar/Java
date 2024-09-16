/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsav
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(int id,String firstName, String lastName,int salary){
        this.id = id;        
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.firstName + this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public void getSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    
    public void raiseSalary(int percentage){
        this.salary += this.salary / 100 * percentage;
    }
    
    @Override
    public String toString(){
        return "Employee[id = " + Integer.toString(id) + ",name = " + this.getName() + ",salary = " + salary + "]";
    }
}
