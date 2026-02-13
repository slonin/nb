package if_else_switch_for_while;

import java.util.Scanner;

public class SwitchSolver {
    public static void main(String[] args) {
        printDayOfWeek();
        printTicketPrice();
        printScore();
        printCommands();
        simpleCalculator();
    }

    static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня ");
        int day = scanner.nextInt();
        String result = "";

        switch (day) {
            case 1 -> result = "Понедельник";
            case 2 -> result = "Вторник";
            case 3 -> result = "Среда";
            case 4 -> result = "Четверг";
            case 5 -> result = "Пятница";
            case 6 -> result = "Суббота";
            case 7 -> result = "Воскресенье";
            default -> result = "Некорректный ввод";
        }

        System.out.println(result);
    }

    static void printTicketPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня ");
        int day = scanner.nextInt();
        String result = "";

        switch (day) {
            case 1,2,3,4,5 -> result = "300 рублей";
            case 6,7 -> result = "450 рублей";
            default -> result = "Некорректный ввод";
        }

        System.out.println(result);
    }

    static void printScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку ");
        int score = scanner.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("Такой оценки не существует");

            return;
        }

        String textScore = "F";

        switch (score / 10) {
            case 10,9 -> textScore = "A";
            case 8 -> textScore = "B";
            case 7 -> textScore = "C";
            case 6 -> textScore = "D";
        }

        System.out.println(textScore);
    }

    static void printCommands(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду ");
        String command = scanner.nextLine();
        String message = "";

        switch (command) {
            case "start" -> message = "Система запущена";
            case "stop" -> message = "Система остановлена";
            case "restart" -> message = "Система перезапущена";
            case "status" -> message = "Текущий статус 200";
            default -> message = "Неизвестная команда";
        }

        System.out.println(message);
    }

    static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число ");
        int secondNumber = scanner.nextInt();
        System.out.print("Введите операцию ");
        // оказывается надо очищать буфер так как nextLine() подхватывает перенос строки из предыдущего nextInt()
        scanner.nextLine();
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+" -> result = firstNumber + secondNumber;
            case "-"-> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println("Деление на ноль не выполняется");

                    return;
                }

                result = firstNumber / (double) secondNumber;
            }
        }

        System.out.println(result);
    }
}
