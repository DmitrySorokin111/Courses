package multithreading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultithreadingTest {

    @Test
    void test1() {
        //Task 4, 5

        Resource resource = new Resource(7);

        int expected = resource.field + 18;
        int actual = TestMultithreading.test1(resource);

        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        //Task 7

        Resource resource = new Resource(0); // 1 < val <= 5

        int expected = resource.field;
        int actual = TestMultithreading.test2(resource);

        assertEquals(expected, actual);
    }
}