package if_else_switch_for_while;

import java.util.Scanner;

public class ContinueBreakSolver {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        sumBeforeFirstNegative();
        ignoreNumbers();
        onlyPositiveNumbers();
        untilStop();
    }

    static void sumBeforeFirstNegative() {
        int sum = 0;

        while (true) {
            System.out.print("Введите число ");
            int number = SCANNER.nextInt();
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
            System.out.print("Введите число ");
            int number = SCANNER.nextInt();

            if (number == 0) {
                return;
            }

            if (number < 0) continue;

            System.out.println(number);
        }
    }

    static void untilStop() {
        while (true) {
            System.out.print("Введите строку ");
            String string = SCANNER.nextLine();

            if (string.equals("stop")) break;
        }

        System.out.println("Программа остановлена");
    }
}
