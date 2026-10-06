package func_interfaces_stream_api;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
    public static List<String> filterStrings(List<String> list) {
        return list.stream().filter(str -> str.length() > 5).toList();
    }

    public static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 5 == 0).toList();
    }

    public static List<Integer> convertStringsToLength(List<String> strings) {
        return strings.stream().map(String::length).toList();
    }

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream().map(x -> x * x).toList();
    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        return list.stream().distinct().toList();
    }

    public static Integer findMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).orElse(null);
    }

    public static Integer findMin(List<Integer> numbers) {
        return numbers.stream().min(Integer::compareTo).orElse(null);
    }

    public static Integer getSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(x -> x).sum();
    }

    public static String findFirstEntry(List<String> strings) {
        return strings.stream().filter(str -> str.startsWith("Б")).toList().getFirst();
    }

    public static <T> boolean isSatisfyCondition(List<T> list, Predicate<T> condition) {
        return list.stream().anyMatch(condition);
    }

    public static Map<Character, List<String>> groupByFirstChar(List<String> strings) {
        return strings.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
    }

    public static Map<String, List<Integer>> groupByParity(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "Четные" : "Нечетные"));
    }

    public static double getAverageValue(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.averagingDouble(x -> x));
    }
}
