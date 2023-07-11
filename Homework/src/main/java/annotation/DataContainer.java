package annotation;
/*
Task 3
*/
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DataContainer {
    private int intValue;
    private String strValue;
    private char charValue;
}
