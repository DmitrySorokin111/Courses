package _annotations_;
/*
Task 1
*/
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface InheritedAnn {
    int dayOfWeek() default 1;
}
