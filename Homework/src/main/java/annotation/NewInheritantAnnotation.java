package annotation;
/*
Task 4
Task 5
*/
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(NewMyRepeatedAnnotations.class)
@interface NewRepeatableAnnotation {
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface NewMyRepeatedAnnotations {
    NewRepeatableAnnotation[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NewInheritantAnnotation {
    String value() default "Base";
}

