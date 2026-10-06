package func_interfaces_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    static void print(Object value) {
        System.out.println(value);
    }

    static void main() {
        MathOperation add = (a, b) -> a + b;
        MathOperation substruct = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> (double) a / b;

        print(add.calculate(1, 4));
        print(substruct.calculate(10, 4));
        print(multiply.calculate(4, 4));
        print(divide.calculate(10, 4));

        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                print("Hello from anonymous class!");
            }
        };

        anonymous.run();

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<String, Integer> getStringLength = String::length;
        Consumer<String> printString = System.out::println;

        print(isEven.test(5));
        print(isEven.test(4));
        print(getStringLength.apply("four"));
        printString.accept("Hello!");

        List<String> strings = new ArrayList<>(List.of("1", "qwerty", "Б52", "Hello!", "Бу", "1", "123", "123", "loooong"));
        List<Integer> numbers = new ArrayList<>(List.of(1, 100, 1, 13, 100, 15, 42));

        print(Streams.filterStrings(strings));
        print(Streams.filterNumbers(numbers));
        print(Streams.convertStringsToLength(strings));
        print(Streams.squareNumbers(numbers));
        print(Streams.removeDuplicates(strings));
        print(Streams.removeDuplicates(numbers));
        print(Streams.findMax(numbers));
        print(Streams.findMin(numbers));
        print(Streams.getSum(numbers));
        print(Streams.findFirstEntry(strings));
        print(Streams.isSatisfyCondition(numbers, x -> x > 50));
        print(Streams.isSatisfyCondition(numbers, x -> x < 0));
        print(Streams.isSatisfyCondition(strings, x -> x.startsWith("q")));
        print(Streams.isSatisfyCondition(strings, x -> x.equals("peace")));
        print(Streams.groupByFirstChar(strings));
        print(Streams.groupByParity(numbers));
        print(Streams.getAverageValue(numbers));
    }
}
