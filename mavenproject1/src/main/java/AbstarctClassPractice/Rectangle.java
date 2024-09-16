/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstarctClassPractice;

/**
 *
 * @author utsav
 */
public class Rectangle extends Shape{
    private double width;
    private double height;  
    Rectangle(){
        super();
        this.width = 0.0;
        this.height = 0.0;
    }
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public double getArea(){
        return width*height;
    }
    @Override
    public double getPerimeter(){
        return height+width;
    }
    @Override
    public String toString(){
        return "[height = " + this.height + " , width = " + this.width + "]" ; 
    }
}
