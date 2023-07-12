package _annotations_;

import lombok.NonNull;

/*
Task 4, 5, 6
 */
public class Child1 extends Parent {
    @RepeatedAnn(hours = 0, priority = 3, description = "clk")
    public static DataContainer method(@NonNull int intVal, String str) {
        dataContainer = new DataContainer(intVal, str);
        return new DataContainer(intVal, str);
    }
}
