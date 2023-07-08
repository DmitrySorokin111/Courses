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

