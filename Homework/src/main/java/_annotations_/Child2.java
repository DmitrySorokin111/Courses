package _annotations_;

import lombok.NonNull;

/*
Task 4, 5, 6
 */
@InheritedAnn(dayOfWeek = 4)
public class Child2 extends Parent{
    @RepeatedAnn(hours = 1, priority = 1, description = "First")
    @RepeatedAnn(hours = 111, priority = 4, description = "Third")
    public static DataContainer method1(@NonNull int intVal, String str) {
        System.out.println("Child2: method1");
        dataContainer = new DataContainer(intVal, str);
        return new DataContainer(intVal, str);
    }

    @RepeatedAnn(hours = 3, priority = 1, description = "Almost First")
    @RepeatedAnn(hours = 5, priority = 2, description = "Second")
    public static DataContainer method2(@NonNull int intVal, String str) {
        System.out.println("Child2: method2");
        dataContainer = new DataContainer(intVal, str);
        return new DataContainer(intVal, str);
    }

//    @RepeatedAnn(hours = 5, priority = 2, description = "Second")
//    public DataContainer method3(int intVal, String str) {
//        return new DataContainer(intVal, str);
//    }
}
