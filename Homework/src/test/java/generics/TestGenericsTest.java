package generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestGenericsTest {

    @Test
    void test1()
    {
        int max = 34;
        int expected = 34 / 2;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < max; ++i)
            list.add(i);

        int actual = Task1.countEven(list);

        assertEquals(expected, actual);
    }

    @Test
    void test2()
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; ++i)
            list.add(i);

        System.out.println(list);

        List<Integer> prevList = new ArrayList<>(list);

        Task2.swap(list, 0, 2);

        assertEquals(prevList.get(2), list.get(0));
        assertEquals(prevList.get(0), list.get(2));

        System.out.println(list);
    }

    @Test
    void test3()
    {
        ServiceExecutorUtil<Integer, Double> serviceExecutor1 = new ServiceExecutorUtil<>(new ServiceA(),
                new ServiceARequestValidator(), new ServiceAResponseValidator());

        serviceExecutor1.execute(1); // response =

        ServiceExecutorUtil<String, String> serviceExecutor2 = new ServiceExecutorUtil<>(new ServiceB(),
                new ServiceBRequestValidator(), new ServiceBResponseValidator());

        serviceExecutor2.execute("yes");

        ServiceExecutorUtil<Integer, Double> serviceExecutor3 = new ServiceExecutorUtil<>(new ServiceA(),
                new ServiceARequestValidator(), new ServiceAResponseValidator());

        serviceExecutor3.execute(100);
    }
}