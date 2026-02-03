package homework_classes;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(int discount) {
        this.price = this.price - this.price * discount / (double) 100;
    }

    void printInfo() {
        System.out.println("Товар: " + this.name + ". Стоимостью: " + this.price + " рублей");
    }

}
