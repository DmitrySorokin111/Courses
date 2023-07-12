package _annotations_;
/*
Task 2
*/
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(RepeatedAnns.class)
public @interface RepeatedAnn {
    int hours();
    int priority();
    String description();
}

