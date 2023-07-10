package oop;
public class Circle1 extends Figure {
    double radius;
    public double area() { return Math.PI*radius*radius; }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован круг с цветом");
    }
}
