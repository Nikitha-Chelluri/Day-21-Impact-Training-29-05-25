// Write a program to create a class called shape with a method called get area, create a subclass called rectangle that overwrites the get area method to calculate the area of rectangle.
import java.util.*;
class Shape{
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return (length*breadth);
    }
}
public class Main{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1.0,2.0);
        double area = rectangle.getArea();
        System.out.println("area is"+area);
    }
}

