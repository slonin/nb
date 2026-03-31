package oop.farm;

public class Chicken extends Pet {
    public Chicken(String name) {
        super(name);
    }

    @Override
    void care() {
        System.out.println("Курица " + this.getName() + " нуждается в кормушке");
    }

    @Override
    void produce() {
        System.out.println("Курица " + this.getName() + " несет яйца");
    }

    @Override
    void feed() {
        System.out.println("Курица " + this.getName() + " ест зерно");
    }
}
