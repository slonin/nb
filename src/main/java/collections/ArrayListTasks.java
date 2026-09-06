package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTasks {
//    Задача 1:
//    Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

//    Задача 2:
//    Напишите программу, которая выводит все чётные числа из ArrayList.

//    Задача 3:
//    Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

//    Задача 4:
//    Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.

//    Задача 5:
//    Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.


    static void printEvenNumbers(ArrayList<Integer> numbers) {
        Utils.requireNotEmpty(numbers);

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                Utils.printWithText("Число %d - четное%n", number);
            }
        }
    }

    static void printTheLongestString(ArrayList<String> strings) {
        Utils.requireNotEmpty(strings);

        String theLongest = strings.getFirst();

        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > theLongest.length()) {
                theLongest = strings.get(i);
            }
        }

        Utils.printWithText("Самая длинная строка - %s%n", theLongest);
    }

    static void printSum(ArrayList<Integer> numbers) {
        Integer sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        Utils.printWithText("Сумма всех элементов коллекции: %d%n", sum);
    }

    static void findMaxNumber(ArrayList<Integer> numbers) {
        Utils.requireNotEmpty(numbers);

        Integer maxValue = numbers.getFirst();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > maxValue) {
                maxValue = numbers.get(i);
            }
        }

        Utils.printWithText("Максимальное число в коллекции: %d%n", maxValue);
    }

    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        numbers.add(6);
        numbers.forEach(Utils::printValue);
        printEvenNumbers(numbers);

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("qwerty", "loooooong", "12345", "asdf12345"));

        printTheLongestString(strings); // loooooong
        printSum(numbers); // 21
        findMaxNumber(numbers); // 6

        numbers.clear();

        findMaxNumber(numbers); // error
    }


}
