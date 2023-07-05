package oop;
public class Square extends Figure {
    double size;
    public double area() { return size*size; }
    public double perimeter() { return 4*size; }

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован квадрат с цветом");
    }
}
