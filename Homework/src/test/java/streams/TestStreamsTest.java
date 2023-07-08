package streams;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestStreamsTest {

    @Test
    void test1() {
        //Task 1

        List<Integer> list = new ArrayList<>();

        for (int i = 5; i != 15; ++i)
            list.add(i);

        Double actual = TestStreams.test1(list);
        Double expected = 12.0;

        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        //Task 3

        int actual = TestStreams.test2();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        //Task 4

        Map<String, List<Integer>> strListMap = new HashMap<>();
        strListMap.put("A", Arrays.asList(1, 2, 3));
        strListMap.put("B", Arrays.asList(4, 5, 6));
        strListMap.put("C", Arrays.asList(7, 8, 9));

        long actual = TestStreams.test3(strListMap);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        //Task 5

        String binaryString = "1010101010";

        boolean actual = TestStreams.test4(binaryString);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}