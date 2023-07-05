package oop;
public class Rectangle extends Figure {
    double width;
    double height;
    public double area() { return width*height; }
    public double perimeter() { return 2*(width + height); }

    @Override
    public void draw() {
        System.out.println("Нарисован прямоугольник");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник с цветом");
    }
}
