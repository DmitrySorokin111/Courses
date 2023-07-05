package annotation;
/*
Task 2
*/
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MyRepeatedAnnotations.class)
public @interface RepeatableAnnotation {
    int hours();
    int priority();
    String description();


}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyRepeatedAnnotations {
    RepeatableAnnotation[] value();
}

class MyClass {
    @RepeatableAnnotation(hours = 1, priority = 1, description = "Method 1")
    @RepeatableAnnotation(hours = 2, priority = 2, description = "Method 2")
    public void myMethod() {
        System.out.println("Method");
    }
}
