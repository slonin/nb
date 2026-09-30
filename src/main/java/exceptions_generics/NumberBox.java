package exceptions_generics;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {
    private List<T> numbers = new ArrayList<>();

    public void addNumber(T number) {
        numbers.add(number);
    }

    public double getSum() {
        double sum = 0;

        for (T number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }
}
