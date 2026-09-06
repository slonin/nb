package collections;

import java.util.ArrayDeque;

public class ArrayDequeTasks {
//    Задача 1:
//    Создайте ArrayDeque, добавьте 5 элементов и выведите их.

//    Задача 2:
//    Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.

//    Задача 3:
//    Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.

    static void main() {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.add(200);
        numbers.add(204);
        numbers.add(2440);
        numbers.add(3400);
        numbers.add(1200);

        Utils.printValue(numbers);

        numbers.clear();

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);

        while (!numbers.isEmpty()) {
            Utils.printValue(numbers.pop());
        }

        numbers.addFirst(1);
        numbers.add(5);
        numbers.addLast(3);
        numbers.addLast(7);

        Utils.printValue(numbers);
        numbers.removeFirst();
        numbers.removeLast();
        Utils.printValue(numbers);
    }
}
