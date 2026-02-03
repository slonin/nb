package homework_classes;

public class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    int getPrice() {
        return this.price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("Ноутбук фирмы " + this.brand + " стоимостью " + this.price + " руб.");
    }
}
