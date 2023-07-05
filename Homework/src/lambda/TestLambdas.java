package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestLambdas {
    private static List<Sounding> animals = new ArrayList<>();
    public static void test1() {
        //Tasks 1 - 4
        animals.add(new lambda.Cat());
        animals.add(new lambda.Dog());
        animals.add(new lambda.Cow());

        for (Sounding animal : animals) {
            animal.sound();
        }
    }

    public static void test2() {
        //Task 5

        Sounding mouse = new Sounding() {
            @Override
            public void sound() {
                System.out.println("Squeak");
            }
        };
        animals.add(mouse);

        for (Sounding animal : animals) {
            animal.sound();
        }
    }

    public static void test3() {
        //Task 6

        Sounding duck = () -> System.out.println("Quack");
        animals.add(duck);

        for (Sounding animal : animals) {
            animal.sound();
        }
    }

    public static void test4() {
        //Task 7

        animals.add(Clazz::sound);

        for (Sounding animal : animals) {
            animal.sound();
        }
    }
}
