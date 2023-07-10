package oop;
public class Circle {
    private double radius;
    private String color;
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return String.format("радиус: %f, цвет: %s, площадь: %f, периметр: %f.%n",
                              this.radius, this.color, this.area(), this.perimeter());
    }
}
