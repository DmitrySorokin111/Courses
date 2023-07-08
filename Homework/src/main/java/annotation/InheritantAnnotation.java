package annotation;
/*
Task 1
*/
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface InheritantAnnotation {
    int dayOfWeek() default 0;
}

