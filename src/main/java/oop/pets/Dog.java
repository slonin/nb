package oop.pets;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Собака " + this.getName() + " ест сухой корм");

    }

    @Override
    void behave() {
        System.out.println("Собака " + this.getName() + " гуляет");
    }
}
