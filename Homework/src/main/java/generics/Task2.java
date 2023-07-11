package generics;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void swap(List<?> list, int index1, int index2) {
        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            System.out.println("Invalid index");
            return;
        }

//        Collections.swap(list, index1, index2);
        // или
        swapHelper(list, index1, index2);
    }

    private static <T> void swapHelper(List<T> list, int index1, int index2)
    {
        T elem1 = list.get(index1);
        T elem2 = list.get(index2);

        list.set(index1, elem2);
        list.set(index2, elem1);
    }
}
