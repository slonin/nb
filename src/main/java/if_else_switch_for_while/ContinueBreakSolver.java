package if_else_switch_for_while;

import java.util.Scanner;

public class ContinueBreakSolver {
    public static void main(String[] args) {
        sumBeforeFirstNegative();
        ignoreNumbers();
        onlyPositiveNumbers();
        untilStop();
    }

    static void sumBeforeFirstNegative() {
        int sum = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число ");
            int number = scanner.nextInt();
            if (number < 0) break;
            sum += number;
        }

        System.out.println(sum);
    }

    static void ignoreNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;

            System.out.println(i);
        }
    }

    static void onlyPositiveNumbers() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число ");
            int number = scanner.nextInt();

            if (number < 0) continue;

            System.out.println(number);
        }
    }

    static void untilStop() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку ");
            String string = scanner.nextLine();

            if (string.equals("stop")) break;
        }

        System.out.println("Программа остановлена");
    }
}
