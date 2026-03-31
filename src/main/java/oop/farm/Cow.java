package oop.farm;

public class Cow extends Pet {
    public Cow(String name) {
        super(name);
    }

    @Override
    void care() {
        System.out.println("Корова " + this.getName() + " пасется");
    }

    @Override
    void produce() {
        System.out.println("Корова " + this.getName() + " дает молоко");
    }

    @Override
    void feed() {
        System.out.println("Корова " + this.getName() + " ест траву");
    }
}
