package annotation;
/*
Task 4
Task 5
*/
@NewInheritantAnnotation("Child Class")
public class ChildClass extends BaseClass {
    @Override
    @NewRepeatableAnnotation(value = 3)
    @NewRepeatableAnnotation(value = 4)
    public void baseMethod(DataContainer container) {
    }
}
