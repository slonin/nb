package if_else_switch_for_while;

import java.util.Scanner;

public class ForSolver {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        divideOnThree();
        printSumToN();
        printMultiplyTable();
        printIsSimpleNumber();
        printNumbers();
    }

    static void divideOnThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    static void printSumToN() {
        System.out.println("Введите число ");
        int number = SCANNER.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    static void printMultiplyTable() {
        System.out.println("Введите число ");
        int number = SCANNER.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + i * number );
        }
    }

    static void printIsSimpleNumber() {
        System.out.print("Введите число ");
        int number = SCANNER.nextInt();
        boolean isPrime = true;

        if (number < 2) {
            System.out.println("Не простое");

            return;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Простое" : "Не простое");
    }

    static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
