package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {
//    Задача 1:
//    Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

//    Задача 2:
//    Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

//    Задача 3:
//    Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

//    Задача 4:
//    Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
//    Аналогичная логика реализована задаче в ArrayListTasks

//    Задача 5:
//    Используйте ListIterator для прохода по LinkedList в обоих направлениях.

    static void printHeadAndTail(LinkedList<String> strings) {
        Utils.requireNotEmpty(strings);
        Utils.printWithText("Первый элемент: %s%n", strings.getFirst());
        Utils.printWithText("Последний элемент: %s%n", strings.getLast());
    }

    static void main() {
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("string", "qwrqwfr", "12345", "wfwrgwgr", "98765"));
        Utils.printValue(strings);

        strings.clear();

        strings.add("First task");
        strings.add("Second task");
        strings.add("Third task");

        while (!strings.isEmpty()) {
            Utils.printValue(strings.poll());
        }

        for (int i = 1; i < 5; i++) {
            strings.add("string" + i);
        }

        printHeadAndTail(strings);

        ListIterator<String> iterator = strings.listIterator();

        while (iterator.hasNext()) {
            Utils.printValue(iterator.next());
        }

        while (iterator.hasPrevious()) {
            Utils.printValue(iterator.previous());
        }

    }
}
