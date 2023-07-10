package annotation;
/*
Task 4
Task 5
*/
@NewInheritantAnnotation("Base Class")
public class BaseClass {
    @NewRepeatableAnnotation(value = 1)
    @NewRepeatableAnnotation(value = 2)
    public void baseMethod(DataContainer container) {
    }
}
