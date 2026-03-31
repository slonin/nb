package oop.pets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Кошка " + this.getName() + " ест влажный корм");
    }

    @Override
    void behave() {
        System.out.println("Кошка " + this.getName() + " играет");
    }
}
