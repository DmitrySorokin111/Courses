package annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationsTest {

    @Test
    void test1() {
        Class<?> childClass = Child.class;
        InheritantAnnotation inheritance = childClass.getAnnotation(InheritantAnnotation.class);
        if (inheritance != null) {
            int dayOfWeek = inheritance.dayOfWeek();
            System.out.println("Day of week: " + dayOfWeek);
        }
    }

    @Test
    void test2() {
        MyClass myObj = new MyClass();
        try {
            Class<?> myClass = myObj.getClass();
            for (java.lang.reflect.Method method : myClass.getMethods()) {
                MyRepeatedAnnotations repeatedAnnotations = method.getAnnotation(MyRepeatedAnnotations.class);
                if (repeatedAnnotations != null) {
                    for (RepeatableAnnotation annotation : repeatedAnnotations.value()) {
                        int hours = annotation.hours();
                        int priority = annotation.priority();
                        String description = annotation.description();
                        System.out.println("Hours: " + hours + ", Priority: " + priority + ", Description: " + description);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void test3() {
        DataContainer container = new DataContainer();
        container.setIntValue(10);
        container.setStrValue("Hello");
        container.setCharValue('a');
        System.out.println(container);
    }

    @Test
    void test4() {
        Class<?> baseClass = BaseClass.class;
        NewInheritantAnnotation baseInheritance = baseClass.getAnnotation(NewInheritantAnnotation.class);
        if (baseInheritance != null) {
            String baseValue = baseInheritance.value();
            System.out.println("Base Class: " + baseValue);
        }

        Class<?> childClass = ChildClass.class;
        NewInheritantAnnotation childInheritance = childClass.getAnnotation(NewInheritantAnnotation.class);
        if (childInheritance != null) {
            String childValue = childInheritance.value();
            System.out.println("Child Class: " + childValue);
        }
    }

    @Test
    void test5() {
        ChildClass childObj = new ChildClass();
        try {
            Class<?> childClass = childObj.getClass();
            for (java.lang.reflect.Method method : childClass.getMethods()) {
                NewMyRepeatedAnnotations repeatedAnnotations = method.getAnnotation(NewMyRepeatedAnnotations.class);
                if (repeatedAnnotations != null) {
                    for (NewRepeatableAnnotation annotation : repeatedAnnotations.value()) {
                        int value = annotation.value();
                        System.out.println("Value: " + value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void test6() {
        NonNullAnnotation obj = new NonNullAnnotation();
        obj.method(null);
    }
}