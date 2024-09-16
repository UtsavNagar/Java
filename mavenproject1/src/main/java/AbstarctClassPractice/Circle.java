/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstarctClassPractice;

/**
 *
 * @author utsav
 */
public class Circle extends Shape{
    private double radius;
    private double PI = 3.14;

    public Circle(){}    
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return ("Circle [radius = " + Double.toString(this.radius) + ",color = " + super.getColor() + " filled " + super.isFilled());
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2*PI*radius;
    }
}
