package if_else_switch_for_while;

import java.util.Scanner;

public class WhileSolver {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        printFactorial();
        printEvenNumbers();
        timer();
        askPositive();
        checkPassword();
        printNumbers();
        exitProgram();
        printNumbersCount();
    }

    static void printFactorial() {
        System.out.print("Введите число ");
        int number = SCANNER.nextInt();

        if (number < 0) {
            System.out.println("Введите положительное число");

            return;
        }

        int result = 1;
        int i = 1;

        while (i <= number) {
            result *= i;
            i++;
        }

        System.out.println(result);
    }

    static void printEvenNumbers() {
        System.out.print("Введите число ");
        int number = SCANNER.nextInt();

        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }
    }

    static void timer() {
        System.out.print("Введите число ");
        int number = SCANNER.nextInt();

       while (number >= 1) {
           System.out.println(number);
           number--;
       }
    }

    static void askPositive() {
        int number;
        do {
            System.out.print("Введите положительное число ");
            number = SCANNER.nextInt();
        } while (number <= 0);

        System.out.println("Вы ввели положительное число");
    }

    static void checkPassword() {
        String userPassword = "qwerty123";
        String password;

        do {
            System.out.print("Введите пароль ");
            password = SCANNER.nextLine();
        } while (!userPassword.equals(password));

        System.out.println("Пароль принят");
    }

    static void printNumbers() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    static void exitProgram() {
        String command;

        do {
            System.out.print("Введите команду ");
            command = SCANNER.nextLine();
        } while(!command.equals("exit"));

        System.out.print("Программа завершена");
    }

    static void printNumbersCount() {
        System.out.print("Введите число ");
        int number = Math.abs(SCANNER.nextInt());

        if (number == 0) {
            System.out.println(1);
            return;
        }

        int i = 0;

        do {
            number = number / 10;
            i++;
        } while(number > 0);

        System.out.println(i);
    }
}
