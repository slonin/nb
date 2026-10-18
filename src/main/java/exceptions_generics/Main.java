package exceptions_generics;

import jdk.jshell.execution.Util;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static void openFile(String path) {
        try {
            FileReader file = new FileReader(path);
            for (String line : file.readAllLines()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
    }

    static double divideNumber(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }

        return (double) a / b;
    }

    static boolean isUserAgeValid(int age) throws InvalidUserAgeException {
        if (age >= 0 && age <= 150) return true;

        throw new InvalidUserAgeException("Невалидный возраст!");
    }

    static boolean isUserEmailValid(String email) {
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) return true;

        throw new InvalidUserEmailException("Невалидный email!");
    }

    static <T> void printArray(T[] array) {
        for (T elem : array) {
            System.out.println(elem);
        }
    }

    static <T> void printList(List<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
    }

    static <T extends Number> double getElementsSum(List<T> list) {
        double sum = 0;

        for (T elem : list) {
            sum += elem.doubleValue();
        }

        return sum;
    }

    static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    static void main() {
        openFile("/Users/daniillonin/IdeaProjects/FP/src/main/java/exceptions_generics/text");
        openFile("somePath");

        System.out.println(divideNumber(4, 3));

        try {
            System.out.println(divideNumber(4, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(isUserAgeValid(18));
        } catch (InvalidUserAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(isUserAgeValid(180));
        } catch (InvalidUserAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(isUserEmailValid("lonindaniil@gmail.com"));
//        System.out.println(isUserEmailValid("lonindaniilgmail.com"));

        Box<Integer> intBox = new Box<>();
        intBox.set(1);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("2");
        System.out.println(strBox.get());

        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"4", "5", "6"};

        printArray(intArray);
        printArray(strArray);

        Pair<Integer, String> pair = new Pair<>();
        pair.setFirstElem(1);
        pair.setSecondElem("str");
        System.out.println(pair.getFirstElem());
        System.out.println(pair.getSecondElem());

        Storage<Integer> numberStorage = new Storage<>(10);
        System.out.println(numberStorage.getElement());

        Storage<String> stringStorage = new Storage<>("text");
        System.out.println(stringStorage.getElement());

        printList(new ArrayList<>(Arrays.asList(1, 2, 3)));

        NumberBox<Integer> box = new NumberBox<>();
        box.addNumber(12);
        box.addNumber(10);
        box.addNumber(8);
        System.out.println(box.getSum());

        System.out.println(getElementsSum(new ArrayList<>(Arrays.asList(1, 2, 3))));

        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        System.out.println(integerList);

        SimpleContainer<String> stringSimpleContainer = new SimpleContainer<>();
        stringSimpleContainer.add("simple");
        System.out.println(stringSimpleContainer.get());

        SimpleContainer<Integer> integerSimpleContainer = new SimpleContainer<>();
        integerSimpleContainer.add(1000);
        System.out.println(integerSimpleContainer.get());

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("first", 1);
        stringIntegerHashMap.put("second", 2);

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(3, "third");
        integerStringHashMap.put(4, "fourth");

        printMap(stringIntegerHashMap);
        printMap(integerStringHashMap);
    }
}
