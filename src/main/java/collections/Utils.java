package collections;

import java.util.Collection;
import java.util.NoSuchElementException;

public class Utils {
    static void printValue(Object value) {
        System.out.println(value);
    }

    static void printWithText(String text, Object value) {
        System.out.printf(text, value);
    }

    static void requireNotEmpty(Collection<?> collection) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Коллекция пуста");
        }
    }
}
