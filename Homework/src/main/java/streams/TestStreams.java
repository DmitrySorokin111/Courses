package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreams {
    public static Double test1(List<Integer> list) {
        //Task 1

        double avg = list.stream()
                .mapToInt(x -> x)
                .filter(x -> x >= 10 && x < 100)
                .sorted()
                .average()
                .orElse(0);

        return avg;
    }

    public static int test2() {
        //Task 3

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
        return countToNameMap.size();
    }

    public static long test3(Map<String, List<Integer>> strListMap) {
        //Task 4

        Stream<StreamContainer> streamContainer = strListMap
                .entrySet()
                .stream()
                .flatMap(entry -> entry
                        .getValue()
                        .stream()
                        .map(value -> new StreamContainer(entry.getKey(), value)));

        List<StreamContainer> containerList = streamContainer.toList();

        long count = containerList.size();
//        System.out.println("Количество элементов: " + count);
        return count;
    }

    public static boolean test4(String str) {
        //Task 5

        Stream<Boolean> booleanStream = str.chars().mapToObj(ch -> ch == '1');

        boolean result = booleanStream.reduce(true, (a, b) -> a && b);

//        System.out.println("Результат: " + result);
        return result;
    }
}
