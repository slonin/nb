package if_else_switch_for_while;

import java.util.Scanner;

public class WhileSolver {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Введите положительное число");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();

        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }
    }

    static void timer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();

       while (number >= 1) {
           System.out.println(number);
           number--;
       }
    }

    static void askPositive() {
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите положительное число ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Вы ввели положительное число");
    }

    static void checkPassword() {
        String userPassword = "qwerty123";
        String password;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите пароль ");
            password = scanner.nextLine();
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
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите команду ");
            command = scanner.nextLine();
        } while(!command.equals("exit"));

        System.out.print("Программа завершена");
    }

    static void printNumbersCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = Math.abs(scanner.nextInt());

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
