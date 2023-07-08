package oop;

import java.util.Random;

public class Test {
    public static void test1(){
        System.out.println("Задание 1");
        Phone p1 = new Phone();
        Phone p2 = new Phone("89995424769", "Galaxy S9");
        Phone p3 = new Phone("89995414769", "Note 10", 0.7);
        System.out.println(p1.getNumber());
        p2.receiveCall("Дмитрий");
        p3.receiveCall("Олег", "89995424769");
        Phone.sendMessage();
        p2.toString();
        System.out.println("-----------------------------------------------------------");
    }
    public static void test2(){
        System.out.println("Задание 2");
        Circle c = new Circle(10, "Красный");
        c.toString();
        System.out.println("-----------------------------------------------------------");
    }
    public static void test3(){
        System.out.println("Задание 3");
        Matrix m1 = new Matrix(2, 4);
        Matrix m2 = new Matrix(4, 3);
        for (int i = 0; i < m1.getRows(); ++i)
            for (int j = 0; j < m1.getColumns(); ++j)
                m1.setValue(i, j, new Random().nextDouble());
        for (int i = 0; i < m2.getRows(); ++i)
            for (int j = 0; j < m2.getColumns(); ++j)
                m2.setValue(i, j, new Random().nextDouble());
        m1.print();
        m2.print();
        m1.mul(2);
        m1.print();
        Matrix m3 = m1.add(m2);
        //m3.print();
        Matrix m4 = m1.mul(m2);
        m4.print();
        System.out.println("-----------------------------------------------------------");
    }
    public static void test4(){
        System.out.println("Задание 4");
        Author a = new Author("Ф.М. Достоевский", "M", "godBF@yandex.ru");
        Book b = new Book("Братья Карамазовы", a, 2013);
        System.out.println(b.getAuthor());
        b.setYear(1885);
        System.out.println(b);
        System.out.println("-----------------------------------------------------------");
    }
    public static void test5(){
        System.out.println("Задание 5");
        PizzaOrder pizzaOrder = new PizzaOrder("4 сыра", PizzaOrder.Size.BIG, true, "Предтеченсая 33");
        pizzaOrder.setName("Пицбургер");
        pizzaOrder.order();
        pizzaOrder.cancel();
        pizzaOrder.setAdress("Ярославская 101");
        System.out.println(pizzaOrder);
        System.out.println("-----------------------------------------------------------");
    }
    public static void test6(){
        System.out.println("Задание 6");
        FigureUtil.draw(new Triangle());
        System.out.println(FigureUtil.perimeter(new Circle1()));
        System.out.println("-----------------------------------------------------------");
    }
}
