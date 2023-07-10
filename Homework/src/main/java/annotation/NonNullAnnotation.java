package annotation;
/*
Task 6
*/
import lombok.NonNull;
public class NonNullAnnotation {
    public void method(@NonNull String param){
        System.out.println(param);
    }
}
