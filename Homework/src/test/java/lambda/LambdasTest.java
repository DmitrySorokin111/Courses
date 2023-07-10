package lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdasTest {
    private static final List<Sounding> ANIMALS = new ArrayList<>();

    @Test
    void test1() {
        //Tasks 1 - 4

        ANIMALS.add(new Cat());
        ANIMALS.add(new Dog());
        ANIMALS.add(new Cow());

        for (Sounding animal : ANIMALS) {
            animal.sound();
        }
    }

    @Test
    void test2() {
        //Task 5

        Sounding mouse = new Sounding() {
            @Override
            public void sound() {
                System.out.println("Squeak");
            }
        };
        ANIMALS.add(mouse);

        assertEquals(mouse, ANIMALS.get(ANIMALS.size() - 1));

        for (Sounding animal : ANIMALS) {
            animal.sound();
        }
    }

    @Test
    void test3() {
        //Task 6

        Sounding duck = () -> System.out.println("Quack");
        ANIMALS.add(duck);

        assertEquals(duck, ANIMALS.get(ANIMALS.size() - 1));

        for (Sounding animal : ANIMALS) {
            animal.sound();
        }
    }

    @Test
    void test4() {
        //Task 7

        ANIMALS.add(Crow::sound);

        for (Sounding animal : ANIMALS) {
            animal.sound();
        }
    }
}