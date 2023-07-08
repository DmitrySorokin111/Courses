package reflection;

import annotation.DataContainer;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionTest {

    @Test
    void test1() {
        //Task 1

        DataContainer actual = MyClass.createDataContainer(new Date(2023, Calendar.JANUARY, 1),
                1, "abc", 'c');
        DataContainer expexcted = new DataContainer();

        assertEquals(expexcted.getCharValue(), actual.getCharValue());
        assertEquals(expexcted.getStrValue(), actual.getStrValue());
        assertEquals(expexcted.getIntValue(), actual.getIntValue());

        //Task 2

        actual.setIntValue(13);
        actual.setStrValue("xml");
        actual.setCharValue('g');

        expexcted = new DataContainer(13, "xml", 'g');

        //Task 3

        Class<DataContainer> clazz = DataContainer.class;
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                assertEquals(field.get(expexcted), field.get(actual));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}