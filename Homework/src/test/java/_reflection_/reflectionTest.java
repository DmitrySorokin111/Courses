package _reflection_;

import _annotations_.RepeatedAnn;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import _annotations_.*;

import static org.junit.jupiter.api.Assertions.*;

class reflectionTest {

    @Test
    void test1() throws Exception {
        //Task 1

        MyClass myObj = new MyClass();
        _annotations_.Parent obj = myObj.task1(1, "Child2");

        //Task 2

        Class<?> clazz = obj.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        List<PairMethodPriority> methodList = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RepeatedAnns.class)) {
                RepeatedAnns repeatedAnns = method.getAnnotation(RepeatedAnns.class);
                RepeatedAnn[] annotations = repeatedAnns.value();

                for (RepeatedAnn annotation : annotations) {
                    methodList.add(new PairMethodPriority(method, annotation.priority()));
                }
            }
        }
        methodList.sort(Comparator.comparingInt(PairMethodPriority::getPriority));

        int i = 0;

        for (PairMethodPriority pair : methodList) {
            i++;
            pair.getMethod().invoke(obj, i, "test");
        }

        //Task 3

        Class<?> clazz1 = Parent.class;
        Field field = clazz1.getDeclaredField("dataContainer");

        System.out.println(field.get(clazz1));
    }
}