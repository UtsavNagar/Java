/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstarctClassPractice;

/**
 *
 * @author utsav
 */
public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setHeight(side);
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
    }
    @Override
    public void setHeight(double height){
        super.setHeight(height);
    }
    @Override
    public String toString(){
        return "[side = " + super.getWidth() + "]";
    }
}
