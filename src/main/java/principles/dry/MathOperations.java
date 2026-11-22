package principles.dry;

import java.util.Arrays;

public class MathOperations {
    /**
     * @deprecated используйте {@link #addNumbers(int...)}
     */
    @Deprecated
    public int add(int a, int b) {
        return addNumbers(a + b);
    }

    /**
     * @deprecated используйте {@link #addNumbers(int...)}
     */
    @Deprecated
    public int addThreeNumbers(int a, int b, int c) {
        return addNumbers(a + b + c);
    }

    /**
     * @deprecated используйте {@link #addNumbers(int...)}
     */
    @Deprecated
    public int addFourNumbers(int a, int b, int c, int d) {
        return addNumbers(a + b + c + d);
    }

    public int addNumbers(int... numbers) {
        return Arrays.stream(numbers).sum();
    }


}