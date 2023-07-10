package reflection;

import annotation.DataContainer;

import java.util.Calendar;
import java.util.Date;

public class MyClass {
    public static DataContainer createDataContainer(Date date, int intVal, String str, char character) {
        if (date.before(new Date(2000, Calendar.JANUARY, 1))) {
            return new DataContainer(intVal, str, character);
        } else {
            return new DataContainer();
        }
    }
}
