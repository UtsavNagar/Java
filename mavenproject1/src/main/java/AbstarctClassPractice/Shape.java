/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstarctClassPractice;

/**
 *
 * @author utsav
 */
public abstract class Shape {
    protected String color ;
    protected boolean filled;
    Shape(){
        color = "white";
        filled = true;
    }
    Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();    
    @Override
    public abstract String toString();
}
