package shapes;

import java.util.Scanner;

public class Circle {


    private double radius;
    private double area;



    public double getRadius() {
        return radius;
    }
    public void getRadius(double radius){
        this.radius = radius;
    }

    public double getArea(double pi) {
        return pi;
    }
    public void setArea(double area){
        this.area = area;
    }

    public Circle(double radius, double area){
        this.area = area;
        this.radius = radius;
    }

    public void calculateCircumference(){
        double circumference = radius * radius * area;
        System.out.println(circumference);
    }

    public void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                '}';

    }
}




