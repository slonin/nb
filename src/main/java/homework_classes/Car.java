package homework_classes;

public class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void print() {
        System.out.println("Автомобиль марки " + this.brand + ", выпущен в " + this.year);
    }
}
