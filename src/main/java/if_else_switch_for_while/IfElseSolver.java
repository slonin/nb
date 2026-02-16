package if_else_switch_for_while;

import java.util.Scanner;

public class IfElseSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkPositive();
        printMaxNumber();
        printScore();
        checkParity();
        detectDiscount();
        printTestScore();
    }

    static void checkPositive() {
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        String result;

        if (number > 0) {
            result = "Число положительное";
        } else if (number < 0) {
            result = "Число отрицательное";
        } else {
            result = "Число равно нулю";
        }

        System.out.println(result);
    }

    static void printMaxNumber() {
        System.out.print("Введите первое число ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Числа равны");

            return;
        }

        int maxNumber;
//      Вместо if else использовал тернарник
        maxNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
//      Вариант с Math.max()
//      maxNumber = Math.max(firstNumber, secondNumber);

        System.out.printf("Наибольшее число %d", maxNumber);
    }

    static void printScore() {
        System.out.print("Введите оценку ");
        int score = scanner.nextInt();

        if (score > 5 || score < 1) {
            System.out.println("Такой оценки не существует");

            return;
        }

        String textScore = "Неудовлетворительно";

        switch (score) {
            case 5 -> textScore = "Отлично";
            case 4 -> textScore = "Хорошо";
            case 3 -> textScore = "Удовлетворительно";
        }

        System.out.println(textScore);
    }

    static void checkParity() {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        String parity = number % 2 == 0 ? "Число четное" : "Число нечетное";

        System.out.println(parity);
    }

    static void detectDiscount() {
        System.out.print("Введите возраст ");
        int age = scanner.nextInt();
        String discount ="без скидки";

        if (age <= 0) {
            System.out.println("Некорректный возраст");

            return;
        }

        if (age < 18) {
            discount = "25%";
        } else if (age >= 65) {
            discount = "30%";
        }

        System.out.println(discount);
    }

    static void printTestScore() {
        System.out.print("Введите количество баллов ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Оценка вне допустимого диапазона");

            return;
        }

        String textScore = "Неудовлетворительно";

        if (score >= 90) {
            textScore = "Отлично";
        } else if (score >= 75) {
            textScore = "Хорошо";
        } else if (score >= 60) {
            textScore = "Удовлетворительно";
        }

        System.out.printf("Результат теста %s", textScore);
    }
}
