package _reflection_;

import _annotations_.*;

import java.lang.reflect.Method;
@InheritedAnn(dayOfWeek = 4)
public class MyClass {
    public Parent task1(int intVal, String str) throws Exception {
        Parent.dataContainer.setIntValue(intVal);
        Parent.dataContainer.setStrValue(str);

        Class<?> clazz = MyClass.class;

//        Method method = clazz.getDeclaredMethod("task1", int.class, String.class);

        InheritedAnn annotation = clazz.getAnnotation(InheritedAnn.class);
        int dayOfWeek = annotation.dayOfWeek();

        if (dayOfWeek == 1) {
            System.out.println("creating Child1");
            return new Child1();
        } else if (dayOfWeek == 4) {
            System.out.println("creating Child2");
            return new Child2();
        } else {
            System.out.println("creating Parent");
            return new Parent();
        }
    }
}
