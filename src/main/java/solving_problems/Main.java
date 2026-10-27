package solving_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void updateAge(Person person) {
//        person = new Person(person.getName(), person.getAge() + 1);
        person.setAge(person.getAge() + 1);
    }

    public static void countdown(int n) {
        System.out.println(n);
        if (n > 1) {
            countdown(n - 1);
        }
    }

    private static int balance = 100;

    public static synchronized void withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println("New balance: " + balance);
        }
    }

    static void main() {
        // 1
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2
        int sum = calculateSum(5);
        System.out.println("Sum: " + sum);

        // 3
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }

        // 4
        System.out.println(isPalindrome(null));

        // 5
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());

        // 6
        countdown(5);

        // 7
        Thread t1 = new Thread(() -> withdraw(60));
        Thread t2 = new Thread(() -> withdraw(50));
        t1.start();
        t2.start();

        // 8
        double a = 0.1 * 3;
        double b = 0.3;
        double epsilon = 0.00001;

        if (Math.abs(a - b) < epsilon) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // 9
        String str1 = new String("hello");
        String str2 = new String("hello");
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // 10
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.removeIf(str -> str.startsWith("A"));
        System.out.println(names);
    }
}
