/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsav
 */

public class Circle{
    private double radius;
    private String color = "red";
    private double PI = 3.14;

    public Circle(){}    
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return ("Circle [radius = " + Double.toString(this.radius) + ",color = " + color);
    }

    public void calculateArea(){
        System.out.println("Area of Circle : "+ PI*radius*radius);
    }
}

