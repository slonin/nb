package collections;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
//    Задача 1:
//    Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

    static void main() {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(1);
        numbers.offer(100);
        numbers.offer(234);
        numbers.offer(55);
        numbers.offer(78);

        while (!numbers.isEmpty()) {
            Utils.printValue(numbers.poll());
        }
    }

}
