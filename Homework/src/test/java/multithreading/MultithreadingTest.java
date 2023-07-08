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

        int increasersCount = 3;
        Resource resource = new Resource(106);

        int expected = resource.field + (increasersCount - 1) * 100;
        int actual = TestMultithreading.test2(resource, increasersCount);

        assertEquals(expected, actual);
    }
}