package homework_classes;

public class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    double calculateCircumference() {
        return (double) 2 * Math.PI * this.radius;
    }
}
