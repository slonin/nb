package access_modifiers;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return MathConstants.PI * r * r;
    }

    static double calculateCircumference(double r) {
        return 2 * MathConstants.PI * r;
    }
}
