package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreams {
    public static void test1() {
        //Task 1

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; ++i)
            list.add(Math.abs(new Random().nextInt()%20));
        System.out.println(list);

        double avg = list.stream()
                .mapToInt(x -> x)
                .filter(x -> x >= 10 && x < 100)
                .sorted()
                .average()
                .orElse(0);

        System.out.println(avg);
    }

    public static void test2() {
        //Task 2

        Stream<String> stringStream = Stream.of("Alpha", "Bravo", "Charlie");

        Stream<StreamContainer> containerStream = stringStream.map(s ->{
           long count = Math.abs(new Random().nextLong() % 100);
           return new StreamContainer(s, count);
        });

        Map<Long, String> countToNameMap = containerStream
                .peek(s -> System.out.println(s.toString()))
                .collect(Collectors.toMap(
                        StreamContainer::getCount,
                        StreamContainer::getName
                ));

        countToNameMap.forEach((count, name) -> System.out.println(count + ": " + name));
    }

    public static void test3() {
        //Task 3

        Map<String, List<Integer>> strListMap = new HashMap<>();
        strListMap.put("A", Arrays.asList(1, 2, 3));
        strListMap.put("B", Arrays.asList(4, 5, 6));
        strListMap.put("C", Arrays.asList(7, 8, 9));

        Stream<StreamContainer> streamContainer = strListMap
                .entrySet()
                .stream()
                .flatMap(entry -> entry
                        .getValue()
                        .stream()
                        .map(value -> new StreamContainer(entry.getKey(), value)));

        List<StreamContainer> containerList = streamContainer.toList();

        long count = containerList.size();
        System.out.println("Количество элементов: " + count);
    }

    public static void test4() {
        //Task 5

        String binaryString = "1010101010";

        Stream<Boolean> booleanStream = binaryString.chars().mapToObj(ch -> ch == '1');

        boolean result = booleanStream.reduce(true, (a, b) -> a && b);

        System.out.println("Результат: " + result);
    }
}
