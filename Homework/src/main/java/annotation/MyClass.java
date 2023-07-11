package annotation;
/*
Task 2
*/
public class MyClass {
    @RepeatableAnnotation(hours = 1, priority = 1, description = "Method 1")
    @RepeatableAnnotation(hours = 2, priority = 2, description = "Method 2")
    public void myMethod() {
        System.out.println("Method");
    }
}
