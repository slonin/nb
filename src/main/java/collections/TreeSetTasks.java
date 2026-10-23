package collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTasks {
//    Задача 1:
//    Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

//    Задача 2:
//    Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.

//    Задача 3:
//    Найдите ближайшее большее и меньшее число к заданному в TreeSet.

    static void addToTreeSet(Set<Integer> set, int number) {
        set.add(number);
    }

    static void main() {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(5, 1, 4, 10, 3));
        addToTreeSet(numbers, 5); // Не добавится, т.к. TreeSet не поддерживает дубликаты
        addToTreeSet(numbers, 7);
        Utils.printValue(numbers); // выводятся отсортированными

        Utils.printValue(numbers.higher(20)); // null
        Utils.printValue(numbers.higher(2)); // 3
        Utils.printValue(numbers.lower(13)); // 10
    }
}
