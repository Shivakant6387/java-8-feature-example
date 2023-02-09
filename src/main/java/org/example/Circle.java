package org.example;
class Circles{
    void getArea(){
        Circle circle=new Circle();
        circle.area();
        circle.fillColor();
    }
}
class Canvas{
    void getArea(){
        Circle circle=new Circle();
        circle.area();
    }
}
class Shape{
    protected int color;
}
public class Circle extends Shape {
    private int radius;
    public void area(){
        System.out.println("area:"+3.14*radius*radius);
    }
    void fillColor(){
        System.out.println("color:"+color);
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.area();


    }
}