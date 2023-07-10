package oop;
public class Triangle extends Figure {
    double a, b, c;
    public double perimeter() { return a + b + c; }
    public double area() {
        double p = this.perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void draw() {
        System.out.println("Нарисован треугольник");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован треугольник с цветом");
    }
}
