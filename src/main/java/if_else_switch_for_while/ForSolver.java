package if_else_switch_for_while;

import java.util.Scanner;

public class ForSolver {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    static void printMultiplyTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + i * number );
        }
    }

    static void printIsSimpleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number - 1; i++) {
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
