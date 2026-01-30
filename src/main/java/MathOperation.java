class MathOperation {
     static void main(String[] args) {
        int addResult = add(1, 2);
        int subtractResult = subtract(3, 5);
        int multiplyResult = multiply(8, 13);
        double divideResult = divide(21, 34);
        int maxNumber = findMax(5, 7);
        int diff = difference(5, 15);
        double area = squareArea(4);
        int perimeter = squarePerimeter(5);
        double minutes = convertSecondsToMinutes(45);
        double anotherMinutes = convertSecondsToMinutes(320);
        double speed = averageSpeed(100, 32);
        double wrongSpeed = averageSpeed(100, 0);
        double hypotenuse = findHypotenuse(3, 7);
        double wrongHypotenuse = findHypotenuse(0, -3);
        double radius = circleCircumference(3);
        double anotherRadius = circleCircumference(5.5);
        double percent = calculatePercentage(200, 25);
        double wrongPercent = calculatePercentage(0, 25);
        double far = celsiusToFahrenheit(36);
        double cel = fahrenheitToCelsius(96.8);

        System.out.println(addResult);
        System.out.println(subtractResult);
        System.out.println(multiplyResult);
        System.out.println(divideResult);
        System.out.println(maxNumber);
        System.out.println(diff);
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(minutes);
        System.out.println(anotherMinutes);
        System.out.println(speed);
        System.out.println(hypotenuse);
        System.out.println(radius);
        System.out.println(anotherRadius);
        System.out.println(percent);
        System.out.println(far);
        System.out.println(cel);
        System.out.println(wrongSpeed);
        System.out.println(wrongHypotenuse);
        System.out.println(wrongPercent);

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / (double) y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static double squareArea(int side) {
        return Math.pow(side, 2);
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            throw new Error("Время не может быть 0");
        }
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new Error("Значения аргументов должны быть больше 0");
        }
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new Error("Total не может быть 0");
        }
        return part * 100 / total;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 /9;
    }
}

