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

@NewInheritantAnnotation("Base Class")
class BaseClass {
    @NewRepeatableAnnotation(value = 1)
    @NewRepeatableAnnotation(value = 2)
    public void baseMethod(DataContainer container) { }
}

@NewInheritantAnnotation("Child Class")
class ChildClass extends BaseClass {
    @Override
    @NewRepeatableAnnotation(value = 3)
    @NewRepeatableAnnotation(value = 4)
    public void baseMethod(DataContainer container) { }
}
