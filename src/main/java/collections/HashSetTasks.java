package collections;

import java.util.*;

public class HashSetTasks {
//    Задача 1:
//    Создайте HashSet из 5 чисел и выведите его содержимое.

//    Задача 2:
//    Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

//    Задача 3:
//    Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

    //    Задача 4:
//    Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.

    static Set<String> removeDuplicates(List<String> list) {
        return new HashSet<>(list);
    }

    static <T> void checkValue(Set<T> names, T value) {
        if (names.contains(value)) {
            Utils.printWithText("%s содержится в коллекции%n", value);
        } else {
            Utils.printWithText("%s не содержится в коллекции%n", value);
        }
    }

    static void main() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(3);
        numbers.add(43);
        numbers.add(5);

        for (Integer number : numbers) {
            Utils.printValue(number);
        }

        for (int i = 10; i < 20; i++) {
            numbers.add(i);
        }

        checkValue(numbers, 5);// true
        checkValue(numbers, 100); // false

        ArrayList<String> stringsWithDuplicates = new ArrayList<>(Arrays.asList("Alex", "Alex", "Peter", "John", "Peter", "Daniil"));

        Set<String> uniqueStrings = removeDuplicates(stringsWithDuplicates);

        Utils.printValue(uniqueStrings);

        checkValue(uniqueStrings, "Daniil");
        checkValue(uniqueStrings, "Alexey");

    }
}
