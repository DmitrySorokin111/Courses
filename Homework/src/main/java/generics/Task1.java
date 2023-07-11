package generics;

import java.util.Collection;

public class Task1 {
    public static <T extends Number> int countEven(Collection<T> collection) {
        int count = 0;

        for (T elem : collection)
            if (elem.doubleValue() % 2 == 0)
                ++count;

        return count;
    }
}
