package generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void test1() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; ++i)
            list.add(i);

        System.out.println(Task1.countEven(list));
    }

    public static void test2() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; ++i)
            list.add(i);

        System.out.println(list);

        Task2.swap(list, 0, 2);

        System.out.println(list);
    }

    public static void test3() {
        ServiceExecutorUtil<Integer, Double> serviceExecutor1 = new ServiceExecutorUtil<>(new ServiceA(),
                new ServiceARequestValidator(), new ServiceAResponseValidator());

        serviceExecutor1.execute(1);

        ServiceExecutorUtil<String, String> serviceExecutor2 = new ServiceExecutorUtil<>(new ServiceB(),
                new ServiceBRequestValidator(), new ServiceBResponseValidator());

        serviceExecutor2.execute("yes");

        ServiceExecutorUtil<Integer, Double> serviceExecutor3 = new ServiceExecutorUtil<>(new ServiceA(),
                new ServiceARequestValidator(), new ServiceAResponseValidator());

        serviceExecutor3.execute(100);
    }
}
