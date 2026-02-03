package homework_classes;

public class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return  this.y;
    }

    void setX(double newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("Текущие координаты (" + this.x + ", " + this.y + ")");
    }
}
